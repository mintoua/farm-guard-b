package tn.esprit.pfe.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pfe.entity.User;
import tn.esprit.pfe.service.UserService;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/users")
@CrossOrigin("*")
public class UserController {

    final UserService userService;

    @PostMapping(path = "/signup")
    @ResponseBody
    public ResponseEntity<User> createAccount(
            @RequestBody User user)
    {

        return new ResponseEntity<>
                (userService.addUser(user), HttpStatus.CREATED);
    }
}
