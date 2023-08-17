package study.uz.forstudy.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.Instant;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 500)
    private String name;

    @Column(name = "phone", unique = true, length = 500)
    private String phone;

    private String birthDate;

    private Instant createdTime;

    private Instant updatedTime;

}
