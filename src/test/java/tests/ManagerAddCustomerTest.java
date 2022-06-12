package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerAddCustomerPage;

public class ManagerAddCustomerTest extends BaseTest {

    @Test
    public void testAddCustomerButton() {
        logger.info("######## Test Case: Manager Login");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        logger.info("######## Test Case: Add Customer");
        ManagerAddCustomerPage addCustomer = new ManagerAddCustomerPage(driver);
        addCustomer.clickAddCustomerButton();
        textExists("First Name");
    }

    @Test
    public void testFillCustomerInfo() {
        logger.info("######## Test Case: Manager Login");
        logger.info("######## Test Case: Fill Customer Information");
        ManagerAddCustomerPage addCustomer = new ManagerAddCustomerPage(driver);
        addCustomer.fillCustomerInfo();
        saveScreenshot();
//        textExists("Test1");}
    }

    @Test
    public void testClickAddCustButton(){
        logger.info("######## Test Case: Manager Login");
        logger.info("######## Test Case: Fill Customer Information");
        ManagerAddCustomerPage addCustomer = new ManagerAddCustomerPage(driver);
        ManagerAddCustomerPage addCustomerButton = new ManagerAddCustomerPage(driver);
        addCustomer.fillCustomerInfo();
        addCustomerButton.clickAddCustButton();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        Assert.assertTrue(alertMessage.contains("Customer added successfully"));
        alert.accept();
        saveScreenshot();

    }
}
