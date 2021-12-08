package Characters;
import Essentials.*;
import Abstract_classes.Human;

public class Znaika extends Human {

    public Znaika(String name, Interest PowerOfInterest) {
        super(name, PowerOfInterest);
    }

    boolean isBeaten(boolean isBeaten) {
        return isBeaten;
    }

    public String tellSecret() {
        return " Знайка вынужден был открыть свой секрет";
    }
}