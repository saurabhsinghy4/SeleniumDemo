package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestive {
    //Dynamic Dropdown with indexes
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/saurabh.yadav/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshattyacademy.com/dropdownsPractice/");        //URL in the browser
        driver.findElement(By.id("autosuggest")).sendKeys();
        Thread.sleep(3000); // wait for 3 seconds
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']a"));

        for(WebElement option : options)
        {
            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }





    }

}