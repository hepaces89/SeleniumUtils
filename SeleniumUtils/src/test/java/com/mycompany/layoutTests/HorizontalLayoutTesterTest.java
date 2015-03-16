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
public class HorizontalLayoutTesterTest {
    
    public HorizontalLayoutTesterTest() {
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
     * Test of calculateHorizontalSpacingBetweenTwoElements method, of class HorizontalLayoutTester.
     */
    @Test
    public void testCalculateHorizontalSpacingBetweenTwoElements_overlapCase() {
        System.out.println("calculateHorizontalSpacingBetweenTwoElements");
        
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
        
        Integer expResult = -30;
        Integer result = HorizontalLayoutTester.calculateHorizontalSpacingBetweenTwoElements(webElement1, webElement2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateHorizontalSpacingBetweenTwoElements_nonOverlapCase() {
        System.out.println("calculateHorizontalSpacingBetweenTwoElements");

        Point webElem1Orig = new Point(10, 10);
        Dimension webElem1Dim = new Dimension(30, 30);
        Point webElem2Orig = new Point(100, 100);
        Dimension webElem2Dim = new Dimension(30, 30);

        WebElement webElement1 = Mockito.mock(WebElement.class);
        Mockito.when(webElement1.getLocation()).thenReturn(webElem1Orig);
        Mockito.when(webElement1.getSize()).thenReturn(webElem1Dim);

        WebElement webElement2 = Mockito.mock(WebElement.class);
        Mockito.when(webElement2.getLocation()).thenReturn(webElem2Orig);
        Mockito.when(webElement2.getSize()).thenReturn(webElem2Dim);

        Integer expResult = 60;
        Integer result = HorizontalLayoutTester.calculateHorizontalSpacingBetweenTwoElements(webElement1, webElement2);
        assertEquals(expResult, result);
    }
}
