package fr.lille.univ.DALdmcart.controller.mvc;

import fr.lille.univ.DALdmcart.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;

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

    @GetMapping("/checkout")
    public String showHomePageWithCheckout(HttpSession session, @RequestParam boolean auth, @RequestParam String operation) {
        if(auth) {
            session.setAttribute("auth", true);
            session.setAttribute("operation", operation);
            session.setAttribute("username", "toto");
            // TODO: requete pour recuperer l'identity du user et inserer dans model

            return "redirect:";
        }

        return "redirect:";
    }

}
