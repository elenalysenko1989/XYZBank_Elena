package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerCustomersPage;

public class ManagerCustomersTest extends BaseTest{


    @Test
    public void testCustomersInfo(){
        logger.info("######## Test Case: Manager Login");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        logger.info("######## Test Case: Customers Information");
        ManagerCustomersPage customersInfo = new ManagerCustomersPage(driver);
        customersInfo.clickCustomersButton();
        textExists("Account Number");}


}
