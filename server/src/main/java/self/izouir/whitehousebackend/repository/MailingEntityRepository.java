package self.izouir.whitehousebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.MailingEntity;

@Repository
public interface MailingEntityRepository extends JpaRepository<MailingEntity, Long> {
}
