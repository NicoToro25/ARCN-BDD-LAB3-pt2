package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxPages {

    WebDriver driver;

    @FindBy(css = "input[type='checkbox']")
    List<WebElement> checkboxes;

    public CheckboxPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToPage() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    // Estado
    public boolean isCheckboxChecked(int index) {
        return checkboxes.get(index).isSelected();
    }

    // Acciones inteligentes
    public void selectCheckbox(int index) {
        if (!checkboxes.get(index).isSelected()) {
            checkboxes.get(index).click();
        }
    }

    public void unselectedCheckboxes(int index) {
        if (checkboxes.get(index).isSelected()) {
            checkboxes.get(index).click();
        }
    }
}
