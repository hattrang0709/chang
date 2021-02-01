import Common.BaseTest;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class Thu extends BaseTest {
//    SearchPage page = new SearchPage();

    @Test
    public void TestCase1(){
        SearchPage page = new SearchPage();
        openBrowser();
        page.enterSearchbtn("do");
    }
}
