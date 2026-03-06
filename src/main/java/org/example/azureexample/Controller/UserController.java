package org.example.azureexample.Controller;

import org.example.azureexample.Entity.User;
import org.example.azureexample.Repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;
//just
    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return repo.save(user);
    }
}

