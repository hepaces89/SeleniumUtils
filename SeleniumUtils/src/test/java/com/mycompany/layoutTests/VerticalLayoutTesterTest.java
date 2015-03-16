/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.layoutTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

/**
 *
 * @author hubert
 */
public class VerticalLayoutTesterTest {
    
    public VerticalLayoutTesterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of testVerticalSpacingBetweenTwoElements method, of class VerticalLayoutTester.
     */
    @Test
    public void testTestVerticalSpacingBetweenTwoElements() {
        System.out.println("testVerticalSpacingBetweenTwoElements");
        
        Point webElem1Orig = new Point(10, 10);
        Dimension webElem1Dim = new Dimension(30, 30);
        Point webElem2Orig = new Point(10, 100);
        Dimension webElem2Dim = new Dimension(30, 30);
        
        WebElement webElement1 = Mockito.mock(WebElement.class);
        Mockito.when(webElement1.getLocation()).thenReturn(webElem1Orig);
        Mockito.when(webElement1.getSize()).thenReturn(webElem1Dim);
        
        WebElement webElement2 = Mockito.mock(WebElement.class);
        Mockito.when(webElement2.getLocation()).thenReturn(webElem2Orig);
        Mockito.when(webElement2.getSize()).thenReturn(webElem2Dim);
        
        int minVerticalPixelSpacing = 50;
        int maxVerticalPixelSpacing = 70;
        boolean expResult = true;
        boolean result = VerticalLayoutTester.testVerticalSpacingBetweenTwoElements(webElement1, webElement2, minVerticalPixelSpacing, maxVerticalPixelSpacing);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateVerticalSpacingBetweenElements method, of class VerticalLayoutTester.
     */
    @Test
    public void testCalculateVerticalSpacingBetweenElements() {
        System.out.println("calculateVerticalSpacingBetweenElements");
        
        Point webElem1Orig = new Point(10, 10);
        Dimension webElem1Dim = new Dimension(30, 30);
        Point webElem2Orig = new Point(10, 100);
        Dimension webElem2Dim = new Dimension(30, 30);
        
        WebElement webElement1 = Mockito.mock(WebElement.class);
        Mockito.when(webElement1.getLocation()).thenReturn(webElem1Orig);
        Mockito.when(webElement1.getSize()).thenReturn(webElem1Dim);
        
        WebElement webElement2 = Mockito.mock(WebElement.class);
        Mockito.when(webElement2.getLocation()).thenReturn(webElem2Orig);
        Mockito.when(webElement2.getSize()).thenReturn(webElem2Dim);
        
        int expResult = 60;
        int result = VerticalLayoutTester.calculateVerticalSpacingBetweenElements(webElement1, webElement2);
        assertEquals(expResult, result);
    }
    
}
