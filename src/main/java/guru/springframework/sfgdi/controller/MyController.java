package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingsService greetingsService;

    @Autowired
    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String greetingMessage(){
        return greetingsService.sayGreeting();
    }
}
