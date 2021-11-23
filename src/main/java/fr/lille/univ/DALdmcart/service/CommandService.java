package fr.lille.univ.DALdmcart.service;

import fr.lille.univ.DALdmcart.model.Command;
import fr.lille.univ.DALdmcart.model.User;
import fr.lille.univ.DALdmcart.repository.CommandRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CommandService {

    private final CommandRepository commandRepository;
    private final UserService userService;

    public ResponseEntity<Command> createCommand(boolean auth, String username) {
        if (auth) {
            User user = userService.findUserByUsername(username);   // TODO: utiliser la donnée fourni par le broker pour identifier un user
            Command command = new Command(user);
            command.setArticles(user.getActiveCart().getArticles());
            return new ResponseEntity<>(commandRepository.save(command), HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
        }
    }
}
