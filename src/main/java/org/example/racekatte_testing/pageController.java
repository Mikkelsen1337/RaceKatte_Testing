package org.example.racekatte_testing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
