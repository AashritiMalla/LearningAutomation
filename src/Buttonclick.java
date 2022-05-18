import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;


public class Buttonclick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"button-clicks\"]/div/div[1]")).click();
        ArrayList tabs =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
        driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")).click();

driver.close();

    }

}