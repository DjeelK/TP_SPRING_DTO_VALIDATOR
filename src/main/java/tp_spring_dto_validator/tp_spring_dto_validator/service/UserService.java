package tp_spring_dto_validator.tp_spring_dto_validator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp_spring_dto_validator.tp_spring_dto_validator.entity.User;
import tp_spring_dto_validator.tp_spring_dto_validator.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Boolean getUserUsername(String username){
        User user = userRepository.findUserByUsername(username);
        return user != null ? true : false;
    }
    public Optional<User> getUserById(Integer id){
        return userRepository.findById(id);
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public List<User> getAllUser(){
        return (List<User>) userRepository.findAll();

    }
    public User updateUser(Integer id, User user){

        Optional<User> user1 = userRepository.findById(id);

        if(user1.isPresent()){
            User user2 = user1.get();
            user2.setPassword(user.getPassword());
            user2.setUsername(user.getUsername());
            return userRepository.save(user2);
        }
        return null;
    }
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }

}
