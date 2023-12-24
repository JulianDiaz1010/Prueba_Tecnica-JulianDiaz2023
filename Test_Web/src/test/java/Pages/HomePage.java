package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.clickable;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
    }
    public void ClickOpenCategory(){

        clickable Click = new clickable(driver);

        Click.clickOpenMakeAppointment();
        Click.clickEnterUser();
        Click.clickEnterPassword();
        Click.clickToLogin();
        Click.clickCheckBoxHospotal();
        Click.clickEnterDate();
        Click.clickEnterComment();
        Click.clickButtonAppointment();
        Click.clickButtonGoToHome();


    }

}