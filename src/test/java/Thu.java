
import org.testng.annotations.Test;
import pages.HomePage;

public class Thu extends BaseTest {

    HomePage home = new HomePage();

    @Test
    public void TestCase1() {
        home.enterSearchbtn("mau do");
        home.clickSearchIcon();
    }
}
