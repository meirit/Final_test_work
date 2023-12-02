package lt.meirita.pom.tests.east_island;

import lt.meirita.pom.pages.east_island.LogoutPage;
import lt.meirita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        LogoutPage.openChrome("https://eastisland.lt/paskyra/uzsakymai/");

    }

    @Test
    public void testLogout() {

        String email = "tester13139@gmail.com";
        String password = "31TestCla33ss$13";
        String expectedResult = "Prisijungti";
        String actualResult;

        LogoutPage.enterEmail(email);
        LogoutPage.enterPassword(password);
        LogoutPage.clickOnButtonLogin();
        LogoutPage.clickOnButtonLogout();
        actualResult = LogoutPage.readMessageLogin();

        Assert.assertEquals(actualResult, expectedResult);

    }


}
