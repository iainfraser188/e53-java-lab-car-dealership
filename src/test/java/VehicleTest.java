import Components.Engines.PetrolEngine;
import Components.GearBox;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    PetrolEngine engine;
    Tyres tyres;
    GearBox gearbox;

    @Before
    public void before(){
        engine = new PetrolEngine(2, 80);
        tyres = new Tyres(8,13.5);
        gearbox = new GearBox(true, 5);
        vehicle = new Vehicle(5000.00, "blue", 2000, engine, tyres, gearbox, CarType.PETROL);
    }

    @Test
    public void hasPrice() {
        assertEquals(5000.00, vehicle.getPrice(),0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("blue", vehicle.getColour());
    }

    @Test
    public void hasMileage() {
        assertEquals(2000, vehicle.getMileage());
    }


    @Test
    public void hasEngine(){
        assertEquals(engine, vehicle.getEngine());
    }

    @Test
    public void hasGearBox() {
        assertEquals(gearbox, vehicle.getGearbox());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, vehicle.getTyres());
    }

    @Test
    public void hasType(){
        assertEquals(CarType.PETROL, vehicle.getCarType());

    }
}
