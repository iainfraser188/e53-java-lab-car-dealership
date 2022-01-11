import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stockCars;

    public Dealership(double till, ArrayList<Vehicle> stockCars) {
        this.till = till;
        this.stockCars = stockCars;
    }

    public double getTill() {
        return till;
    }

//    public void addToTill(double till) {
//        this.till = till;
//    }

    public ArrayList<Vehicle> getStockCars() {
        return stockCars;
    }

    public void sellCar(Vehicle car) {
        this.stockCars.remove(car);
    }

    public void buyCar(Vehicle car) {
        this.stockCars.add(car);
    }

    public void changeTill(double cost){
        this.till += cost;
    }

    public void decreaseTill(double cost){
        this.till -= cost;
    }

    public void sellCarToCustomer(Vehicle car, Customer customer) {
        this.sellCar(car);
        customer.buyCar(car);
        double cost = car.getPrice();
        customer.decreaseMoney(cost);
        this.changeTill(cost);

    }

    public void repair(Vehicle car, double cost) {
        car.repair(cost);
        this.decreaseTill(cost);
    }

//    public void setStockCars(ArrayList<Vehicle> stockCars) {
//        this.stockCars = stockCars;
//    }
}
