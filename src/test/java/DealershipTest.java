import Components.Engines.ElectricEngine;
import Components.Engines.Engine;
import Components.Engines.PetrolEngine;
import Components.GearBox;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private ArrayList<Vehicle> stockCars;
    private ArrayList<Vehicle> custCars;
    private Customer customer;
    private Vehicle car1;
    private Vehicle car2;
    private Vehicle car3;
    private Engine engine1;
    private Tyres tyres1;
    private GearBox gearBox1;
    private Engine engine2;
    private Tyres tyres2;
    private GearBox gearBox2;

    @Before
    public void before() {
        stockCars = new ArrayList<> ();
        engine1 = new PetrolEngine(2, 80);
        tyres1 = new Tyres(8,13.5);
        gearBox1 = new GearBox(true, 5);
        engine2 = new ElectricEngine(10, 60);
        tyres2 = new Tyres(7,10.5);
        gearBox2 = new GearBox(false, 4);
        car1 = new Vehicle(5000.00, "blue", 2000, engine1, tyres1, gearBox1, CarType.PETROL);
        car2 = new Vehicle(5000.00, "black", 2000, engine2, tyres2, gearBox2, CarType.ELECTRIC);
        car3 = new Vehicle(5000.00, "red", 20000, engine2, tyres2, gearBox2, CarType.ELECTRIC);
        custCars = new ArrayList<>();
        stockCars.add(car1);
        stockCars.add(car2);
        dealership = new Dealership(100000.00, stockCars);
        customer = new Customer(10000.00, custCars);
    }

    @Test
    public void hasStockOfCars() {
        assertEquals(2, dealership.getStockCars().size());
    }

    @Test
    public void hasTill(){
        assertEquals(100000.00, dealership.getTill(),0.0);
    }

    @Test
    public void canSellCar() {
        dealership.sellCar(car1);
        assertEquals(1, dealership.getStockCars().size());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(car3);
        assertEquals(3,dealership.getStockCars().size());
    }

    @Test
    public void canSellCarToCustomer() {
        dealership.sellCarToCustomer(car1, customer);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(1, dealership.getStockCars().size());
        assertEquals(5000.00, customer.getMoney(),0.0);
        assertEquals(105000.00,dealership.getTill(),0.0);
    }

    @Test
    public void canRepair(){
        dealership.repair(car1, 1000);
        assertEquals(6000.00, car1.getPrice(), 0.0);
        assertEquals(99000.00, dealership.getTill(), 0.0);
    }

}
