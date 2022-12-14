package google;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {


        @Test
        public void testeGoogle() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            driver.findElement(By.name("q")).sendKeys("Iron Man");
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[2]/div/div[2]/div[1]/span")).click();
            String texto = driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[2]/div/div/div[1]/div/a/div/div")).getText();
            Assert.assertEquals("Texto Invalido", "Iron Man", "Iron Man");


    }

}
