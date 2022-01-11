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

//    public void setStockCars(ArrayList<Vehicle> stockCars) {
//        this.stockCars = stockCars;
//    }
}
