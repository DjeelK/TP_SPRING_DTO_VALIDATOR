package tp_spring_dto_validator.tp_spring_dto_validator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tp_spring_dto_validator.tp_spring_dto_validator.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByUsername(String username);

}
