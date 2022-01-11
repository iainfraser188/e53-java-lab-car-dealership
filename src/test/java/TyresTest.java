import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(8, 35.00);
    }

    @Test
    public void hasGripScore() {
        assertEquals(8, tyres.getGripScore());
    }

    @Test
    public void hasRadius() {
        assertEquals(35.00, tyres.getRadius(), 0.0);
    }

}
