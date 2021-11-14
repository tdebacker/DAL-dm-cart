package fr.lille.univ.DALdmcart.repository;

import fr.lille.univ.DALdmcart.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository to manage article data.
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
