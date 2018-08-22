package springdemoannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read config java class
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);

        System.out.println("Swim Coach:----------");
        SwimCoach coach=context.getBean("swimCoach",SwimCoach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());

        //Data from the sport.propereties file, set up the fields in the SwimCoach class
        System.out.println("Address: "+coach.getEmail()+"\nTeam: "+coach.getTeam());

        context.close();
    }
}
