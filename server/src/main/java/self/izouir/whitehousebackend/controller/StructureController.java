package self.izouir.whitehousebackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import self.izouir.whitehousebackend.entity.structure.Structure;
import self.izouir.whitehousebackend.service.structure.StructureService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/structures")
public class StructureController {
    private final StructureService structureService;

    @GetMapping
    public List<Structure> findAll(@RequestParam(value = "page", defaultValue = "1") final String page,
                                   @RequestParam(value = "tag", required = false, defaultValue = "") final String tag,
                                   @RequestParam(value = "roomCount", required = false, defaultValue = "") final String roomCount) {
        return structureService.findAll(page, tag, roomCount);
    }

    @GetMapping("/{structureId}")
    public Structure find(@PathVariable("structureId") final Long structureId) {
        return structureService.find(structureId);
    }

    @PostMapping
    public void save(@Validated @RequestBody final Structure structure) {
        structureService.save(structure);
    }

    @PutMapping
    public void update(@Validated @RequestBody final Structure structure) {
        structureService.update(structure);
    }

    @DeleteMapping("/{structureId}")
    public void delete(@PathVariable("structureId") final Long structureId) {
        structureService.delete(structureId);
    }

    @GetMapping("/followed/{userId}")
    public List<Structure> findAllFollowed(@PathVariable("userId") final Long userId) {
        return structureService.findAllFollowed(userId);
    }

    @PostMapping("/follow/{structureId}")
    public void follow(@PathVariable("structureId") final Long structureId,
                       @RequestParam("userId") final String userId) {
        structureService.follow(structureId, userId);
    }

    @PostMapping("/{structureId}/uploadImage")
    public void uploadStructureImage(@PathVariable("structureId") Long structureId,
                                     @RequestParam("file") MultipartFile multipartFile) {
        structureService.uploadStructureImage(structureId, multipartFile);
    }

    @GetMapping("/downloadImage/{imagePath}")
    public ResponseEntity<?> downloadStructureImage(@PathVariable("imagePath") String imagePath) {
        return structureService.downloadStructureImage(imagePath);
    }
}
