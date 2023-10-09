package com.testinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeturTest{

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--start-maximized");
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
        driver = new ChromeDriver(option);

        driver.navigate().to("https://www.setur.com.tr/");

        Thread.sleep(3000);

        driver.findElement(By.className("ins-close-button")).click();

        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinDeclineAll")).click();

        driver.findElement(By.className("epQxRj")).sendKeys("Antalya");

        driver.findElement(By.className("jMlpuL")).click();

        for (int i=0; i<5; i++) {
            driver.findElement(By.className("jBiEGt")).click();
        }

        driver.findElement(By.xpath("//td[@tabindex='-1' and @aria-label='Choose Pazartesi, 1 Nisan 2024 as your check-in date. It’s available.']")).click();

        driver.findElement(By.xpath("//td[@tabindex='-1' and @aria-label='Choose Pazar, 7 Nisan 2024 as your check-in date. It’s available.']")).click();

        driver.findElement(By.className("bWwklk")).click();

        driver.findElement(By.cssSelector("span.eUSbRE:contains('1')")).click();

        driver.findElement(By.cssSelector("span.eUSbRE:contains('7')")).click();

    }
}