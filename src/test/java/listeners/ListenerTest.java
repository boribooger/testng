package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ListenerTest {
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
}
