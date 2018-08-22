package springdemoannotation;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class RandomFortuneService implements FortuneService {
    String[] fortunes={"Fortune 1","Fortune 2","Fortune 3"};
    private Random n=new Random();
    @Override
    public String getFortune() {
        return fortunes[n.nextInt(fortunes.length)];
    }
}
