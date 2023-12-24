package utilities;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class clickable {

    private WebDriver driver;

    //Constructor
    public clickable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String User = "John Doe";
    String Password = "ThisIsNotAPassword";
    String Date = "21/12/2023";
    String Comment = "Test de automatizacion";





    public void clickEnterUser() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(elementToBeClickable(enterUser)).sendKeys(User);

    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"txt-username\"]")
    WebElement enterUser;


    public void clickEnterPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(elementToBeClickable(enterPassword)).sendKeys(Password);

    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"txt-password\"]")
    WebElement enterPassword;

     public void clickToLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(elementToBeClickable(ClickLogin)).click();
    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"btn-login\"]")
    WebElement ClickLogin;



    public void clickOpenMakeAppointment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(elementToBeClickable(OpenMakeAppointment)).click();
    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"btn-make-appointment\"]")
    WebElement OpenMakeAppointment;


    public void clickCheckBoxHospotal() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(elementToBeClickable(checkBoxHospotal)).click();
    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"chk_hospotal_readmission\"]")
    WebElement checkBoxHospotal;


    public void clickEnterDate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(elementToBeClickable(enterDate)).sendKeys(Date);

    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"txt_visit_date\"]")
    WebElement enterDate;

     public void clickEnterComment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(elementToBeClickable(enterComment)).sendKeys(Comment);

    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"txt_comment\"]")
    WebElement enterComment;



    public void clickButtonAppointment() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(elementToBeClickable(ButtonAppointment)).click();

    }
    @FindBy(how = How.XPATH,using = "//*[@id=\"btn-book-appointment\"]")
    WebElement ButtonAppointment;

    public void clickButtonGoToHome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(elementToBeClickable(ButtonHome)).click();

    }
    @FindBy(how = How.XPATH,using = "//*[@class=\"btn btn-default\"]")
    WebElement ButtonHome;

}











