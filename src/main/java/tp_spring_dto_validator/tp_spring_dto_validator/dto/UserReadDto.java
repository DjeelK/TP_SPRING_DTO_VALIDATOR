package tp_spring_dto_validator.tp_spring_dto_validator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReadDto implements UserDto {
    private int id;
    private String username;

}
