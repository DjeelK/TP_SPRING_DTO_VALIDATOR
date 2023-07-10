package tp_spring_dto_validator.tp_spring_dto_validator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto implements UserDto {
    private String username;
    private String password;
}
