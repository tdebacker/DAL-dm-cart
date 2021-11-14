package fr.lille.univ.DALdmcart.repository;

import fr.lille.univ.DALdmcart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository to manage cart data.
 */
public interface CartRepository extends JpaRepository<Cart, Long> {
}
