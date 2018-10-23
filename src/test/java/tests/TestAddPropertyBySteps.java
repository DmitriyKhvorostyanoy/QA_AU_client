package tests;

import constants.Constants;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
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
        //123
        //321
        mainPage.clickListForFree();
       // agentProfilePage.clickListYourPropertyBtn();
    }

    //@Ignore
    @DisplayName("Adding a property by buyer/seller")
    @Description("Passing thru 6 steps of process of adding property")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void addPropertyBySeller6Steps() throws InterruptedException {

        addPropertyPage.step1();
        addPropertyPage.step2();
        addPropertyPage.step3(Constants.DescriptionProperty);
        addPropertyPage.step4();
        addPropertyPage.step5(Constants.VirtualToure,FilePathPropertyPicture);
        addPropertyPage.step6AndGoTosinglPropertyPage();
        //singlePropertyPage.assertTitleAndUrl();

    }
}
