package Java2.Lesson1;

import Java2.Lesson1.Competitors.Competitor;
import Java2.Lesson1.Obstacles.Obstacle;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for(Competitor c:team.competitors){
            for(Obstacle o:obstacles){
                o.doIt(c);
            }
        }
    }
}
