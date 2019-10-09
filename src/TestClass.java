import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    LCM lcm = new LCM();
    @Test
    public void testLMN(){
        assertEquals(15,lcm.lcn(3,5));
        assertEquals(12,lcm.lcn(12,12));
        assertEquals(140,lcm.lcn(35,4));
        assertEquals(110,lcm.lcn(10,22));
    }
}
