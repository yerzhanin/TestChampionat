package Championat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test;

public class MainPage {
    public static final String HEADER = "//*[contains(@class, 'headerTitle')]";
    public static final String SEARCH_BUTTON = "//*[contains(@class, 'search')]";
    public static final String SEARCH_RESULT = "//*[@id=\"sideColumn\"]";

    static WebDriver driver = new ChromeDriver();

    @Test
    public void verifyMainPage () {
        driver.get("http://www.bvf.by/");
        String Expected = driver.findElement(By.xpath(HEADER)).getText();
        Assert.assertEquals(Expected, "БЕЛОРУССКАЯ ФЕДЕРАЦИЯ ВОЛЕЙБОЛА");
    }

}
