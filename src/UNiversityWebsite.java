import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UNiversityWebsite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
        WebElement Clickbutton = driver.findElement(By.xpath("//*[@id=\"button1\"]"));

        Clickbutton.click();
        Thread.sleep(2000);
        WebElement Closebutton=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        Closebutton.click();
        driver.close();
    }
}