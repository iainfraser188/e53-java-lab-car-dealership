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
    private Vehicle car1;
    private Vehicle car2;
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
        stockCars.add(car1);
        stockCars.add(car2);
        dealership = new Dealership(100000.00, stockCars);
    }

    @Test
    public void hasStockOfCars() {
        assertEquals(2, dealership.getStockCars().size());
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(),0.0);
    }

}
