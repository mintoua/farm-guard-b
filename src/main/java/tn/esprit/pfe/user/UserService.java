package tn.esprit.pfe.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    final UserRepository userRepository;

    public User addUser(User user)
    {
        return userRepository.save(user);
    }
}
