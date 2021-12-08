package Abstract_classes;
import Essentials.Interest;
import Interfaces.Eating;
import Interfaces.Interesting;
import Interfaces.Location;

public abstract class Human implements Eating, Interesting, Location {

    public String name;
    public Interest interest;

    public Human(String name, Interest PowerOfInterest) {

        this.name = name;
        this.interest = PowerOfInterest;

    }

    public String getName() {
        return this.name;
    }

    public String goTo(Human who) {
        return " пришёл к " + who.name;
    }

    public void setPowerOfInterest(Interest PowerOfInterest) {
        this.interest = PowerOfInterest;
    }

    public Interest getPowerOfInterest(Interest PowerOfInterest) {
        return PowerOfInterest;
    }

    public String talkWith(String s) {
        return s;
    }

    public String getPossibilityToEat(boolean PossibilityToEat) {
        if (PossibilityToEat) {
            return "мог есть";
        } else {
            return "не мог есть";
        }
    }
}
