package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryBeanGreetingsService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello there." + toString() + ".This is  Welcome!";
    }

    @Override
    public String toString() {
        return "PrimaryBeanGreetingsService{}";
    }
}
