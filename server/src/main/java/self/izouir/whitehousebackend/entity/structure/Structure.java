package self.izouir.whitehousebackend.entity.structure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import self.izouir.whitehousebackend.entity.user.User;

import java.math.BigDecimal;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "structures")
@Entity
public class Structure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private User publisher;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "square")
    private Float square;

    @Column(name = "floor")
    private Short floor;

    @Column(name = "room_count")
    private Short roomCount;

    @OneToMany
    @JoinColumn(name = "structure_id")
    private List<StructureTag> tags;

    @OneToMany
    @JoinColumn(name = "structure_id")
    private List<StructureImage> images;

    @ManyToMany
    @JoinTable(
            name = "followers_to_structures",
            joinColumns = @JoinColumn(name = "structure_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id")
    )
    private List<User> followers;
}
