package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://alexanderalexander.canvusapps.com/password_resets/new");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("tals92@gmail.com");
        driver.findElement(By.cssSelector("input[name='commit']")).click();

        String expectedText = "Email sent with password reset instructions.";
        String pageSource = driver.getPageSource(); // you need to assert the element text content by the element that contains the element. the problem here that you don't make sure an element contains the text, only existed in the DOM.
        if (pageSource.contains(expectedText)) {
            System.out.println("the text is correct");
        } else {
            System.out.println("the text is not found");
        }
        if (driver.getCurrentUrl().startsWith("https://alexanderalexander.canvusapps.com/login")) { // use the equals method to compare strings. compare strings
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is not correct");
        }

    }
}
