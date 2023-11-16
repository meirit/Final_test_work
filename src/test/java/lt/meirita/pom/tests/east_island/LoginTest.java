package lt.meirita.pom.tests.east_island;

import lt.meirita.pom.pages.east_island.LoginPage;
import lt.meirita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openChrome("https://eastisland.lt/paskyra/uzsakymai/");

    }

    @Test

    public void testPositiveLogin() {
        String email = "meiritatester@gmail.com";
        String password = "28TestClass$";
        String expectedResult = "Užsakymai";
        String actualResult;

        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonLogin();
        actualResult = LoginPage.readMessageOrders();

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test

    public void testNegativeLogin() {
        String email = "meiritatester@gmail.com";
        String password = "  ";
        String expectedResult = "Error";
        String actualResult;

        LoginPage.enterEmail(email);
        LoginPage.enterPassword(password);
        LoginPage.clickOnButtonLogin();
        actualResult = LoginPage.readMessageError();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );

    }
}
