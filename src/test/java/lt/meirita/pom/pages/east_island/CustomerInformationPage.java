package lt.meirita.pom.pages.east_island;

import lt.meirita.pom.pages.Common;
import lt.meirita.pom.pages.Locator;

public class CustomerInformationPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.emailInput,
                email
        );
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.passwordInput,
                password
        );
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.EastIsland.CustomerInformation.buttonLogin);
    }

    public static void clickOnButtonEditMyData() {
        Common.clickOnElement(Locator.EastIsland.CustomerInformation.buttonEditData);
    }

    public static void enterName(String name) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.nameInput,
                name
        );
    }

    public static void enterEmailAddress(String email) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.emailAddressEmail,
                email
        );
    }

    public static void enterMobilePhone(String phoneNumber) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.phoneInput,
                phoneNumber
        );
    }

    public static void enterShippingName(String name) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.inputReceiverName,
                name
        );
    }

    public static void enterShippingPhone(String phone) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.inputShippingPhone,
                phone
        );

    }

    public static void enterShippingAddress(String address) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.addressInput,
                address
        );
    }

    public static void enterShippingCity(String city) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.cityInput,
                city
        );
    }

    public static void enterPostCode(String postCode) {
        Common.sendKeysToElement(
                Locator.EastIsland.CustomerInformation.postCodeInput,
                postCode
        );
    }

    public static void clickOnButtonSave() {
        Common.clickOnElement(Locator.EastIsland.CustomerInformation.buttonSave);
    }

    public static String readCustomerPtofileName() {
        return Common.getTextFromElement((Locator.EastIsland.CustomerInformation.paragraphProfileName));
    }
}
