package com.adrien.javamicroservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path="")
    public @ResponseBody Iterable<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(path="", params = {"id"})
    public @ResponseBody Optional<User> getUser(@RequestParam int id) {
        return userService.getUserById(id);
    }

    @PostMapping(path="")
    public @ResponseBody User addUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String password) {
        return userService.addUser(firstname, lastname, password);
    }

    @PutMapping(path="")
    public @ResponseBody Optional<User> editUser(int id, @Nullable String firstname, @Nullable String lastname, @Nullable String password) {
        return userService.editUser(id, firstname, lastname, password);
    }

    @DeleteMapping(path="")
    public @ResponseBody String deleteUser(@RequestParam int id) {
        return userService.deleteUser(id);
    }

}
