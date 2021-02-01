package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver driver;

    public void browser(){
        System.setProperty("webdriver.chrome.driver","./browser/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
}
