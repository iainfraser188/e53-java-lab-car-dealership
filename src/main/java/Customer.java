import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> ownedCars;

    public Customer(double money, ArrayList<Vehicle> ownedCars) {
        this.money = money;
        this.ownedCars = ownedCars;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedCars() {
        return ownedCars;
    }
}
