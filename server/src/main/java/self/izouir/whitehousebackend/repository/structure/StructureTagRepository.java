package self.izouir.whitehousebackend.repository.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.structure.StructureTag;

@Repository
public interface StructureTagRepository extends JpaRepository<StructureTag, Long> {
}
