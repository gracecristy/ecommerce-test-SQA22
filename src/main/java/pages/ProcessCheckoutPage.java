package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessCheckoutPage {
    WebDriver driver;

    @FindBy(id = "finish")
    WebElement finishButton;

    public ProcessCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFinish() {
        finishButton.click();
    }
}
