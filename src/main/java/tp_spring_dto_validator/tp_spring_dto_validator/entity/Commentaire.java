package tp_spring_dto_validator.tp_spring_dto_validator.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min=500, message = "Le message doit être composé au minimum de 500 caractères")
    private String message;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    private Post post;
    @OneToMany(mappedBy = "commentaire")
    private List<Likes> likes;
    @OneToMany(mappedBy = "commentaire")
    private List<Dislick> dislicks;

}
