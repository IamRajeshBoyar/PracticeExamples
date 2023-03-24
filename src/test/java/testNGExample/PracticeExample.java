package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeExample {
    @Test
    public void testGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\TestingApplicationProject\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title =  driver.getTitle();

        Assert.assertEquals(title, "Google");
        driver.close();
    }
    @Test
    public void testBing(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\TestingApplicationProject\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        String title = driver.getTitle();

        Assert.assertEquals(title, "Bing");
        driver.close();
    }
}
