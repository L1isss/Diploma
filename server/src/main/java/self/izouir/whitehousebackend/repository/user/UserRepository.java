package self.izouir.whitehousebackend.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(nativeQuery = true, value = "INSERT INTO mailing_entities (email) VALUES (:email)")
    void mailing(@Param("email") String email);
}
