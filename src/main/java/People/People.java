package People;

import Cars.Car;

import java.util.ArrayList;

public abstract class People {

    private int money;
    private ArrayList<Car> cars;

    public People(int money, ArrayList<Car> cars) {
        this.money = money;
        this.cars = cars;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void reduceMoney(int amount){
        money -= amount;
    }

    public void removeCar(Car car){
        cars.remove(car);

    }
}
