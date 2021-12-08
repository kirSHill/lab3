package Characters;
import Abstract_classes.Thing;
import Essentials.Material;

public class Stone extends Thing {

    public String name;
    public String Light = "Свет";

    public Stone(String name, Material Material, boolean PossibilityToShine) {
        this.name = name;
    }

    public String Shine() {
        return Light;
    }

    public String getName() {
        return name;
    }
}