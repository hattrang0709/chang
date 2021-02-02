package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    public WebDriver driver;

    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver","src/main/java/browser/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.close();
    }

}
