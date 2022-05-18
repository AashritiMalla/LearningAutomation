//Write a selenium script to goto https://qrgenerator.technologychannel.org/,
// type "Learning Selenium" in typing box and take screenshot.
//Name:Aashriti Malla

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Scancode {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://qrgenerator.technologychannel.org/");

        driver.manage().window().maximize();

        WebElement Msgbox= driver.findElement(By.xpath("//*[@id=\"input\"]"));

        Thread.sleep(3000);
        Msgbox.sendKeys("Learning Selenium");

        Thread.sleep(3000);
        //Take a Screen shot from website
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\hello\\website.png"));
    }
}
