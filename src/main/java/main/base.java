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
        int j=0;

        String[] itemsNeeded = {"Cucumber", "Bocolli", "Beetroot"};

        driver.get("https://rahulshattyacademy.com/seleniumPractice/#/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i = 0; i<products.size(); i++)
        {
            //Brocolli - 1 Kg  actual text
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            //format it to get the actual vegetable name
            // covert array into the array list for easy search
            //Check whether name you extracted is present in arrayList or not
            //

            List itemsNeededList = Arrays.asList(itemsNeeded);

            int j=0;
            if(itemsNeededList.contains(formattedName))
            {
                j++;
                // Click on the add to card
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                // 3 time
                if (j==3)
                    break;


            }
        }

    }
}
