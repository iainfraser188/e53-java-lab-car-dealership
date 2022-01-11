import Components.Engines.Engine;
import Components.GearBox;
import Components.Tyres;

public class Vehicle {

    private double price;
    private String colour;
    private int mileage;
    private Engine engine;
    private Tyres tyres;
    private GearBox gearbox;
    private CarType type;

    public Vehicle(double price, String colour, int mileage, Engine engine, Tyres tyres, GearBox gearbox, CarType type ) {
        this.price = price;
        this.colour = colour;
        this.mileage = mileage;
        this.engine = engine;
        this.tyres = tyres;
        this.gearbox = gearbox;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public GearBox getGearbox() {
        return gearbox;
    }

    public void setGearbox(GearBox gearbox) {
        this.gearbox = gearbox;
    }

    public CarType getCarType() {
        return this.type;
    }

    public void damage(double cost) {
        this.price -= cost;
    }
    
    public void repair(double cost) {
        this.price += cost;
    }
}
