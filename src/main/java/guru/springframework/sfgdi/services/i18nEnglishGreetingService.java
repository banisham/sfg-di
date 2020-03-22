package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class i18nEnglishGreetingService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello there." + toString() + ".This is  Welcome!";
    }

    @Override
    public String toString() {
        return "i18nEnglishGreetingsService{}";
    }
}
