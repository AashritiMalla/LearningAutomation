/*
Fill the contact us form and submit details.
Name: Aashriti Malla
Date:05/10/2022
 */




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class University {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        WebElement Firstname= driver.findElement(By.name("first_name"));
        Firstname.sendKeys("Aashriti");
        WebElement Lastname= driver.findElement(By.name("last_name"));
        Lastname.sendKeys("Malla");
        WebElement Emailad= driver.findElement(By.name("email"));
        Emailad.sendKeys("Aashriti.Malla1997@gmail.com");
        WebElement Comment= driver.findElement(By.name("message"));
        Comment.sendKeys("Computer Science");

        WebElement Submitbutton= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        Submitbutton.click();
        WebElement Resetbutton= driver.findElement(By.tagName("//*[@id=\"form_buttons\"]/input[1]"));
       Resetbutton .click();


    }
}
