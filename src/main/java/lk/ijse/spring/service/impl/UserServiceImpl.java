package lk.ijse.spring.service.impl;


import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.repo.UserRepo;
import lk.ijse.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper mapper;


    public void saveUser(UserDTO userDTO) {
        User user = mapper.map(userDTO,User.class);
        userRepo.save(user);
    }

    public void updateUser(UserDTO userDTO) {
        if (userRepo.existsById(userDTO.getUserId())){
            userRepo.save(mapper.map(userDTO,User.class));
        }else {
            throw new RuntimeException("No such user to update..! Please check the ID..");
        }
    }

    public void deleteUser(Integer userId) {
        if (userRepo.existsById(userId)){
            userRepo.deleteById(userId);
        }else{
            throw new RuntimeException("No such user to delete..! Please check the ID..");
        }
    }

    public UserDTO searchUser(Integer userId) {
        if (userRepo.existsById(userId)){
            return mapper.map(userRepo.findById(userId).get(),UserDTO.class);
        }else{
            throw new RuntimeException("No such user for "+userId+"...!");
        }
    }

    public List<UserDTO> getAllUsers() {
        List<User> all = userRepo.findAll();
        List<UserDTO> userDTO = new ArrayList<>();

        for (User user:all) {
            UserDTO userDTO1 = new UserDTO();
            userDTO1.setUserId(user.getUserId());
            userDTO1.setUserName(user.getUserName());
            userDTO1.setEmail(user.getEmail());
            userDTO1.setPassword(user.getPassword());
            userDTO1.setAddress(user.getAddress());
            userDTO1.setContactNo(user.getContactNo());
            userDTO.add(userDTO1);
        }
        return userDTO;
    }
}






