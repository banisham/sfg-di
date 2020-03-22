package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectorGreetingsService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello there." + toString() + ".This is  Welcome!";
    }

    @Override
    public String toString() {
        return "SetterInjectorGreetingsService{}";
    }
}
