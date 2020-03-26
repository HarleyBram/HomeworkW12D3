import Cars.Car;
import org.junit.Before;
import org.junit.Test;

import static CarTypes.CarType.DIESEL;
import static org.junit.Assert.assertEquals;

public class CarTest {
    Car brum;

    @Before
    public void before(){
        Car brum = new Car(DIESEL, 100, "blue");
    }

    @Test
    public void hasType() {
        assertEquals(DIESEL, brum.getType());
    }
}
