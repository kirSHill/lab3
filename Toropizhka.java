package Characters;
import Abstract_classes.Human;
import Essentials.Interest;

public class Toropizhka extends Korotishka {

    public Toropizhka(String name, Interest PowerOfInterest) {
        super(name, PowerOfInterest);
    }

    public String isWorried(Interest i) {
        if (i == Interest.IMPATIENCE) {
            return "волновался";
        } else {return "не волновался";}
    }

   public  String beat(Human h) {
        return " и пристал с такой силой, что";
    }
}