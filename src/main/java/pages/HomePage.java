package pages;

import controls.common.Button;
import controls.common.Textbox;

public class HomePage {

    Textbox txtSearch = new Textbox("//input[@title='Tìm kiếm' or @title= 'Search'");
    Button iconSearch = new Button("//div[@class='iblpc']");

    public void enterSearchbtn(String keyword){
        txtSearch.click();
        txtSearch.enterValue(keyword);
    }

    public void clickSearchIcon(){
        iconSearch.click();
    }
}
