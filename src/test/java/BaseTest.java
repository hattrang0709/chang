import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utils.Constant;

public class BaseTest extends Driver {

    @BeforeClass
    public void setUp() {
        startBrowser();
        driver.get(Constant.SEARCHPAGE.URL);
    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }

}
