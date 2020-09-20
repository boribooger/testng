import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParallelTest {
    WebDriver driver;

    @Test()
    public void SetUp1() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/home/boris/IdeaProjects/SeleniumAndTestNG/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println("1");
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/home/boris/IdeaProjects/SeleniumAndTestNG/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://ebay.com");
        System.out.println("2");
        driver.quit();
    }
}
