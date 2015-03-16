/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebdriverutilities2;

import java.awt.image.BufferedImage;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author hubert
 */
public class ScreenShotUtilityTest {
    private static WebDriver browser;
    public ScreenShotUtilityTest() {
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

//    /**
//     * Test of takeScreenShot method, of class ScreenShotUtility.
//     */
//    @Test
//    public void testTakeScreenShot() throws Exception {
//        System.out.println("takeScreenShot");
//        
//        BufferedImage expResult = null;
//        BufferedImage result = ScreenShotUtility.takeScreenShot(browser);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of saveScreenShotToFile method, of class ScreenShotUtility.
//     */
//    @Test
//    public void testSaveScreenShotToFile() throws Exception {
//        System.out.println("saveScreenShotToFile");
//        browser.get("https://news.ycombinator.com/news");
//        File target = new File("D:\\stuff\\browserDownloads\\foo.png");
//        ScreenShotUtility.saveScreenShotToFile(browser, target);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of getScreenShotOfElement method, of class ScreenShotUtility.
//     */
//    @Test
//    public void testGetScreenShotOfElement() throws Exception {
//        System.out.println("getScreenShotOfElement");
//        
//        WebElement element = null;
//        BufferedImage expResult = null;
//        BufferedImage result = ScreenShotUtility.getScreenShotOfElement(browser, element);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getViewPortImage method, of class ScreenShotUtility.
//     */
//    @Test
//    public void testGetViewPortImage() throws Exception {
//        System.out.println("getViewPortImage");
//        WebDriver browser = null;
//        BufferedImage expResult = null;
//        BufferedImage result = ScreenShotUtility.getViewPortImage(browser);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getViewPortTopLeftCorner method, of class ScreenShotUtility.
//     */
//    @Test
//    public void testGetViewPortTopLeftCorner() {
//        System.out.println("getViewPortTopLeftCorner");
//        WebDriver browser = null;
//        Point expResult = null;
//        Point result = ScreenShotUtility.getViewPortTopLeftCorner(browser);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getViewPortDimension method, of class ScreenShotUtility.
//     */
//    @Test
//    public void testGetViewPortDimension() {
//        System.out.println("getViewPortDimension");
//        WebDriver browser = null;
//        Dimension expResult = null;
//        Dimension result = ScreenShotUtility.getViewPortDimension(browser);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
