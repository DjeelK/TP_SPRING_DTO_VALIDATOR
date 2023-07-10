package tp_spring_dto_validator.tp_spring_dto_validator.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserDto;
import tp_spring_dto_validator.tp_spring_dto_validator.entity.User;

@Component
public class DtoUtils {


    public UserDto convertToDto(User user, UserDto userDto) {
        return new ModelMapper().map(user, userDto.getClass());
    }

    public User convertToEntity(User user, UserDto userDto) {
        return new ModelMapper().map(userDto, user.getClass());
    }


}
