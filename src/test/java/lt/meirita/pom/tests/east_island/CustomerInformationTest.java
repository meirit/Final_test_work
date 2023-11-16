package lt.meirita.pom.tests.east_island;

import lt.meirita.pom.pages.east_island.CustomerInformationPage;
import lt.meirita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerInformationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        CustomerInformationPage.openChrome("https://eastisland.lt/paskyra/uzsakymai/");
    }

    @Test
    public void testAddCustomerInformation() {

        String email = "meiritatester1233456789@gmail.com";
        String password = "28TestCla33ss$22345678";
        String name = "Laura Jonaite";
        String phoneNumber = "+37067239745";
        String address = "Aguonu 13-5";
        String city = "Vilnius";
        String postCode = "02617";
        String expectedResult = "Laura Jonaite";
        String actualResult;

        CustomerInformationPage.enterEmail(email);
        CustomerInformationPage.enterPassword(password);
        CustomerInformationPage.clickOnButtonLogin();
        CustomerInformationPage.clickOnButtonEditMyData();
        CustomerInformationPage.enterName(name);
        CustomerInformationPage.enterEmailAddress(email);
        CustomerInformationPage.enterMobilePhone(phoneNumber);
        CustomerInformationPage.enterShippingName(name);
        CustomerInformationPage.enterShippingPhone(phoneNumber);
        CustomerInformationPage.enterShippingAddress(address);
        CustomerInformationPage.enterShippingCity(city);
        CustomerInformationPage.enterPostCode(postCode);
        CustomerInformationPage.clickOnButtonSave();
        actualResult = CustomerInformationPage.readCustomerProfileName();

        Assert.assertEquals(actualResult, expectedResult);

    }
}
