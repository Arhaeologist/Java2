package Java2.Lesson1;

import Java2.Lesson1.Competitors.Competitor;

public class Team {
    Competitor[] competitors;
    String name;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public void showResults(){
        System.out.println("-----------------");
        for (Competitor c:competitors) {
            c.info();
        }
        System.out.println("-----------------");
    }

//    public void info(){
//        System.out.println("-----------------");
//        for (Competitor c:competitors) {
//            c.info();
//        }
//        System.out.println("-----------------");
//    }
}
