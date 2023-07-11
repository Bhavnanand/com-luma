package com.luma.testSuit;

import com.luma.pages.Homepage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenPageTest extends BaseTest {
    Homepage homepage = new Homepage();
    MenPage menPage = new MenPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Men Menu

        //* Mouse Hover on Bottoms

        //* Click on Pants
        homepage.mouseHoverOnMenMenuBottomMenuAndClickOnPant();
        Thread.sleep(1000);

        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on size32.
        menPage.mouseHoverOnCronusYogaPantAndClickon32();
        Thread.sleep(1000);
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
        menPage.mouseHoverOnCronusYogaPantClickOnBlackColour();
        Thread.sleep(1000);
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menPage.mouseHoverOnCPantAndClickAddToCart();
        Thread.sleep(1000
        );
        //* Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        menPage.VerifyTheTextMessage();


        //* Click on ‘shopping cart’ Link into message Verify the text ‘Shopping Cart.’
        shoppingCartPage.verifyShoppingcartText();
        //* Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.verifyTheProductName();
        //* Verify the product size ‘32’
        shoppingCartPage.VerifyTheSize();
        //* Verify the product colour ‘Black’
        shoppingCartPage.veifyColour();
        //
    }
}