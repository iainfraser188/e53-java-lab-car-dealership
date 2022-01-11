import Components.GearBox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearBoxTest {

    private GearBox gearBox;


    @Before
    public void before() {
        gearBox = new GearBox(true, 5);
    }

    @Test
    public void hasManualStatus() {
        assertEquals(true, gearBox.getManualGears());
    }

    @Test
    public void notManualStatus() {
        GearBox auto = new GearBox(false, 5);
        assertEquals(false, auto.getManualGears());
    }

    @Test
    public void hasNumberGears() {
        assertEquals(5, gearBox.getNoOfGears());
    }

}
