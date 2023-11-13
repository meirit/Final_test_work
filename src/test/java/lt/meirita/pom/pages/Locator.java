package lt.meirita.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class EastIsland {

        public static class AccountRegistration {
            public static By emailInput = By.xpath("//input[@id='reg_email']");
            public static By passwordInput = By.xpath("//input[@id='reg_password']");
            public static By buttonRegister = By.xpath("//button[@name='register']");
        }
    }
}
