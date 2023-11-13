package lt.meirita.pom.pages;

public class LoginPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void enterEmail(String email) {
        Common.sendKeysToElement(
                Locator.EastIsland.Login.emailInput,
                email
        );
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(
                Locator.EastIsland.Login.passwordInput,
                password
        );
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.EastIsland.Login.buttonLogin);
    }

    public static String readMessageOrders() {
        return Common.getTextFromElement(Locator.EastIsland.Login.paragraphOrders);
    }

    public static String readMessageError() {
        return Common.getTextFromElement(Locator.EastIsland.Login.paragraphError);
    }
}
