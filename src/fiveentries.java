import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class fiveentries {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"scrolling-around\"]")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));

//Creating object of an Actions class
        Actions action = new Actions(driver);
        Thread.sleep(5000);
//Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();

        WebElement act = driver.findElement(By.id("zone2-entries"));
        WebElement act2 = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));


        action.moveToElement(act).perform();

        for(int i=0; i<5; i++){
            action.moveToElement(act2).perform();
            action.moveToElement(act).perform();
        }




        List<WebElement> elements = driver.findElements(By.id("zone2-entries"));



        for (WebElement e : elements) {

            System.out.println(e.getText());


        }
    }
}










