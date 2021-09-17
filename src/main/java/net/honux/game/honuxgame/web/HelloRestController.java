package net.honux.game.honuxgame.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello " + name;
    }
}
