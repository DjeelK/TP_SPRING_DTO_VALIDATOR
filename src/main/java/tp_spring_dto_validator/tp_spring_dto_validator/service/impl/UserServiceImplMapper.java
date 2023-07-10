package tp_spring_dto_validator.tp_spring_dto_validator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserCreateDto;
import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserDto;
import tp_spring_dto_validator.tp_spring_dto_validator.dto.UserReadDto;
import tp_spring_dto_validator.tp_spring_dto_validator.entity.User;
import tp_spring_dto_validator.tp_spring_dto_validator.repository.UserRepository;
import tp_spring_dto_validator.tp_spring_dto_validator.service.UserServiceMapper;
import tp_spring_dto_validator.tp_spring_dto_validator.utils.DtoUtils;

@Service
public class UserServiceImplMapper implements UserServiceMapper {
    @Autowired
    private DtoUtils dtoUtils;
    @Autowired
    UserRepository userRepository;

    @Override
    public UserReadDto createUser(UserCreateDto userDto) {
        User user = dtoUtils.convertToEntity(new User(), userDto);

        User user1 = userRepository.save(user);

        return (UserReadDto) dtoUtils.convertToDto(user1, new UserReadDto());
    }

    @Override
    public UserDto readUser(Integer id) {
        return dtoUtils.convertToDto(userRepository.findById(id).get(), new UserReadDto());
    }
}
