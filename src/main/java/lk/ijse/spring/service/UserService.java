package lk.ijse.spring.service;

import lk.ijse.spring.dto.UserDTO;

import java.util.List;

public interface UserService {

    public void saveUser(UserDTO userDTO);
    public void updateUser(UserDTO userDTO);
    public void deleteUser(Integer userId);
    public UserDTO searchUser(Integer userId);
    public List<UserDTO> getAllUsers();

}
