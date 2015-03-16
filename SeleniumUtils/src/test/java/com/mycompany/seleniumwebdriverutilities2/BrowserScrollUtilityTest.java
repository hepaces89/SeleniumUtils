/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebdriverutilities2;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author hubert
 */
public class BrowserScrollUtilityTest {
    private static WebDriver browser;
    public BrowserScrollUtilityTest() {
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
     * Test of executeScroll method, of class BrowserScrollUtility.
     */
    @Test
    public void testVerticalScrolling() {
        System.out.println("executeScroll");
        browser.get("https://news.ycombinator.com/news");
        int pixelsToScrollHorizontally = 0;
        int pixelsToScrollVertically = 50;
        BrowserScrollUtility.executeScroll(browser, pixelsToScrollHorizontally, pixelsToScrollVertically);
        Point topLeft = ScreenShotUtility.getViewPortTopLeftCorner(browser);
        Assert.assertTrue(topLeft.getY() == pixelsToScrollVertically);
    }
    
}
