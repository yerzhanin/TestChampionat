package Championat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSearch extends MainPage {
    @Test
    public void testSearch(){
        WebElement element = driver.findElement(By.xpath(SEARCH_BUTTON));
        element.click();
        element.sendKeys("Манчестер Юнайтед");
        element.submit();
        String Expected = driver.findElement(By.xpath(SEARCH_RESULT)).getText();
        Assert.assertEquals(Expected, "ВОЛЕЙБОЛ\n" +
                " ");

    }
}
