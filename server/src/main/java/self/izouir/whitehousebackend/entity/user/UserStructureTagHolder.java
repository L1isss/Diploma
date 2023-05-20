package self.izouir.whitehousebackend.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user_structure_tag_holders")
@Entity
public class UserStructureTagHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "room_tag_count")
    private Long roomTagCount;

    @Column(name = "flat_tag_count")
    private Long flatTagCount;

    @Column(name = "house_tag_count")
    private Long houseTagCount;

    @Column(name = "rent_tag_count")
    private Long rentTagCount;

    @Column(name = "purchase_tag_count")
    private Long purchaseTagCount;
}
