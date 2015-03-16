package com.mycompany.browserManipulationUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author hubert
 */
public class BrowserResizerUtility {
    
    /**
     * Resizes the browser controlled by the WebDriver driver so that external frame (not the view port) fits the inputed dimensions
     * sourced from http://stackoverflow.com/questions/16664433/how-to-resize-current-browser-window-in-selenium-webdriver-with-java
     * @param browser
     * @param xDim
     * @param yDim 
     */
    public static void resizeExternalBrowserWindow(WebDriver browser, int xDim, int yDim){
        Dimension dimension = new Dimension(xDim, yDim);
        browser.manage().window().setSize(dimension);
    }
    
    public static int convertInternalViewPortWidthToExtenalBrowserWidth(int innerWidth, WebDriver browser){
        int externalWidth = -1;
        if((System.getProperty("os.name").contentEquals("Windows 8")) && browser instanceof FirefoxDriver){
            return innerWidth + 31;
        }
        return externalWidth;
    }
}
