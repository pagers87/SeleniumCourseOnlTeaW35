package pl.coderslab.SeleniumCourseOnlTeaW35;

// tes https://duckduckgo.com/ search

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

class DuckDuckGoTest {
    @Test
    public void searchWithDuckDuckGo() {
        System.setProperty("webdriver.chrome.driver", "/Users/piotrgrzela/homebrew/bin/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        //driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys("W pustyni i w puszczy");
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
        driver.findElement(By.cssSelector("div#links article h2"));
        for (int i = 0; i <3; i++)
            WebElement searchResult = elements.get|(i);

        System.out.println();
//        driver.close();
    }
}