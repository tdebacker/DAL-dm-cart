package fr.lille.univ.DALdmcart.controller.rest;

import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Cart createCart() {
        return cartService.createCart();
    }

    @GetMapping
    public List<Cart> getCarts() {
        return cartService.findCarts();
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable Long id) {
        return cartService.findCart(id);
    }
}
