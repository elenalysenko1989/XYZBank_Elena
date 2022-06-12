package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void testLoginPageTitle(){
        logger.info("######## Test Case: Login Page Title");
        saveScreenshot();
        Assert.assertEquals(driver.getTitle(), ("XYZ Bank"));
    }

    @Test
    public void testManagerLogin(){
        logger.info("######## Test Case: Manager Login");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        textExists("Add Customer");
    }
    @Test
    public void testCustomerLogin(){
        logger.info("######## Test Case: Customer Login");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        textExists("Welcome");
    }

}
