package com.github.eborgbjerg.webtestpoc;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OpenWebPageTest extends WebTestBase {


    @BeforeClass
    public static void beforeClass() {
        initResources();
    }

    @Before
    public void beforeTest() {
        startDriver();
    }


    @Test
    public void openDatabase() {

        //driver.findElement(By.id("linkHome")).click();
    }

}
