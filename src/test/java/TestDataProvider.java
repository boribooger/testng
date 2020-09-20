import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "DataProviderClass")
    public Object[][] testDataProvider(){
        Object[][] testData = {{"https://vk.com", "info 1"},{"https://tut.by","info 2"}};
        return testData;
    }
}
