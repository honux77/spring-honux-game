package net.honux.game.honuxgame.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping()
    public String welcome() {
        logger.info("GET /hello");
        return "welcome";
    }
}
