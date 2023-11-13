package lt.meirita.pom.pages.east_island;

import lt.meirita.pom.pages.Common;
import lt.meirita.pom.pages.Locator;

public class AccountRegistrationPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(
                Locator.EastIsland.AccountRegistration.emailInput,
                email
        );
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locator.EastIsland.AccountRegistration.passwordInput,
                password
        );
    }

    public static void clickOnButtonRegister() {
        Common.clickOnElement(Locator.EastIsland.AccountRegistration.buttonRegister);
    }

    public static String readMessageOrders() {
        return Common.getTextFromElement(Locator.EastIsland.AccountRegistration.paragraphOrders);
    }

    public static String readMessageError() {
        return Common.getTextFromElement(Locator.EastIsland.AccountRegistration.paragraphError);
    }
}
