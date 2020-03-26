package Cars;

import Behaviours.IComponent;
import CarTypes.CarType;

import java.util.ArrayList;

public class Car {

    private CarType type;
    private int price;
    private String colour;
    private ArrayList<IComponent> structure;


    public Car(CarType type, int price, String colour, ArrayList<IComponent> structure) {
        this.type = type;
        this.price = price;
        this.colour = colour;
        this.structure = structure;
    }

    public CarType getType() {
        return type.getType();
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void addToStructure(IComponent component){
        structure.add(component);
    }
}
