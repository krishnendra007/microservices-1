package com.user.controller;

import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
     private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        User user= userService.getUser(id);
        List contacts =this.restTemplate.getForObject("http://contact-service/contacts/user/"+user.getUserId(), List.class);

        user.setContact(contacts);
        return  user;

    }

}
