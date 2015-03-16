/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.browserManipulationUtilities;

import com.mycompany.browserManipulationUtilities.ScreenShotUtility;
import com.mycompany.browserManipulationUtilities.BrowserResizerUtility;
import java.awt.image.BufferedImage;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author hubert
 */
public class BrowserCalibration {
    private static WebDriver browser;
    
    public BrowserCalibration() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void calibrateFirefoxDriverWidth() throws IOException{
        browser.get("https://news.ycombinator.com/news");
        int testWidth = 0;
        System.out.println("testExternalWidth, internalWidth");
        for(int i = 1; i <= 15; i++){
            testWidth = i*100;
            int yDim = 900;

            BrowserResizerUtility.resizeExternalBrowserWindow(browser, testWidth, yDim);
            BufferedImage screenShot = ScreenShotUtility.takeScreenShot(browser);
            System.out.println("" + testWidth + ", " + screenShot.getWidth());
        }
    }
}
