package springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach {

    private FortuneService fortuneService;

    public BowlingCoach() {
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice rolling the ball";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    @Autowired
    public void setFortuneService(@Qualifier("happyFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
