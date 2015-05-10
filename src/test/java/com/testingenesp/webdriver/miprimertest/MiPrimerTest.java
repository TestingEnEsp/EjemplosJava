package com.testingenesp.webdriver.miprimertest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by TestingEnEsp on 10/05/2015.
 */
public class MiPrimerTest {

    @Test
    public void verificarTituloBlog(){
        WebDriver driver= new FirefoxDriver();

        driver.navigate().to("http://josepablosarco.wordpress.com");

        Assert.assertTrue("El titulo debe contener Testing", driver.getTitle().contains("Testing"));

        driver.close();

        driver.quit();


    }
}
