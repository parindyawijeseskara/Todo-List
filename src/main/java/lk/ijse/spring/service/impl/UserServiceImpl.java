package lk.ijse.spring.service.impl;


import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    public void saveUser(UserDTO userDTO) {

    }

    public void updateUser(UserDTO userDTO) {

    }

    public void deleteUser(UserDTO userDTO) {

    }

    public UserDTO searchUser(Integer userId) {
        return null;
    }

    public List<UserDTO> getAllUsers() {
        return null;
    }
}
