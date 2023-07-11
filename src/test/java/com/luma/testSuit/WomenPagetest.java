package com.luma.testSuit;

import com.luma.pages.WomenPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenPagetest extends BaseTest {
    WomenPage womenPage=new WomenPage();
    //Write down the following test into WomenTestclass
    @Test
    public void verifyTheSortByProductNameFilter() {

//* Mouse Hover on Women Menu ,on Tops and Click on Jackets
        womenPage.hoverOnWomenMenuTopMenuAndClickOnJacket();
//* Select Sort By filter “Product Name”
        womenPage.SelectbyFilterProductName();

//* Verify the products name display in alphabetical order
        womenPage.isProductdisplayInAlphabetic();
    }

    @Test

    public void verifyTheSortByPriceFilter() {
//* Mouse Hover on Women Menu,Mouse Hover on Tops and Click on Jackets
        womenPage.hoverOnWomenMenuTopMenuAndClickOnJacket();
//* Select Sort By filter “Price”
        womenPage.selectbyFilterPrice();
//* Verify the products price display in Low to High
        womenPage.isProductPriceDispalyLowToHigh();
    }
}