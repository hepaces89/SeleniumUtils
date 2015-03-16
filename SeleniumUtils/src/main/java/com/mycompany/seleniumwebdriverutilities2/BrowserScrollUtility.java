/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seleniumwebdriverutilities2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Convenience Utiltity to scroll web pages with Selenium WebDriver
 * Inspired from: http://stackoverflow.com/questions/27189182/how-to-scroll-a-specific-div-using-selenium-webdriver
 * and: http://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java
 * 
 * JS view port info for future tasks:
 * http://stackoverflow.com/questions/1248081/get-the-browser-viewport-dimensions-with-javascript
 * http://www.w3schools.com/jsref/prop_win_pagexoffset.asp
 * @author hubert
 */
public class BrowserScrollUtility {
    /**
     * 
     * @param browser
     * @param pixelsToScrollHorizontally <- negative (left), (right) positive ->
     * @param pixelsToScrollVertically ^ negative (up), (down) positive v
     */
    public static void executeScroll(WebDriver browser, int pixelsToScrollHorizontally, int pixelsToScrollVertically){
        JavascriptExecutor jseBrowser = (JavascriptExecutor) browser;
        jseBrowser.executeScript("window.scrollBy(" + pixelsToScrollHorizontally + ", " + pixelsToScrollVertically + ")", "");
    }
}
