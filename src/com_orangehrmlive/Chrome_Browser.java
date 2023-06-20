package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome_Browser {
    public static void main(String[] args) {


        String Myurl = "https://opensource-demo.orangehrmlive.com/";

        // setup Chrome browser

        WebDriver Mydriver = new ChromeDriver();




        //open URL
        Mydriver.get(Myurl);

        // Maximise URL
        Mydriver.manage().window().maximize();

        //implicit wait for driver

        Mydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print Title of the page
        String MyTitle = Mydriver.getTitle();

        System.out.println(" Page Title is : " + MyTitle);

        //Print the current URL
        System.out.println("Current Page Url is :" + Myurl);

        // Print The Page Source
        System.out.println("My Current Page Source is : " + Mydriver.getPageSource());

        //Enter Email into the email field

      Mydriver.findElement(By.name("username")).sendKeys("JaydeePrime@testing.com");

        //Enter Password into the password field

       Mydriver.findElement(By.name("password")).sendKeys("PrimeTestingHomework");

        //close browser
        Mydriver.close();

    }


}
