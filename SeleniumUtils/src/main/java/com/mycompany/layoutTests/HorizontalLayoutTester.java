/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.layoutTests;

import org.openqa.selenium.WebElement;

/**
 *
 * @author hubert
 */
public class HorizontalLayoutTester {
    public static Integer calculateHorizontalSpacingBetweenTwoElements(WebElement webElement1, WebElement webElement2){
        Integer horizontalSpacing = null;
        WebElement leftWebElement = webElement1;
        WebElement rightWebElement = webElement2;
        if(rightWebElement.getLocation().getX() < leftWebElement.getLocation().getX()){
            leftWebElement = webElement2;
            rightWebElement = webElement1;
        }
        int rightEdgeOfLeftElement = leftWebElement.getLocation().getX()+leftWebElement.getSize().getWidth();
        int leftEdgeOfRightElement = rightWebElement.getLocation().getX();
        horizontalSpacing = leftEdgeOfRightElement - rightEdgeOfLeftElement;
        
        return horizontalSpacing;
    }
}
