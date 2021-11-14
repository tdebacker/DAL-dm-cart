package fr.lille.univ.DALdmcart.service;

import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    public Cart createCart() {
        return cartRepository.save(new Cart());
    }

}
