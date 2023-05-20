package self.izouir.whitehousebackend.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.user.UserStructureTagHolder;

@Repository
public interface UserStructureTagHolderRepository extends JpaRepository<UserStructureTagHolder, Long> {
}
