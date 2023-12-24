package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.HomePage;

public class HomePageTest {

    private String PATHDRIVER = "src/test/resources/drivers/";
    private String baseURL = "https://katalon-demo-cura.herokuapp.com/";
    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver",PATHDRIVER+"chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }
    @Test
    public void signUp(){
        driver.get(baseURL);
        HomePage homePage = new HomePage(driver);



        homePage.ClickOpenCategory();

    }
    @After
    public void close(){
    driver.close();
    }
}