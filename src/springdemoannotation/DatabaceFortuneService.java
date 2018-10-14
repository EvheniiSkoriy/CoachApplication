package springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaceFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
