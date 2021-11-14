package fr.lille.univ.DALdmcart.service;

import fr.lille.univ.DALdmcart.model.Article;
import fr.lille.univ.DALdmcart.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Service to manage articles.
 */
@AllArgsConstructor
@Service
public class ArticleService {

    /**
     * Repository to get articles from the database.
     */
    private final ArticleRepository articleRepository;

    /**
     * Save a article in the database.
     *
     * @return The newly created article.
     */
    public Article createArticle(int price, String name, String img) {
        return articleRepository.save(new Article(null, price, name, img));
    }

}
