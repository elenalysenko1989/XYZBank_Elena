package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerAddCustomerPage extends BasePage{

    By addCustomerButton = By.xpath("//*[contains(text(),'Add Customer')]");
//    By addCustomerButton = By.className("btn-primary"); ASSERTION FALSE
//    By addCustomerButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]");
    By addFirstName = By.className("form-control");
    By addLastName = By.className("ng-pristine");
    By addPostCode = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input");
    By clickAddCustomer = By.xpath("//button[text()='Add Customer']");



    public ManagerAddCustomerPage(WebDriver driver){
        this.driver = driver;}

    public void clickAddCustomerButton(){
        driver.findElement(addCustomerButton).click();}

    public void fillCustomerInfo(){
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        ManagerAddCustomerPage addCustomer = new ManagerAddCustomerPage(driver);
        addCustomer.clickAddCustomerButton();
        driver.findElement(addFirstName).sendKeys("Test1");
        driver.findElement(addLastName).sendKeys("Test2");
        driver.findElement(addPostCode).sendKeys("12345");}

    public void clickAddCustButton(){
        driver.findElement(clickAddCustomer).click();

    }



}
