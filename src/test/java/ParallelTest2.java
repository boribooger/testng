import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test()
    public void SetUp2() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/home/boris/IdeaProjects/SeleniumAndTestNG/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://yandex.ru");
        System.out.println("1");
        driver.quit();
    }

    @Test
    public void test2() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/home/boris/IdeaProjects/SeleniumAndTestNG/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://rambler.ru");
        System.out.println("2");
        driver.quit();
    }
}
