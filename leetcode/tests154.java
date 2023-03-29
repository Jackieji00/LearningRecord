
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class tests154 {
  // @Rule
  // public Timeout timeout = Timeout.seconds(2);

  int[][] nums;
  Solution154 solution;
  int[] nums1 = {3, 4, 5, 1, 2};
  int[] nums2 = {2, 2, 2, 0, 1};
  int[] nums3 = {1, 3, 5};
  int[] nums4 = {1, 1, 1};
  int[] nums5 = {1, 0, 1, 1, 1};
  int[] nums6 = {1,3,3};
  int[] nums7 ={2,0,1,1,1};

  @Before
  public void setUp() {
    solution = new Solution154();
}
  @Test
  public void test0() {
    assertEquals(Arrays.stream(nums1).min().getAsInt(), solution.minArray(nums1));
          
  }
  @Test
  public void test1() {
    assertEquals(Arrays.stream(nums2).min().getAsInt(), solution.minArray(nums2));
          
  }
  @Test
  public void test2() {
    assertEquals(Arrays.stream(nums3).min().getAsInt(), solution.minArray(nums3));
          
  }
  @Test
  public void test3() {
    assertEquals(Arrays.stream(nums4).min().getAsInt(), solution.minArray(nums4));
          
  }
  @Test
  public void test4() {
    assertEquals(Arrays.stream(nums5).min().getAsInt(), solution.minArray(nums5));
          
  }
  @Test
  public void test5() {
    assertEquals(Arrays.stream(nums6).min().getAsInt(), solution.minArray(nums6));
      
    
  }
  @Test
  public void test6() {
    assertEquals(Arrays.stream(nums7).min().getAsInt(), solution.minArray(nums7));
          
  }


  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(tests154.class);

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

