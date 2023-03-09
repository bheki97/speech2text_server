package za.ac.bheki97.test_project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.ac.bheki97.test_project.entiity.user.User;
import za.ac.bheki97.test_project.entiity.user.UserService;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User registerUser(@RequestBody User user){

        return userService.RegisterUser(user);
    }

}
