package Pages;

import Common.Constant;
import Interaction.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends Actions {

    public static String txtSearch = "//input[@title='Tìm kiếm' or @title= 'Search'";
    public static String iconSearch = "iconSearch";

    public WebDriver driver;
    public WebElement e;

    public void enterSearchbtn(String keyword){
        findElement(txtSearch);
        e.sendKeys(keyword);
    }

    public void clickSearchIcon(){
        findElement(Constant.SEARCHPAGE.ICON_SEARCH);
        click(Constant.SEARCHPAGE.ICON_SEARCH);
    }


}
