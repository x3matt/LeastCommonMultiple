import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    LMN lmn = new LMN();
    @Test
    public void testLMN(){
        assertEquals(15,lmn.lmn(3,5));
        assertEquals(12,lmn.lmn(12,12));
        assertEquals(140,lmn.lmn(35,4));
        assertEquals(110,lmn.lmn(10,22));
    }
}
