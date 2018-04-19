package com.github.eborgbjerg.webtestpoc;


import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


abstract public class WebTestBase {

    private WebDriver driver;

    private final static String appHomePath = "https://www.google.com";


    void startDriver() {
        driver = new FirefoxDriver();
        driver.get(appHomePath);
        //assertStartState();
//        if (link != null) {
//            driver.findElement(By.id(link)).click();
//        }
    }


    static void initResources() {
    }



    @After
    public void afterTest() {
        driver.quit();
    }

//    void assertStartState() {
//        Assert.assertEquals("a", driver.findElement(By.id("linkFindDatabase")).getTagName());
//    }
//
//
//    void navigateHome() {
//        driver.findElement(By.id("linkHome")).click();
//        assertStartState();
//    }


}
