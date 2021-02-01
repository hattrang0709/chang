package Common;

public class BaseTest extends Driver{

    public void openBrowser(){
        browser();
        driver.get(Constant.SEARCHPAGE.URL);
    }

    public void closeBrowser(){
        driver.close();
    }
}
