package fr.lille.univ.DALdmcart.controller.rest;

import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for the API to manage carts.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/cart")
public class CartRestController {

    /**
     * Service to manage cart.
     */
    private final CartService cartService;

    /**
     * Create a cart in the database.
     *
     * @return The newly created cart.
     */
    @PostMapping
    public Cart createRoom() {
        return cartService.createCart();
    }
}
