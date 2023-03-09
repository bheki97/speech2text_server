package za.ac.bheki97.test_project.entiity.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User RegisterUser(User user){
        repository.save(user);

        return user;
    }

}
