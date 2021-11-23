package fr.lille.univ.DALdmcart.service;

import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.model.User;
import fr.lille.univ.DALdmcart.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final CartService cartService;

    public User createDefaultUser(Long id) {
        Cart cart = cartService.createCart();
        return userRepository.save(new User(id, "default", cart));
    }

    public User createUser(String username) {
        Cart cart = cartService.createCart();
        return userRepository.save(new User(username, cart));
    }

    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
