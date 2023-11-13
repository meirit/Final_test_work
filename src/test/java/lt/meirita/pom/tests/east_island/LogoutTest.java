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

        String email = "meiritatester@gmail.com";
        String password = "28TestClass$";
        String expectedResult = "";
        String actualResult;

        LogoutPage.enterEmail(email);
        LogoutPage.enterPassword(password);
        LogoutPage.clickOnButtonLogin();
        LogoutPage.clickOnButtonLogout();
        actualResult = LogoutPage.readMessageLogin();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );

    }


}
