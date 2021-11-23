package fr.lille.univ.DALdmcart.controller.rest;

import fr.lille.univ.DALdmcart.model.Article;
import fr.lille.univ.DALdmcart.model.Cart;
import fr.lille.univ.DALdmcart.model.User;
import fr.lille.univ.DALdmcart.service.ArticleService;
import fr.lille.univ.DALdmcart.service.CartService;
import fr.lille.univ.DALdmcart.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
     * Service to manage users.
     */
    private final UserService userService;

    /**
     * Service to manage carts.
     */
    private final CartService cartService;

    @GetMapping
    public List<Article> getArticles() {
        return articleService.getArticles();
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable("id") Long id) {
        return articleService.getByArticleId(id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Cart> addArticle(@PathVariable("id") Long id, @RequestParam boolean auth, @RequestParam String username) {
        if (auth) {
            Article article = articleService.getByArticleId(id);
            User user = userService.findUserByUsername(username);
            Cart cart = user.getActiveCart();
            cart.getArticles().add(article);
            cart = cartService.updateCart(cart);

            return new ResponseEntity<>(cart, HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
        }
    }

}
