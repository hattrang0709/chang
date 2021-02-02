package controls.common;

import controls.base.BaseControl;
import org.openqa.selenium.By;

public class Textbox extends BaseControl {

    public Textbox(String locator) {
        super(locator);
    }

    public Textbox(By locator) {
        super(locator);
    }

    public Textbox(String locator, Object... value) {
        super(locator, value);
    }

    public Textbox(BaseControl parent, String locator) {
        super(parent, locator);
    }

    public Textbox(BaseControl parent, By locator) {
        super(parent, locator);
    }

    public Textbox(BaseControl parent, String locator, Object... value) {
        super(parent, locator, value);
    }

}
