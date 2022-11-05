package cep;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CepTest {
    @Test

    public void ceptestando() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("endereco")).sendKeys("04366000");

//        Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"btn_pesquisar\"]")).click();
        //Thread.sleep(2000);
//        String texto = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
//        Assert.assertEquals("Texto Invalido","Avenida Cupecê - até 3670 - lado par", texto);

        //Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.id("tipoCEP")));
        select.selectByVisibleText("Localidade/Logradouro");
        driver.findElement(By.xpath("//*[@id=\"btn_pesquisar\"]")).click();
        String logradouro = driver.findElement(By.xpath("//*[@id=\"resultado-DNEC\"]/tbody/tr/td[1]")).getText();
        Assert.assertEquals("Endereço Invalido", "Avenida Cupecê - até 3670 - lado par", logradouro);





    }
}
