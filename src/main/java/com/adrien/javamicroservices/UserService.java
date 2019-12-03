package com.adrien.javamicroservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public User addUser(String firstname, String lastname, String password) {
        User u = new User();
        u.setFirstname(firstname);
        u.setLastname(lastname);
        u.setPassword(password);
        userRepository.save(u);
        return u;
    }

    public Optional<User> editUser(int id, @Nullable String firstname, @Nullable String lastname, @Nullable String password) {

        Optional<User> u = getUserById(id);

        if (firstname != null) {
            u.get().setFirstname(firstname);
        }
        if (lastname != null) {
            u.get().setLastname(lastname);
        }
        if (password != null) {
            u.get().setPassword(password);
        }
        userRepository.save(u.get());
        return u;
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User deleted";
    }


}
