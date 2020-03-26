package Components;

import Behaviours.IComponent;

public class Motor implements IComponent {

    private int power;

    public Motor(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String revMotor(){
        return "When this baby hits 88 miles per hour, you're gonna see some serious shit";
    }
}
