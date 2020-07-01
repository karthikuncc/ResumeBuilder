package com.ResumeSearch.ResumeSearchApp.Controller;

import com.ResumeSearch.ResumeSearchApp.Model.User;
import com.ResumeSearch.ResumeSearchApp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user){
    userRepo.save(user);
    return "Added User with id:"+user.getId();
    }

    @GetMapping("/findAllUsers")
    public List<User> getUsers(){
    return userRepo.findAll();
    }

    @GetMapping("/findBook/{id}")
    public Optional<User> getUser(@PathVariable int id){
    return userRepo.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        userRepo.deleteById(id);
        return "User deleted with id:"+id;
    }
}
