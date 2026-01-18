package main;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown {
    //Dynamic Dropdown with indexes
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/saurabh.yadav/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com/");        //URL in the browser
        //      //a[@value='MAA'] - xpath for the Chennai
        //      //a[@value='BLR'] - xpath for the Bangalore
        driver.findElement(By.id("ct100_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000); // wait for 2 seconds
        //  driver.findElement(By.xpath("//(a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("div[@id='glsct100_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        //System.out.println(driver.findElement(By.name("ct100$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ct100_mainContent_rbtnl_Trip1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

        if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1  "))
        {
            System.out.println("It's enabled");
            Assert.assertTrue(true,"Enabled");
        }
        else
        {
            Assert.assertTrue(false,"Disabled");
        }


    }
    @Given("a method exists")
    public static void getData()
    {
        Mathod.getData1();
        App.getData();
    }

    @When("Click on run")
    public void click_on_run() {
        // Write code here that turns the phrase above into concrete actions
        Mathod.getData1();
        App.getData();
    }
    @Then("Return a String")
    public void return_a_string() {
        // Write code here that turns the phrase above into concrete actions
        Mathod.getData1();
        App.getData();
    }

}





