package self.izouir.whitehousebackend.service.structure;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.entity.structure.Structure;
import self.izouir.whitehousebackend.entity.structure.StructureImage;
import self.izouir.whitehousebackend.repository.structure.StructureImageRepository;

@RequiredArgsConstructor
@Service
public class StructureImageService {
    private final StructureImageRepository structureImageRepository;

    public void create(Structure structure, String imagePath) {
        StructureImage structureImage = StructureImage.builder()
                .structure(structure)
                .imagePath(imagePath)
                .build();
        structureImageRepository.save(structureImage);
    }
}
