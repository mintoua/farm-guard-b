package tn.esprit.pfe.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pfe.entity.User;
import tn.esprit.pfe.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {

    final UserRepository userRepository;

    public User addUser(User user)
    {
        return userRepository.save(user);
    }
}
