package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThirdTest {
    public static void main(String[] args) throws InterruptedException { // explain me this please
        WebDriver driver = new ChromeDriver();
        driver.get("https://devexpress.github.io/testcafe/example");
        driver.manage().window().maximize();
        driver.findElement(By.id("developer-name")).sendKeys("Tal");
        driver.findElement(By.cssSelector("input#remote-testing")).click();
        driver.findElement(By.cssSelector("input#reusing-js-code")).click();
        driver.findElement(By.cssSelector("input#background-parallel-testing")).click();
        driver.findElement(By.cssSelector("input#continuous-integration-embedding")).click();
        driver.findElement(By.cssSelector("input#traffic-markup-analysis")).click();
        driver.findElement(By.cssSelector("input#tried-test-cafe")).click();
        driver.findElement(By.id("comments")).sendKeys("I liked your dark coffee");
        Thread.sleep(1000); // why do you need a sleep here? 
        driver.findElement(By.cssSelector("button#submit-button")).click();
    }
}
