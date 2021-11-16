package fr.lille.univ.DALdmcart.controller.mvc;

import fr.lille.univ.DALdmcart.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MVC Controller for the home page.
 */
@Controller
@AllArgsConstructor
@RequestMapping("/")
public class HomeController {

    /**
     * Service to manage articles.
     */
    private final ArticleService articleService;

    /**
     * Show the index page.
     *
     * @return The index view.
     */
    @GetMapping
    public String showHomePage(Model model) {
        model.addAttribute("articles", articleService.getArticles());

        return "index";
    }

}
