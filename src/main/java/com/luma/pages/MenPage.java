package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MenPage extends Utility {
    By menMenu = By.xpath("//span[contains(text(),'Men')]");
    By bottom = By.xpath("//a[@id='ui-id-18']");
    By pant = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By CronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//dd[contains(text(),'32')]");
    By colourBlack = By.xpath("//div[@class='swatch-option color'])[1]");
    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')])[1]");
    By actualmessage = By.xpath("//div[@class='message-success success message']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");


    //public void mouseHoverOnMenMenu(){
    //  mouseHoverToElement(menMenu);
//}
//public void mouseHoverOnBottom(){
    // mouseHoverToElement(bottom);
//}
    public void mouseHoverOnMenMenuBottomMenuAndClickOnPant() {
        mouseHoverActionforThree(menMenu, bottom, pant);
    }

    public void mouseHoverOnCronusYogaPantAndClickon32() {
        mouseHoverActionForTwo(CronusYogaPant, size32);

    }

    public void mouseHoverOnCronusYogaPantClickOnBlackColour() {
        mouseHoverActionForTwo(CronusYogaPant, colourBlack);
    }

    public void mouseHoverOnCPantAndClickAddToCart() {
        mouseHoverToElement(CronusYogaPant);
        mouseHoverToElementAndClick(addToCart);
    }

    public void VerifyTheTextMessage() {
        assertVerifyText(actualmessage, "You added Cronus Yoga Pant to your shopping cart.", "Both MESSAGES ARE EQUAL");
    }

    public void verifyShoppingcartText() {
        String actual = getTextFromElement(shoppingCart);
        Assert.assertEquals(actual, "shopping cart.", "Both text are not equal");
    }
}
