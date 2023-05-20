package self.izouir.whitehousebackend.repository.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.structure.StructureImage;

@Repository
public interface StructureImageRepository extends JpaRepository<StructureImage, Long> {
}
