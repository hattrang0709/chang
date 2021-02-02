package Common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends Driver{

    @BeforeClass
    public void openBrowser() {
        browser();
        driver.get(Constant.SEARCHPAGE.URL);
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
