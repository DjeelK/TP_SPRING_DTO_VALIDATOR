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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min =4,max=15, message = "Le titre doit être compris entre 4 et 15 caractères")
    private String title;
    @Size(max=250, message = "Le texte doit être composé de 250 caractères")
    private String texte;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Commentaire> comments;
    @OneToMany(mappedBy = "post")
    private List<Likes> likes;
    @OneToMany(mappedBy = "post")
    private List<Dislick> dislicks;
}
