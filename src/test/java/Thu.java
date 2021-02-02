import Common.BaseTest;
import Pages.SearchPage;
import org.testng.annotations.Test;

public class Thu extends BaseTest {

    SearchPage searchPage;

    @Test
    public void TestCase1() {
        searchPage = new SearchPage();
        searchPage.enterSearchbtn("do");
    }
}
