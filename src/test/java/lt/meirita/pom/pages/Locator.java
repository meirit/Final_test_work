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

        public static class Logout {
            public static By emailInput = By.xpath("//input[@id='username']");
            public static By passwordInput = By.xpath("//input[@id='password']");
            public static By buttonLogin = By.xpath("//button[@name='login']");
            public static By buttonLogout = By.xpath("//a[@class='logout']");
            public static By paragraphLogin = By.xpath("//h2[contains (text(),'Prisijungti')]");
        }

        public static class GiftCoupon {

            public static By amountButton = By.xpath("//span[contains(text(), '200 €')]");
            public static By nameInput = By.xpath("//input[@name='title[]']");
            public static By textInput = By.xpath("//textarea[@name='desc[]']");
            public static By buttonAddToBag = By.xpath("//button[@type='submit']");
            public static By paragraphBasket = By.xpath("//h1[contains (text(),'Basket')]");
        }

        public static class CustomerInformation {

            public static By emailInput = By.xpath("//input[@id='username']");
            public static By passwordInput = By.xpath("//input[@id='password']");
            public static By buttonLogin = By.xpath("//button[@name='login']");
            public static By buttonEditData = By.xpath("//a[contains(text(),'KOREGUOTI')]");
            public static By nameInput = By.xpath("//input[@name='billing_first_name']");
            public static By emailAddressEmail = By.xpath("//input[@name='billing_email']");
            public static By phoneInput = By.xpath("//input[@name='billing_phone']");
            public static By inputReceiverName = By.xpath("//input[@name='shipping_first_name']");
            public static By inputShippingPhone = By.xpath("//input[@name='shipping_phone']");
            public static By addressInput = By.xpath("//input[@name='shipping_address_1']");
            public static By cityInput = By.xpath("//input[@name='shipping_city']");
            public static By postCodeInput = By.xpath("//input[@name='shipping_postcode']");
            public static By buttonSave = By.xpath("(//button[contains(text(), 'IŠSAUGOTI')])[2]");
            public static By paragraphProfileName = By.xpath("//h1[contains(text(),'Laura Jonaite')]");
        }
    }
}
