package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerCustomersPage extends BasePage{

    By customersButton = By.xpath("//*[contains(text(),'Customers')]");

    public ManagerCustomersPage(WebDriver driver){
        this.driver = driver;}

    public void clickCustomersButton(){
        driver.findElement(customersButton).click();
    }


}
