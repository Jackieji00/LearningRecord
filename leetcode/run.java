import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class run {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Q240Test.class);
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
