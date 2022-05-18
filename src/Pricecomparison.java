 import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Pricecomparison {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        Thread.sleep(3000);
//        driver.get("https://www.amazon.com/Apple-iPhone-Sierra-Carrier-Subscription/dp/B09G9DKC87/ref=sr_1_3?crid=2XHXK7APZTH7N&keywords=iphone+13+pro+price&qid=1652290326&sprefix=iphone+13+pro+price%");
//        String price = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[2]/div[6]/div/div[2]/div/span[2]")).getText();
//
//
//        driver.get("https://www.ebay.com/itm/154613773340?epid=10049287446&hash=item23ffb2f41c:g:wkUAAOSwlvthQ5FM");
//        String price1 = driver.findElement(By.xpath("//*[@id=\"prcIsum\"]")).getText();
//
//
//        driver.get("https://www.walmart.com/ip/Refurbished-Apple-iPhone-13-Pro-Max-128GB-Fully-Unlocked-Sierra-Blue-Grade-A/572469484");
//        String price2 = driver.findElement(By.xpath(" //*[@id=\"__next\"]/div[1]/div/div/div/div/section/main/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/span/span[2]//*[@id=\"__next\"]/div[1]/div/div/div/div/section/main/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/span/span[2]")).getText();
//
//
//        System.out.println("The price of iphone 13 pro max at Amazon" + " " + price);
//        System.out.println("The price of iphone 13 pro max at Ebay" + " " + price1);
//        System.out.println("The price of iphone 13 pro max at Walmart" + " " + price2);
//
////         price = price.replace("$", " ");
////        price1 = price1.replace("$", " ");
////        price2 = price2.replace("$", " ");
////
////        Double dprice = Double.parseDouble(price);
////
////       Double dprice1 = Double.parseDouble(price1);
////        Double dprice2 = Double.parseDouble(price2);
////
////
////        if (dprice > dprice1 && dprice > dprice2) {
////            System.out.println("The price of iphone 13 is cheaper at Amazon than other two stores");
////
////        } else if (dprice1 > dprice && dprice1 > dprice2) {
////            System.out.println("The price of iphone 13 is cheaper at Ebay than other two stores");
////        } else if (dprice2 > dprice && dprice2 > dprice1) {
////            System.out.println("The price of iphone 13 is cheaper at walmart than other two stores");
////        } else {
////            System.out.println("something went wrong");
////
//
//        }
//    }
//
//
//
