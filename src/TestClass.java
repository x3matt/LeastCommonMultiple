import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    LCM lcm = new LCM();
    @Test
    public void testLMN(){
        assertEquals(15,lcm.lcm(3,5));
        assertEquals(12,lcm.lcm(12,12));
        assertEquals(140,lcm.lcm(35,4));
        assertEquals(110,lcm.lcm(10,22));
    }
}
