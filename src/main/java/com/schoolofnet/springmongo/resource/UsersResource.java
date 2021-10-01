package com.schoolofnet.springmongo.resource;

import com.schoolofnet.springmongo.model.Users;
import com.schoolofnet.springmongo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UsersResource {

    @Autowired
    private UsersRepository repository;

    @GetMapping
    @ResponseBody
    public List<Users> findAll() {
        return this.repository.findAll();
    }

    @PostMapping
    public Users create(@RequestBody Users user) {
        return this.repository.save(user);
    }

}
