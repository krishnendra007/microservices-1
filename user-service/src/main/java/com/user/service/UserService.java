package com.user.service;

import com.user.model.User;
import com.user.respository.UserRespoitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserRespoitory {

    List<User> list =List.of(
            new User(101,"Krish","123456"),
            new User(102,"Ashu","78910"),
            new User(103,"Golu","1234")
    );
    public User getUser(int id) {
        return list.stream().filter(user-> user.getUserId()==id).findAny().orElse(null);
    }
}
