package com.facebook;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;


public class AppTest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\Facebook1\\driver\\Edge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void testFacebookTitle() {
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue("Title should contain 'Facebook'", title.contains("Facebook"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



