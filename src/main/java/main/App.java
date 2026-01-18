package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {

//    int mynum = 4;
//    String website = " Saurabh Singh Yadav";
//    char letter = 's';
//    double decimal = 4.47;
//    boolean mylife = true;
//
//    System.out.println("My first define int = " + mynum);
//    System.out.println("My first define String =" + website);
//    System.out.println("My first define char = " + letter);
//    System.out.println("My first define double = " + decimal);
//    System.out.println("My first define boolean = " + mylife);
//
//
//    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//    System.out.println(arr2[2]);
//
//    //for loop
//    for(int i =0; i<arr2.length; i++)
//    {
//      System.out.print(arr2[i]);
//    }
//    System.out.println();
//    String[] name = {"Saurabh","Sara", "Saurya", "Surbhi", "Avika", "Arpan", "Sargio", "Ramos"};
//    for(int i =0; i<name.length; i++)
//    {
//      System.out.print(name[i] + ", ");
//    }
//    for(String s: name)
//    {
//      //System.out.println();
//      System.out.println(s);
//    }



//    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//    for(int i=0; i<arr2.length; i++)
//    {
//      if(arr2[i] % 2 == 0) {
//        System.out.println(arr2[i]);
//        //break;
//      }
//      //System.out.println();
//      else
//      {
//        System.out.println(arr2[i] + " is not multiple of 2");
//      }
//    }


//    ArrayList<String> a = new ArrayList<String>();
//    a.add("Saurabh");
//    a.add("Sara");
//    a.add("Saurya");
//    a.add("Surbhi");
//    a.add("Avika");
//    a.add("Arpan");
//    a.add("Sargio");
//    a.add("Ramos");
//
//    ArrayList<String> a = new ArrayList<>();
//
//    a.addAll(Arrays.asList("Saurabh", "Sara", "Saurya", "Surbhi", "Avika", "Arpan", "Sergio", "Ramos"));
//
//    //a.remove(1);
//    // First element
//    System.out.println(a.get(0));
//    // Last element
//    System.out.println(a.get(a.size() - 1));
//    System.out.println(a.get(2));
//
//    for(int i =0; i<a.size(); i++)
//    {
//      System.out.print(a.get(i) + ", ");
//    }
//    System.out.println("--------");
//    for(String val :a)
//    {
//      System.out.print(val + ", ");
//    }
//    System.out.println("--------");
//    System.out.print(a.contains("Saurya"));


    String s1 = new String("Welcome");
    String s2 = new String("Welcome");

    String s = "Saurabh Singh Yadav";
    String[] splittedString = s.split("Singh");

    System.out.println(splittedString[0]);
    System.out.println(splittedString[1]);
    //System.out.println(splittedString[2]);
    System.out.println(splittedString[1].trim());

    for(int i =0; i<s.length(); i++)
    {
      System.out.print(s.charAt(i));
    }
    System.out.println();
    for(int i = s.length()-1; i>=0; i--)    // Print String in reversed order
    {
      System.out.print(s.charAt(i));
    }



    //Invoking Browser
    //chrome - ChromeDriver ->Methods
    //ChromeDriver driver =new ChromeDriver();
    //Chromedriver.exe -> Chrome browser
    // Selenium Manager

    //Chrome
    //System.setProperty("webdriver.chrome.driver", "/Users/saurabh.yadav/Downloads/chromedriver-mac-arm64/chromedriver");;
//    WebDriver driver =new ChromeDriver();
//    driver.get("https://rahulshettyacademy.com/");
//    System.out.println(driver.getTitle());
//    System.out.println(driver.getCurrentUrl());
//    driver.close();
//     driver.quit();

    //Firefox
    //geckodriver
    //webdriver.gecko.driver
//    System.setProperty("webdriver.gecko.driver", "/Users/saurabh.yadav/Downloads/geckodriver");;
//
//    WebDriver driver =new FirefoxDriver();
//    driver.get("https://rahulshettyacademy.com/");
//    System.out.println(driver.getTitle());
//    System.out.println(driver.getCurrentUrl());
//    driver.close();
    //driver.quit();


    //Microsoft Edge
    //geckodriver
    //webdriver.edge.driver
//    System.setProperty("webdriver.edge.driver", "/Users/saurabh.yadav/Downloads/msedgedriver");;
//
//    WebDriver driver =new EdgeDriver();
//    driver.get("https://rahulshettyacademy.com/");
//    System.out.println(driver.getTitle());
//    System.out.println(driver.getCurrentUrl());
//    driver.close();
    //driver.quit();





  }

  public String getData() {
      return "";
  }
}




