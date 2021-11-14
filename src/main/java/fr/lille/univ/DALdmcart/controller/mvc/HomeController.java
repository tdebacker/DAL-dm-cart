package fr.lille.univ.DALdmcart.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MVC Controller for the home page and rooms pages.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    /**
     * Show the index page.
     *
     * @return The index view.
     */
    @GetMapping
    public String showHomePage() {
        return "index";
    }

    /**
     * Show the room page linked to the associated room id.
     *
     * @param roomId The room id.
     * @param model The model to give information to the jsp.
     * @return The room view.
     */
    @GetMapping("/{roomId}")
    public String showRoomPage(@PathVariable String roomId, Model model) {
        model.addAttribute("roomId", roomId);
        return "room";
    }

}
