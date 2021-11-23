package fr.lille.univ.DALdmcart.repository;

import fr.lille.univ.DALdmcart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
