package za.ac.bheki97.test_project.entiity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.bheki97.test_project.entiity.User;

@Controller
public class HomeController {

    @PostMapping
    public User registerUser(@RequestBody User user){

        return user;
    }

}
