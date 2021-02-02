package controls.base;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.log4j.Logger;

public class BaseControl extends Driver {
    private Logger logger = Logger.getLogger(BaseControl.class);
    private String locator;
    private By byLocator;
    private String dynamicLocator;
    private BaseControl parent;

    public BaseControl(String locator) {
        this.locator = locator;
        this.dynamicLocator = locator;
        this.byLocator = getByLocator();
    }

    public BaseControl(By byLocator) {
        this.byLocator = byLocator;
    }

    public BaseControl(String locator, Object... args) {
        this.dynamicLocator = locator;
        this.locator = String.format(dynamicLocator, args);
        this.byLocator = getByLocator();
    }

    public BaseControl(BaseControl parent, String locator) {
        this.locator = locator;
        this.dynamicLocator = locator;
        this.byLocator = getByLocator();
        this.parent = parent;
    }

    public BaseControl(BaseControl parent, By byLocator) {
        this.byLocator = byLocator;
        this.parent = parent;
    }

    public BaseControl(BaseControl parent, String locator, Object... args) {
        this.dynamicLocator = locator;
        this.locator = String.format(dynamicLocator, args);
        this.byLocator = getByLocator();
        this.parent = parent;
    }

    private By getByLocator() {
        String body = this.locator.replaceAll("[\\w\\s]*=(.*)", "$1").trim();
        String type = this.locator.replaceAll("([\\w\\s]*)=.*", "$1").trim();
        switch (type.toLowerCase()) {
            case "id":
                return By.id(body);
            case "class":
                return By.className(body);
            case "link":
                return By.linkText(body);
            case "xpath":
                return By.xpath(body);
            case "text":
                return By.xpath(String.format("//*[contains(text(), '%s')]", body));
            case "name":
                return By.name(body);
            default:
                return By.xpath(locator);
        }
    }

    public By getLocator() {
        return this.byLocator;
    }

    public WebElement getElement() {
        WebElement element = null;
        if (parent != null) {
            WebElement eleParent = parent.getElement();
            element = eleParent.findElement(getLocator());
        } else {
            element = driver.findElement(getLocator());
        }
        return element;
    }

    public void click() {
        getElement().click();
    }

    public void enterValue(String Value){
        click();
        getElement().sendKeys(Value);
    }
}
