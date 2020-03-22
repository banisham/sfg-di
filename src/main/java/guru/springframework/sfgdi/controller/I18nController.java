package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingsService greetingsService;

    @Autowired
    public I18nController(@Qualifier("i18Service") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String greetMessage(){
        return greetingsService.sayGreeting();
    }
}
