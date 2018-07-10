package Java2.Lesson1;

import Java2.Lesson1.Competitors.Cat;
import Java2.Lesson1.Competitors.Dog;
import Java2.Lesson1.Competitors.Human;
import Java2.Lesson1.Obstacles.Cross;
import Java2.Lesson1.Obstacles.Wall;
import Java2.Lesson1.Obstacles.Water;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(100), new Wall(2), new Water(50));
        Team team = new Team("Java2", new Dog("Hatiko"), new Cat("Bsrsik"), new Human("Fate"));
        c.doIt(team);
        team.showResults();
    }
}