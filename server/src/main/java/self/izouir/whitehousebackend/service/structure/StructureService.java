package self.izouir.whitehousebackend.service.structure;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import self.izouir.whitehousebackend.entity.structure.Structure;
import self.izouir.whitehousebackend.exception.StructureNotFoundException;
import self.izouir.whitehousebackend.repository.structure.StructureRepository;
import self.izouir.whitehousebackend.util.FileDownloadUtil;
import self.izouir.whitehousebackend.util.FileUploadUtil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class StructureService {
    private final StructureRepository structureRepository;
    private final StructureImageService structureImageService;

    public List<Structure> findAll(String page, String tag, String roomCount) {
        if (!tag.isBlank() && !roomCount.isBlank()) {
            return structureRepository.findAll(Integer.parseInt(page), tag, Short.parseShort(roomCount));
        } else if (!tag.isBlank()) {
            return structureRepository.findAll(Integer.parseInt(page), tag);
        } else if (!roomCount.isBlank()) {
            return structureRepository.findAll(Integer.parseInt(page), Short.parseShort(roomCount));
        } else {
            return structureRepository.findAll(Integer.parseInt(page));
        }
    }

    public Structure find(Long structureId) {
        return structureRepository.findById(structureId).orElseThrow(
                () -> new StructureNotFoundException("Structure with id = " + structureId + " was not found"));
    }

    public void save(Structure structure) {
        structureRepository.save(structure);
    }

    public void update(Structure structure) {
        structureRepository.findById(structure.getId()).orElseThrow(
                () -> new StructureNotFoundException("Structure with id = " + structure.getId() + " was not found"));
        structureRepository.save(structure);
    }

    public void delete(Long structureId) {
        Structure structure = structureRepository.findById(structureId).orElseThrow(
                () -> new StructureNotFoundException("Structure with id = " + structureId + " was not found"));
        structureRepository.delete(structure);
    }

    public List<Structure> findAllFollowed(Long userId) {
        return structureRepository.findAllFollowed(userId);
    }

    public void follow(Long structureId, String userId) {
        structureRepository.follow(structureId, Long.parseLong(userId));
    }

    public void uploadStructureImage(Long structureId, MultipartFile multipartFile) {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        try {
            Structure structure = find(structureId);
            String imagePath = FileUploadUtil.saveFile(fileName, multipartFile);
            structureImageService.create(structure, imagePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ResponseEntity<?> downloadStructureImage(String imagePath) {
        Resource resource;
        try {
            resource = FileDownloadUtil.downloadFile(imagePath);
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                    .body(resource);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
