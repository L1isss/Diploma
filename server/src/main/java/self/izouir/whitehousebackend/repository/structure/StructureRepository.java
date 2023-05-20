package self.izouir.whitehousebackend.repository.structure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.structure.Structure;

import java.util.List;

@Repository
public interface StructureRepository extends JpaRepository<Structure, Long> {
    @Query(nativeQuery = true, value = "SELECT s FROM structures s JOIN structure_tags st ON (s.id = st.structure_id)" +
                                       "WHERE st.tag = :tag AND s.room_count = :roomCount OFFSET (:page - 1) * 10 LIMIT 10")
    List<Structure> findAll(@Param("page") Integer page, @Param("tag") String tag, @Param("roomCount") Short roomCount);
    @Query(nativeQuery = true, value = "SELECT s FROM structures s JOIN structure_tags st ON (s.id = st.structure_id)" +
                                       "WHERE st.tag = :tag OFFSET (:page - 1) * 10 LIMIT 10")
    List<Structure> findAll(@Param("page") Integer page, @Param("tag") String tag);
    @Query(nativeQuery = true, value = "SELECT * FROM structures WHERE room_count = :roomCount OFFSET (:page - 1) * 10 LIMIT 10")
    List<Structure> findAll(@Param("page") Integer page, @Param("roomCount") Short roomCount);
    @Query(nativeQuery = true, value = "SELECT * FROM structures OFFSET (:page - 1) * 10 LIMIT 10")
    List<Structure> findAll(@Param("page") Integer page);
    @Query(nativeQuery = true, value = "SELECT s FROM structures s JOIN followers_to_structures fs ON (s.id = fs.structure_id)" +
                                       "JOIN users u ON (fs.follower_id = u.id)")
    List<Structure> findAllFollowed(Long userId);
    @Query(nativeQuery = true, value = "INSERT INTO followers_to_structures (follower_id, structure_id) VALUES (:userId, :structureId)")
    void follow(Long structureId, Long userId);
}
