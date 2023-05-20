package self.izouir.whitehousebackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "admin_messages")
@Entity
public class AdminMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "publisher_id")
    private Long publisherId;

    @Column(name = "message")
    private String message;

    @Column(name = "sent_at")
    private Timestamp sentAt;
}
