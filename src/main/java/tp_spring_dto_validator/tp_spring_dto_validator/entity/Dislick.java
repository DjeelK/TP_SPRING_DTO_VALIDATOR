package tp_spring_dto_validator.tp_spring_dto_validator.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dislick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate date;
    @ManyToOne(fetch = FetchType.EAGER)
    private Commentaire commentaire;
    @ManyToOne(fetch = FetchType.EAGER)
    private Post post;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

}
