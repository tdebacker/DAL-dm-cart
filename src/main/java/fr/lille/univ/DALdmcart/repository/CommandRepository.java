package fr.lille.univ.DALdmcart.repository;

import fr.lille.univ.DALdmcart.model.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Long> {
}
