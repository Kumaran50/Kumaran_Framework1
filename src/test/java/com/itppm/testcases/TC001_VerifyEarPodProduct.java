package com.itppm.testcases;


import com.itppm.base.BaseTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.itppm.pages.HomePage;

public class TC001_VerifyEarPodProduct extends BaseTest {

    @Description("Verifying the boat Airdopes Product title")
    @Test
    public void verifyEarPods() throws Exception {
        String title = new HomePage()
                .mouseOverToAccountsList()
                .clickHomePageSignIn()
                .enterEmail(getPropertyValue("username"))
                .clickContinue()
                .enterPassword(getPropertyValue("password"))
                .clickSignIn()
                .typeSearchBox("boAt Airdopes 441 Bluetooth Truly Wireless in Ear Earbuds with Mic (Raging Red)")
                .clickSearch()
                .selectBoatEarPods()
                .getTitle();
        Assert.assertEquals(title, "Amazon.in : boAt Airdopes 441 Bluetooth Truly Wireless in Ear Earbuds with Mic (Raging Red)");
    }
}
