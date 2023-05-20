package self.izouir.whitehousebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.AdminMessage;

@Repository
public interface AdminMessageRepository extends JpaRepository<AdminMessage, Long> {
}
