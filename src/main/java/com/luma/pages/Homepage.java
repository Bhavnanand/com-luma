package com.luma.pages;


import com.luma.utilities.Utility;
import org.openqa.selenium.By;


public class Homepage extends Utility {
    By Womenmenu = By.xpath("//span[contains(text(),'Women')]");
    By TopMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu = By.xpath("//span[contains(text(),'Men')]");
    By bottom = By.xpath("//a[@id='ui-id-18']");
    By pant = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void hoverOnWomenMenuTopMenuAndClickOnJacket() {
        mouseHoverActionforThree(Womenmenu, TopMenu, clickOnJacket);

    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() {
        mouseHoverToElement(bottom);
    }

    public void mouseHoverOnMenMenuBottomMenuAndClickOnPant() {
        mouseHoverActionforThree(menMenu, bottom, pant);
    }

    public void mouseHoverOnGearMenuAndclickOnBags() {
        mouseHoverActionForTwo(gearMenu, bags);
    }

}
