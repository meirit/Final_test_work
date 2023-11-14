package lt.meirita.pom.pages.east_island;

import lt.meirita.pom.pages.Common;
import lt.meirita.pom.pages.Locator;

public class GiftCouponPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void select200EurAmountButton() {
        Common.clickOnElement(Locator.EastIsland.GiftCoupon.amountButton);
    }

    public static void writeReceiverName(String name) {
        Common.sendKeysToElement(
                Locator.EastIsland.GiftCoupon.nameInput,
                name
        );
    }

    public static void writeCouponText(String text) {
        Common.sendKeysToElement(
                Locator.EastIsland.GiftCoupon.textInput,
                text
        );
    }

    public static void clickOnAddToBag() {
        Common.clickOnElement(Locator.EastIsland.GiftCoupon.buttonAddToBag);
    }

    public static String readMessageBasket() {
        return Common.getTextFromElement(Locator.EastIsland.GiftCoupon.paragraphBasket);
    }
}
