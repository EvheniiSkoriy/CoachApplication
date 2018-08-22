package springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

    @Value("${foo.email}")
    private String emailAdress;
    @Value("${foo.team}")
    private String team;

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;


    public VolleyballCoach() {
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice your serve";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }
}
