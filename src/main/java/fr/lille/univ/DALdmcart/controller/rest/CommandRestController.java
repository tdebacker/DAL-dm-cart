package fr.lille.univ.DALdmcart.controller.rest;

import fr.lille.univ.DALdmcart.model.Command;
import fr.lille.univ.DALdmcart.service.CommandService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/command")
public class CommandRestController {

    private final CommandService commandService;

    @PostMapping
    public ResponseEntity<Command> createCommand(@RequestParam boolean auth, @RequestParam String username) {
        return commandService.createCommand(auth, username);
    }

}
