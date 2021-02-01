package Interaction;

import Common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actions extends Driver {
    public WebElement e;

    public void findElement(String Path) {
        e = driver.findElement(By.xpath(Path));
    }

    public void click(String Path) {
        findElement(Path);
        e.click();
    }

    public void enter(String Path, String Value) {
        findElement(Path);
        e.clear();
        e.sendKeys(Value);
    }

    public String getText(String Path) {
        findElement(Path);
        return e.getText();
    }

    public void sleepPage(int Number) throws InterruptedException {
        Thread.sleep(Number);
    }
}
