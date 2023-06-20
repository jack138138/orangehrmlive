package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String MyBrowser = "Edge";

    static  String MyUrl = " https://opensource-demo.orangehrmlive.com/";

    static WebDriver MyDriver;

    public static void main(String[] args) {

        if (MyBrowser.equalsIgnoreCase("Firefox")){
            MyDriver = new FirefoxDriver();
        } else if (MyBrowser.equalsIgnoreCase("Chrome")){
            MyDriver = new ChromeDriver();
        }else if (MyBrowser.equalsIgnoreCase("Edge")){
            MyDriver =new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        //Open Url
        MyDriver.get(MyUrl);
        MyDriver.manage().window().maximize();
        MyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print Title

        System.out.println("The Page Title is : " + MyDriver.getTitle());

        //Print Current URL

        System.out.println("The Url is :" + MyUrl);

        //Print PageSourceCode
        System.out.println("The Page Source Code is : " + MyDriver.getPageSource());

        //Enter email in email field
        MyDriver.findElement(By.name("username")).sendKeys("JaydeePrime@Testing.com");

        //Enter Password in Password Field
        MyDriver.findElement(By.name("password")).sendKeys("PRIMEtESTING");

        //Close browser

        MyDriver.close();

    }


}
