package com.adrien.javamicroservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/users")
    public User user(@RequestParam(value="id", defaultValue="") int id) {
        return new User(1, "Bob", "Ross", "bob.ross@gmail.com");
    }

}
