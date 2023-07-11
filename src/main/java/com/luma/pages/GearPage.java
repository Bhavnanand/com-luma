package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GearPage extends Utility {
    By gearMenu= By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");
    By oNDuffle= By.xpath("//a[contains(text(),'Overnight Duffle')]");
    By quqntity= By.xpath("//input[@id='qty']");
    By addToCart=By.xpath("//button[@id='product-addtocart-button']");
    By shoppingCartLink =By.xpath("//a[normalize-space()='shopping cart']");
    By quantity =By.xpath("//input[@title='Qty']\"), \"value\")");
    By updateShoppingCart=By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice =By.xpath("//span[@class='cart-price']//span)[2]");
public void clickonDuffle(){
    clickOnElement(oNDuffle);
}
public void VerifyDuffle(){
    String actual =getTextFromElement(oNDuffle);
    Assert.assertEquals(actual,"Overnight Duffle","Both text are not equal");
}
public void changeQuantity3(){
    sendTextToElement(quqntity,"3");
}
public void addToCart(){
    clickOnElement(addToCart);
}
public void VerifiMessageYouAddedDuffleToCart(){
    String actual=getTextFromElement(By.id("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    Assert.assertEquals(actual, "You added Overnight Duffle to your ","Both message are not equal");
}
public void verifyShopingcartLink(){
    String actual =getTextFromElement(shoppingCartLink);
    Assert.assertEquals(actual,"shopping cart.","Both message are not equal" );
}
public void verifyQuantity3(){

    Assert.assertEquals(getNumberFromElement(quqntity),"3");
}
public void changeQuantity5()
    {
        sendTextToElement(quqntity,"5");
    }
    public void clickOnUpdateShoppingCart(){
    clickOnElement(updateShoppingCart);
    }
    public void productpriceverify(){
    float pprice=getNumberFromElement(productPrice);
        Assert.assertEquals(pprice,"225.00");
    }
}
