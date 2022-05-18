import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class UserName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");
        WebElement searchBox = driver.findElement(By.id("mui-1"));

        searchBox.sendKeys("Admin");
        WebElement searchBox2 = driver.findElement(By.id("mui-2"));

        searchBox2.sendKeys("12345");
        WebElement button= driver.findElement(By.tagName("button"));
        button.click();
    }
}