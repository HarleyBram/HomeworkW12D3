package Components;

import Behaviours.IComponent;

public class Engine implements IComponent {

    private double size;

    public Engine(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String revEngine(){
        return "vroom vroom";
    }
}
