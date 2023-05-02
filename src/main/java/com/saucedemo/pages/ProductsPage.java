package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
/**
 * Created By Nikunja A Senjalia
 */
public class ProductsPage extends Utility {

    By actualProducts = By.xpath("//div[@class='inventory_item']");

    public int getactualSizeOfProducts(){
    return countItem(actualProducts);
    }

}
