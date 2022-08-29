package lk.ijse.spring.controller;


import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.service.UserService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    //save users
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
        return new ResponseUtil(200,"Saved User",userDTO);
    }

    //update users
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateUser(@RequestBody UserDTO userDTO){
        userService.updateUser(userDTO);
        return new ResponseUtil(200,"Updated User",userDTO);
    }

    //delete user by id
    @DeleteMapping(params = {"userId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteUser(@RequestParam Integer userId){
        userService.deleteUser(userId);
        return new ResponseUtil(200,"Deleted User",userId);
    }

    //search users by id
    @GetMapping(path = "/{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchUser(@PathVariable Integer userId){
        UserDTO userDTO = userService.searchUser(userId);
        return new ResponseUtil(200,"Ok",userDTO);
    }

    //get all users
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllUsers(){
        return new ResponseUtil(200,"Ok",userService.getAllUsers());
    }

}
