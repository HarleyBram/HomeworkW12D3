package People;

import Cars.Car;

import java.util.ArrayList;

public class Dealership extends People {
    Dealership(int money, ArrayList<Car> cars) {
        super(money, cars);
    }

    public String exchangeCar(Customer customer, Car car) {
        if (customer.getMoney() >= car.getPrice()) {
            customer.addCar(car);
            remove(car);
            customer.reduceMoney(car.getPrice());
        } else {
            return "Not enough cash";
        }
        return null;
    }

}
