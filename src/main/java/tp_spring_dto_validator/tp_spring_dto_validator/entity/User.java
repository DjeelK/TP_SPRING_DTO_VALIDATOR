package tp_spring_dto_validator.tp_spring_dto_validator.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username", "password"}))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(max=15, message="Le nom ne doit pas dépasser 15 caractères")
    private String username;
    @NotNull
    @Size(max=8, message="Le mot de passe ne doit pas dépasser 8 caractères")
    @Pattern(regexp = "^(?=.*\\d.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^a-zA-Z0-9]).*$",
            message = "Le mot de passe doit contenir au moins 2 chiffres, 1 majuscule, 1 minuscule et 1 caractère spécial")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Commentaire> commentaires;
    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    private List<Post> posts;
    @OneToMany(mappedBy = "user")
    private List<Likes> likes;
    @OneToMany(mappedBy = "user")
    private List<Dislick> dislicks;
}
