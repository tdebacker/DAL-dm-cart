package fr.lille.univ.DALdmcart.config;

import fr.lille.univ.DALdmcart.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@AllArgsConstructor
public class InitializerConfiguration {

    ArticleService articleService;

    @PostConstruct
    private void init() {
        articleService.createArticle(299, "Boisson énergétique",
                "https://static1.chronodrive.com/img/PM/P/0/76/0P_61276.gif");
        articleService.createArticle(150, "Papier Cadeau",
                "https://static1.chronodrive.com/img/PM/P/0/72/0P_348972.gif");
        articleService.createArticle(235, "Jus d'orange",
                "https://static1.chronodrive.com/img/PM/P/0/42/0P_40042.gif");
        articleService.createArticle(450, "Fromage à raclette",
                "https://static1.chronodrive.com/img/PM/P/0/20/0P_195420.gif");
    }

}
