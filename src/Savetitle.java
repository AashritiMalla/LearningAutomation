import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import  java.io.FileWriter;

import java.util.List;
import java.util.Set;

public class Savetitle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String sitename=driver.getTitle();
        try {
                FileWriter myWriter = new FileWriter("sitename.txt");
                myWriter.write(sitename);
                myWriter.close();
                System.out.println("Write to file successful.");
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage());
            }
        }

    }

