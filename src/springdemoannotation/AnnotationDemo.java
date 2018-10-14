package springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("tennisCoach:----------");
        Coach coach=context.getBean("tennisCoach",Coach.class);
        System.out.println(coach.getDailyWorkOut());
        System.out.println(coach.getDailyFortune());
        System.out.println("bowlingCoach:----------");
        Coach bowCoach = context.getBean("bowlingCoach",Coach.class);
        System.out.println(bowCoach.getDailyWorkOut());
        System.out.println(bowCoach.getDailyFortune());
        System.out.println("volleyBallCoach:----------");
        VolleyballCoach vbCoach = context.getBean("volleyballCoach",VolleyballCoach.class);
        System.out.println(vbCoach.getDailyWorkOut());
        System.out.println(vbCoach.getDailyFortune());
        System.out.println("Email: "+vbCoach.getEmailAdress()+"\nTeam: "+vbCoach.getTeam());
        context.close();
    }
}
