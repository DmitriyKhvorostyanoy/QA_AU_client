package tests;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class TestSignUpNewAccount  {
    public  Number randomS = Math.random() * 10000;
    public  String str = new String();

    AgentProfilePage agentProfilePage;
    SellerProfilePage sellerProfilePage;
    BuyerProfilePage buyerProfilePage;
    MainPage mainPage;
    MainPageLogedIn mainPageLogedIn;

    @Before
    public void SingUpSingIn() {
        agentProfilePage=new AgentProfilePage();
        sellerProfilePage=new SellerProfilePage();
        buyerProfilePage=new BuyerProfilePage();
        mainPageLogedIn=new MainPageLogedIn();
        mainPage=new MainPage();
        System.setProperty("selenide.browser", "chrome");

        //clear cache
      clearBrowserCache();
        open("https://advantageu.realagentpro.com");
        mainPage.clickLogin();
    }

    @Test
    public void SignIn() throws InterruptedException {
        mainPage.fillLoginFormEmail("test@bk.ru");
        mainPage.fillLoginFormPassword("123456");
        mainPage.clickSubmitLoginButton();
        mainPageLogedIn.assertAgentNameIsDisplayed();
    }

    @Test
    public  void signUpRealEstateAgent() throws InterruptedException {
        mainPage.chooseNewAccountTab();
        mainPage.clickToSelectUserRole();
        mainPage.selectRealEstateAgent();
        mainPage.fillSingUpUserEmail("autotest"+ randomS.toString() + "2@list.ru");
        mainPage.fillSingUpUserPassword("qwerty");
       // mainPage.clickChekboxIAmLandlord();
        mainPage.fillSingUpFirstName("Auto");
        mainPage.fillSingUpLastName("Test");
        mainPage.fillSingUpPhone("1234567890");
        mainPage.clickCheckboxIAccept();
        mainPage.submitSignUpForm();
        agentProfilePage.assertCreatedName();
    }

    @Test
    public  void signUpSeller() throws InterruptedException {
        mainPage.chooseNewAccountTab();
        mainPage.clickToSelectUserRole();
        mainPage.selectSeller();
        mainPage.fillSingUpUserEmail("autotest"+ randomS.toString() + "2@list.ru");
        mainPage.fillSingUpUserPassword("qwerty");
       // mainPage.clickChekboxIAmLandlord();
        mainPage.fillSingUpFirstName("Auto");
        mainPage.fillSingUpLastName("Testbbb");
        mainPage.fillSingUpPhone("1234567890");
        mainPage.clickCheckboxIAccept();
        mainPage.submitSignUpForm();
        sellerProfilePage.assertCreatedName();
    }

    @Test
    public  void signUpBuyer() throws InterruptedException {
        mainPage.chooseNewAccountTab();
        mainPage.clickToSelectUserRole();
        mainPage.selectBuyer();
        mainPage.fillSingUpUserEmail("autotest"+ randomS.toString() + "2@list.ru");
        mainPage.fillSingUpUserPassword("qwerty");
       // mainPage.clickChekboxIAmLandlord();
        mainPage.fillSingUpFirstName("Auto");
        mainPage.fillSingUpLastName("TestSmbSD");
        mainPage.fillSingUpPhone("1234567890");
        mainPage.clickCheckboxIAccept();
        mainPage.submitSignUpForm();
        buyerProfilePage.assertCreatedName();
    }

    @After
    public void closeBrowser() {
        Selenide.close();
    }
}
