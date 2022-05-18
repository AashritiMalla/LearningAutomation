import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pricecomparison1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.amazon.com/Apple-iPhone-13-Pro-Max/dp/B09LPDM924/ref=sr_1_3?crid=2OS2EFMV19BT&keywords=price%2Bof%2Biphone%2B13%2Bpro%2Bmax&qid=1652315104&sprefix=price%2Bof");
        String price = driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]/span[1]/span[2]")).getText();

        driver.get("https://www.ebay.com/itm/165075692529?epid=6049292400&hash=item266f472bf1:g:wkUAAOSwlvthQ5FM");
        String price1 = driver.findElement(By.xpath("//*[@id=\"prcIsum\"]")).getText();

        System.out.println("The price of iphone 13 pro max at Amazon" + " " + price);
        System.out.println("The price of iphone 13 pro max at Ebay" + " " + price1);

        price = price.replace("$", " ");
        price1 = price1.replace("$", " ");
       Float dprice=Float.parseFloat(price);
        Float dprice1=Float.parseFloat(price1);
        if (dprice>dprice1) {
            System.out.println("The price of iphone 13 is cheaper at Amazon than other  store");

        } else if (dprice1>dprice) {
            System.out.println("The price of iphone 13 is cheaper at Ebay than other store");

        } else {

            System.out.println("something went wrong");
        }
    }
}
