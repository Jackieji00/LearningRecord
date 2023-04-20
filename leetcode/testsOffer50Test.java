
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class testsOffer50Test {
    Offer50 offer;

    @Before
    public void setup(){
        offer=new Offer50();
    }

    @Test
    public void test1(){
        String s = "abaccdeff";
        assertEquals('b', offer.firstUniqChar(s));
    }

    // @Test
    // public void test2(){
    //     String s = "";
    //     assertEquals(' ', offer.firstUniqChar(s));
    // }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(testsOffer50Test.class);
        if(!result.wasSuccessful()){
            System.out.println("fail "+result.getFailureCount()+" case(s) of "+result.getRunCount());
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }else{
            System.out.println(result.wasSuccessful());
        }
    }
}
