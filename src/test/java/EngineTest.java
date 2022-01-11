import Components.Engines.ElectricEngine;
import Components.Engines.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private ElectricEngine eEngine;
    private PetrolEngine pEngine;

    @Before
    public void before() {
        eEngine = new ElectricEngine(10, 100);
        pEngine = new PetrolEngine(2, 80);
    }

    @Test
    public void electricHasCapacity() {
        assertEquals(10, eEngine.getCapacity());
    }

    @Test
    public void petrolHasCapacity(){
        assertEquals(2, pEngine.getCapacity());
    }

    @Test
    public void electricHasHorsePower(){
        assertEquals(100, eEngine.getHorsePower());
    }

    @Test
    public void petrolHasHorsePower(){
        assertEquals(80, pEngine.getHorsePower());
    }

    @Test
    public void electricCanRunQuietly() {
        assertEquals("Engine running: beep", eEngine.runsQuietly("beep"));
    }

    @Test
    public void petrolCanRunLoudly() {
        assertEquals("ENGINE RUNNING! VROOM!", pEngine.runsLoudly("VROOM"));
    }
}
