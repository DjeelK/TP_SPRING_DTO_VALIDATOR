package tp_spring_dto_validator.tp_spring_dto_validator.service;

import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserCreateDto;
import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserDto;
import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserReadDto;

public interface UserServiceMapper {
    public UserReadDto createUser(UserCreateDto userDto);
    public UserDto readUser(Integer id);
}
