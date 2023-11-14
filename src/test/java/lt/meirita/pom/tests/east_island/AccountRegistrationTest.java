package lt.meirita.pom.tests.east_island;

import lt.meirita.pom.pages.east_island.AccountRegistrationPage;
import lt.meirita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountRegistrationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        AccountRegistrationPage.openChrome("https://eastisland.lt/paskyra/uzsakymai/");

    }

    @Test

    public void testPositiveAccountRegistration() {

        String email = "meiritatester123@gmail.com";
        String password = "28TestClass$223";
        String expectedResult = "Užsakymai";
        String actualResult;

        AccountRegistrationPage.enterEmail(email);
        AccountRegistrationPage.enterPassword(password);
        AccountRegistrationPage.clickOnButtonRegister();
        actualResult = AccountRegistrationPage.readMessageOrders();

        Assert.assertEquals(actualResult,expectedResult);

    }
    @DataProvider(name = "accountRegistrationTest")
    public Object[][] provideDataAccountRegistration() {
        return new Object[][]{
                {"  ", "28TestClass$223", "Klaida" },
                {"registrator@yahoo","28TestClass$223", "Klaida"}

        };
    }

    @Test (dataProvider = "accountRegistrationTest")

    public void testNegativeAccountRegistration(String email, String password, String expectedResult ){

        String actualResult;


        AccountRegistrationPage.enterEmail(email);
        AccountRegistrationPage.enterPassword(password);
        AccountRegistrationPage.clickOnButtonRegister();
        actualResult = AccountRegistrationPage.readMessageError();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }



}
