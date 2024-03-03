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
        String pageSource = driver.getPageSource();
        if (pageSource.contains(expectedText)) {
            System.out.println("the text is correct");
        } else {
            System.out.println("the text is not found");
        }
        if (driver.getCurrentUrl().startsWith("https://alexanderalexander.canvusapps.com/login")) {
            System.out.println("The URL is correct");
        } else {
            System.out.println("The URL is not correct");
        }

    }
}
