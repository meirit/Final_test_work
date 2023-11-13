package lt.meirita.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class EastIsland {

        public static class AccountRegistration {
            public static By emailInput = By.xpath("//input[@id='reg_email']");
            public static By passwordInput = By.xpath("//input[@id='reg_password']");
            public static By buttonRegister = By.xpath("//button[@name='register']");
            public static By paragraphOrders = By.xpath("//h2[contains(text(),'Užsakymai')]");
            public static By paragraphError = By.xpath("//strong[contains (text(),'Klaida')]");
        }

        public static class Login {

            public static By emailInput = By.xpath("//input[@id='username']");
            public static By passwordInput = By.xpath("//input[@id='password']");
            public static By buttonLogin = By.xpath("//button[@name='login']");
            public static By paragraphOrders = By.xpath("//h2[contains(text(),'Užsakymai')]");
            public static By paragraphError = By.xpath("//strong[contains (text(),'Error')]");
        }
    }
}
