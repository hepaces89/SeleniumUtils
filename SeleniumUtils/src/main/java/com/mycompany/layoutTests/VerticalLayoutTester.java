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
public class VerticalLayoutTester {
    public static boolean testVerticalSpacingBetweenTwoElements(
            WebElement webElement1, 
            WebElement webElement2, 
            int minVerticalPixelSpacing, 
            int maxVerticalPixelSpacing)
    {
        boolean isValidVerticalSpacing = false;
        
        int verticalSpacingBetweenElements = calculateVerticalSpacingBetweenElements(webElement1, webElement2);
        
        if(verticalSpacingBetweenElements < maxVerticalPixelSpacing && verticalSpacingBetweenElements > minVerticalPixelSpacing){
            isValidVerticalSpacing = true;
        }
        
        return isValidVerticalSpacing;
    }

    public static int calculateVerticalSpacingBetweenElements(WebElement webElement1, WebElement webElement2) {
        WebElement upperWebElement = webElement1;
        WebElement lowerWebElement = webElement2;
        if(lowerWebElement.getLocation().getY() < upperWebElement.getLocation().getY()){
            upperWebElement = webElement2;
            lowerWebElement = webElement1;
        }
        int bottomOfTopElement = upperWebElement.getLocation().getY()+upperWebElement.getSize().getHeight();
        int topOfBottomElement = lowerWebElement.getLocation().getY();
        int verticalSpacingBetweenElements = topOfBottomElement - bottomOfTopElement;
        return verticalSpacingBetweenElements;
    }
}
