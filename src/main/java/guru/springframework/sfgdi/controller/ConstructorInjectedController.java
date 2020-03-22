package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingsService greetingsService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingsService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
