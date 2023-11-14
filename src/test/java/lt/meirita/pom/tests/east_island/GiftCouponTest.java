package lt.meirita.pom.tests.east_island;

import lt.meirita.pom.pages.east_island.GiftCouponPage;
import lt.meirita.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCouponTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        GiftCouponPage.openChrome("https://eastisland.lt/en/dovanu-kuponas/");
    }

    @Test

    public void testAddGiftCouponToCart(){
        String name = "Diana";
        String text = "Happy Birthday!";
        String expectedResult = "Basket";
        String actualResult;

        GiftCouponPage.select200EurAmountButton();
        GiftCouponPage.writeReceiverName(name);
        GiftCouponPage.writeCouponText(text);
        GiftCouponPage.clickOnAddToBag();
        actualResult = GiftCouponPage.readMessageBasket();

        Assert.assertEquals(actualResult, expectedResult);
    }

}
