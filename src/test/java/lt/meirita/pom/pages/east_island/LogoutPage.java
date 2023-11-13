package lt.meirita.pom.pages.east_island;

import lt.meirita.pom.pages.Common;
import lt.meirita.pom.pages.Locator;

public class LogoutPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(
                Locator.EastIsland.Logout.emailInput,
                email
        );
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locator.EastIsland.Logout.passwordInput,
                password
        );
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.EastIsland.Logout.buttonLogin);
    }

    public static void clickOnButtonLogout() {
        Common.clickOnElement(Locator.EastIsland.Logout.buttonLogout);
    }

    public static String readMessageLogin() {
        return Common.getTextFromElement(Locator.EastIsland.Logout.paragraphLogin);
    }
}
