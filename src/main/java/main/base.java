package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class base {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/saurabh.yadav/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();

        String[] itemsNeeded = {"Cucumber", "Bocolli", "Beetroot"};

        driver.get("https://rahulshattyacademy.com/seleniumPractice/#/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i = 0; i<products.size(); i++)
        {
            String name = products.get(i).getText();

            // covert array into the array list for easy search
            //Check whether name you extracted is present in arrayList or not
            //

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if(itemsNeededList.contains(name))
            {
                // Click on the add to card
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

            }
        }

    }
}
