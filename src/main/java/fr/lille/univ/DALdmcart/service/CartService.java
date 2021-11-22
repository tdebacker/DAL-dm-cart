package fr.lille.univ.DALdmcart.service;

import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service to manage carts.
 */
@AllArgsConstructor
@Service
public class CartService {

    /**
     * Repository to get carts from the database.
     */
    private final CartRepository cartRepository;

    /**
     * Save a cart in the database.
     *
     * @return The newly created cart.
     */
    public Cart createCart(Long id) {
        return cartRepository.save(new Cart(id));
    }

    public List<Cart> findCarts() {
        return cartRepository.findAll();
    }

    public Cart findCart(Long id) {
        return cartRepository.findById(id).orElseThrow();
    }

    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

}
