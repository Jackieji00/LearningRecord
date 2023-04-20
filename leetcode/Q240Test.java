import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class Q240Test {
    int [][] var1 = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
    Solution240 solution240;
    @Before
    public void setUp(){
        solution240=new Solution240();
    }

    @Test
    public void test1(){
        assertEquals(true,solution240.findNumberIn2DArray(var1, 5) );
    }

    @Test
    public void test2(){
        assertEquals(false, solution240.findNumberIn2DArray(var1, 20));
    }
}