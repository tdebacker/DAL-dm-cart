package fr.lille.univ.DALdmcart.controller.rest;

import fr.lille.univ.DALdmcart.model.Article;
import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.service.ArticleService;
import fr.lille.univ.DALdmcart.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for the API to manage articles.
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/article")
public class ArticleRestController {

    /**
     * Service to manage articles.
     */
    private final ArticleService articleService;

    /**
     * Service to manage carts.
     */
    private final CartService cartService;

    @GetMapping
    public List<Article> getArticles() {
        return articleService.getArticles();
    }

    @PostMapping("/{id}")
    public Cart addArticle(@PathVariable("id") Long id) {
        Article article = articleService.getByArticleId(id);
        Cart cart = cartService.findCart(1L);
        cart.getArticles().add(article);
        return cart;
    }

}
