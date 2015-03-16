package com.mycompany.seleniumwebdriverutilities2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author hubert
 */
public class ScreenShotUtility {
    /**
     * Takes a screen shot of the browser window
     * @param browser
     * @return 
     */
    public static BufferedImage takeScreenShot(WebDriver browser) throws IOException{
        byte[] screenShotData = ((TakesScreenshot)browser).getScreenshotAs(OutputType.BYTES);
        BufferedImage screenShot = null;
        screenShot = ImageIO.read(new ByteArrayInputStream(screenShotData));
        return screenShot;
        //FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        //pulled from http://stackoverflow.com/questions/3422262/take-a-screenshot-with-selenium-webdriver
        //byte image addition pulled from : http://stackoverflow.com/questions/13832322/how-to-capture-the-screenshot-of-only-a-specific-element-using-selenium-webdrive
    }
    
    public static void saveScreenShotToFile(WebDriver browser, File target) throws IOException{
        BufferedImage img = takeScreenShot(browser);
        ImageIO.write(img, "png", target);
    }
    
    /**
     * Captures the image of the element
     * @param browser
     * @param element
     * @return
     * @throws IOException 
     */
    public static BufferedImage getScreenShotOfElement(WebDriver browser, WebElement element) throws IOException{
        BufferedImage fullScreenCapture = takeScreenShot(browser);
        //get location and dimensions of target element
        Point topLeft = element.getLocation();
        Dimension elementDims = element.getSize();
        
        //crop out the desired part of the image
        BufferedImage elementImage = fullScreenCapture.getSubimage(topLeft.getX(), topLeft.getY(), elementDims.getWidth(), elementDims.getHeight());
        return elementImage;
    }
    
    /**
     * Gets an image of what is currently in the view port
     * 
     * JS view port info
     * for future tasks:
     * http://stackoverflow.com/questions/1248081/get-the-browser-viewport-dimensions-with-javascript
     * http://www.w3schools.com/jsref/prop_win_pagexoffset.asp
     * http://stevenbenner.com/2010/04/calculate-page-size-and-view-port-position-in-javascript/
     * 
     * @param browser
     * @return 
     */
    public static BufferedImage getViewPortImage(WebDriver browser) throws IOException{
        BufferedImage fullScreenCapture = takeScreenShot(browser);
        
        Point topLeft = getViewPortTopLeftCorner(browser);
        Dimension viewPortDims = getViewPortDimension(browser);
        
        BufferedImage viewPortImage = null;
        return viewPortImage;
    }
    
    protected static Point getViewPortTopLeftCorner(WebDriver browser){
        JavascriptExecutor jseBrowser = (JavascriptExecutor) browser;
        Integer xOffset = ((Long) jseBrowser.executeScript("return window.pageXOffset", "")).intValue();
        Integer yOffset =  ((Long) jseBrowser.executeScript("return window.pageYOffset", "")).intValue();
        Point topLeft = new Point(xOffset, yOffset);
        return topLeft;
    }
    
    /**
     * Gets the view port dimensions, excluding scrollbar
     * @param browser
     * @return 
     */
    protected static Dimension getViewPortDimension(WebDriver browser){
        JavascriptExecutor jseBrowser = (JavascriptExecutor) browser;
        Integer width = ((Long) jseBrowser.executeScript("return document.documentElement.clientWidth", "")).intValue();
        Integer height = ((Long) jseBrowser.executeScript("return window.innerHeight", "")).intValue();
        Dimension viewPortDimension = new Dimension(width, height);
        return viewPortDimension;
    }
    
}
