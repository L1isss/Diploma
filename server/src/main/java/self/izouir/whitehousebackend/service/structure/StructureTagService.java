package self.izouir.whitehousebackend.service.structure;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.repository.structure.StructureTagRepository;

@RequiredArgsConstructor
@Service
public class StructureTagService {
    private final StructureTagRepository structureTagRepository;
}
