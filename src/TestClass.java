import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    LCN lmn = new LCN();
    @Test
    public void testLMN(){
        assertEquals(15,lmn.lcn(3,5));
        assertEquals(12,lmn.lcn(12,12));
        assertEquals(140,lmn.lcn(35,4));
        assertEquals(110,lmn.lcn(10,22));
    }
}
