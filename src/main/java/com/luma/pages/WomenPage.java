package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
By Womenmenu =By.xpath("//span[contains(text(),'Women')]");
By TopMenu= By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
By clickOnJacket= By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
By filterProductName =By.xpath("(//select[@id='sorter'])[1])");
By filterPrice = By.xpath("//span[@class='price-wrapper ']//span");
By productNames= By.xpath("/span[@class='price-wrapper ']//span");



public void hoverOnWomenMenuTopMenuAndClickOnJacket()
{
mouseHoverActionforThree(Womenmenu,TopMenu,clickOnJacket);

}
public void  SelectbyFilterProductName(){
    selectByVisibleTextFromDropDown(filterProductName,"Product Name");
}

    public void selectbyFilterPrice () {
        selectByVisibleTextFromDropDown(filterProductName, "Price");
    }
    public  void isProductdisplayInAlphabetic(){}



       public void isProductPriceDispalyLowToHigh(){
        List<WebElement> jacketsPriceElementList = driver.findElements(productNames);
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));

        }
    }
}




