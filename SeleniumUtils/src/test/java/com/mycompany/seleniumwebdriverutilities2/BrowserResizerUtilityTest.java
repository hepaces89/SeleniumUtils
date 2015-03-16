/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebdriverutilities2;

import java.awt.image.BufferedImage;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author hubert
 */
public class BrowserResizerUtilityTest {
    private static WebDriver browser;
    public BrowserResizerUtilityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        browser = new FirefoxDriver();
    }
    
    @AfterClass
    public static void tearDownClass() {
        browser.close();
        browser.quit();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of resizeExternalBrowserWindow method, of class BrowserResizerUtility.
     */
    @Test
    public void testResizeBrowser() throws IOException {
        System.out.println("resizeBrowser");
        browser.get("https://news.ycombinator.com/news");
        
        int xDim = 900;
        int yDim = 300;
        
        BrowserResizerUtility.resizeExternalBrowserWindow(browser, xDim, yDim);
        BufferedImage screenShot = ScreenShotUtility.takeScreenShot(browser);
        Assert.assertTrue("The resized browser's screen capture should be yDim high, but was " + screenShot.getHeight() + " high.", screenShot.getHeight() > 1200);
        Assert.assertTrue("The resized browser's screen capture should be xDim wide, but was " + screenShot.getWidth() + " wide.", screenShot.getWidth() > 800);
        
        
        xDim = 500;
        yDim = 600;
        BrowserResizerUtility.resizeExternalBrowserWindow(browser, xDim, yDim);
        screenShot = ScreenShotUtility.takeScreenShot(browser);
        Assert.assertTrue("The resized browser's screen capture should be yDim high, but was " + screenShot.getHeight() + " high.",  screenShot.getHeight() > 1001);
        Assert.assertTrue("The resized browser's screen capture should be xDim wide, but was " +  screenShot.getWidth() + " wide.",  screenShot.getWidth() > 400);
        
        Dimension vpDim = ScreenShotUtility.getViewPortDimension(browser);
        Assert.assertTrue("values should have matched: vp width: " + vpDim.width + " , ss width: " + screenShot.getWidth(),vpDim.getWidth() == screenShot.getWidth());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
