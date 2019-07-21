import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("before test");
    }

    @Test
    public void setUpTest()
    {
        System.out.println("running in test");
    }
}
