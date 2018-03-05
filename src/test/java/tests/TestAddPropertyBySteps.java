package tests;

import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import pages.*;

import static constants.Constants.FilePathPropertyPicture;

public class TestAddPropertyBySteps extends BaseTest{
    MainPageLogedIn mainPageLogedIn;
    MainPage mainPage;
    AgentProfilePage agentProfilePage;
    AddPropertyPage addPropertyPage;
    SinglePropertyPage singlePropertyPage;

    @Before
    public void SingInAsSeller() throws InterruptedException {

        mainPageLogedIn=new MainPageLogedIn();
        mainPage=new MainPage();
        agentProfilePage = new AgentProfilePage();
        addPropertyPage=new AddPropertyPage();
        singlePropertyPage=new SinglePropertyPage();

        mainPage.clickLogin();
        mainPage.fillLoginFormEmail("sellerTest@bk.ru");
        mainPage.fillLoginFormPassword("123456");
        mainPage.clickSubmitLoginButton();
       // mainPage.moveTologgedInSellerName();
       // mainPage.clickProfileAndGoToAgentPage();
        mainPageLogedIn.clickListForFree();
       // agentProfilePage.clickListYourPropertyBtn();
    }

    @Test
    public void addPropertyBySeller6Steps() throws InterruptedException {

        addPropertyPage.step1();
        addPropertyPage.step2();
        addPropertyPage.step3(Constants.DescriptionProperty);
        addPropertyPage.step4();
        addPropertyPage.step5(Constants.VirtualToure,FilePathPropertyPicture);
        addPropertyPage.step6AndGoTosinglPropertyPage();
        singlePropertyPage.assertTitleAndUrl();
    }
}
