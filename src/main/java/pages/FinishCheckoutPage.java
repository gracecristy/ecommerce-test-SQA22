package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishCheckoutPage {
    WebDriver driver;

    @FindBy(className = "complete-header")
    WebElement completeHeader;

    public FinishCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCompleteMessage() {
        return completeHeader.getText();
    }
}
