package fr.lille.univ.DALdmcart.controller.rest;

import fr.lille.univ.DALdmcart.model.User;
import fr.lille.univ.DALdmcart.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/user")
public class UserRestController {

    private final UserService userService;

    @PostMapping("/{id}")
    public User createUser(@PathVariable Long id) {
        return userService.createDefaultUser(id);
    }

}
