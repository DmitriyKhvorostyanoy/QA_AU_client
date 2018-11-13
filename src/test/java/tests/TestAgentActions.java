package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import constants.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static constants.Constants.FilePathAgentPropertyPicture;
import static constants.Constants.FilePathAvatarAgent1;

public class TestAgentActions {

    MainPageLogedIn mainPageLogedIn;
    SearchPage searchPage;
    MainPage mainPage;
    AgentProfilePage agentProfilePage;
    AgentSearchResaltPage agentSearchResaltPage;


    @Before
    public void SingInAsAgent() throws InterruptedException {
        mainPageLogedIn=new MainPageLogedIn();
        searchPage=new SearchPage();
        mainPage = new MainPage();
        agentProfilePage = new AgentProfilePage();
        agentSearchResaltPage=new AgentSearchResaltPage();
       // Configuration.timeout = 8000;

        System.setProperty("selenide.browser", "chrome");
        clearBrowserCache();
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        open("https://advantageu.realagentpro.com");

        mainPage.loginAsAgent();
       // mainPageLogedIn.goToAgentProfile();
    }


    @Test
    public void addPropertyByAgentInModalWindow() throws InterruptedException {

        agentProfilePage.clickListYourPropertyBtn();
        agentProfilePage.fillTextFields(Constants.DescriptionProperty);
        agentProfilePage.fillChboxesAndDropDownLists();
        agentProfilePage.addPictureAndVideo(Constants.VirtualToure,FilePathAgentPropertyPicture);
        agentProfilePage.clickSaveButton();
        agentProfilePage.clickCloseBtn();

    }

    @Test
    public void addPropertyToFavoritesByDragAndDropSideZone() throws InterruptedException {
        agentProfilePage.dragAndDropPrprtyToSideZone(Constants.JsDragAndDrop);
        agentProfilePage.deletePropFromFavorites();

    }

    @Test
    public void addPropertyToFavoritesByDragAndDropDownZone() throws InterruptedException {
        agentProfilePage.dragAndDropPrprtyToDownZone(Constants.JsDragAndDrop);
        agentProfilePage.deletePropFromFavorites();
    }
    @Test
    public void addPropertyToFavoritesByLike() throws InterruptedException {
        agentProfilePage.likeProperty();
        agentProfilePage.deletePropFromFavorites();
    }

    @Test
    public void searchAgentAddAgentToFavorites() throws InterruptedException {
        agentProfilePage.searchAgentUsingSearchBarInHeader();
        agentSearchResaltPage.assertPresenceOfDesiredAgentAndClickAddToMatches();
        agentSearchResaltPage.backToAgentProfile();
        agentProfilePage.deleteAgentFromFavorites();
    }

    @Test
     public void checkPrivateStatusOfAgent() throws InterruptedException {
        agentProfilePage.setPrivateAccount();
        agentProfilePage.logoutFromProfile();
        mainPage.fillAndSubmitSearchField();
        searchPage.openBarMatches();
        searchPage.assertPrivateAgentPresense();
        mainPage.loginAsAgent();
        //mainPageLogedIn.goToAgentProfile();
        agentProfilePage.setPublicAccount();
        agentProfilePage.logoutFromProfile();
        mainPage.fillAndSubmitSearchField();
        searchPage.openBarMatches();
        searchPage.assertPublicAgentPresense();
    }
    @Test
    public void checkPropertyPublicMode() throws InterruptedException {
        agentProfilePage.propertyPublicModeOn();
        agentProfilePage.logoutFromProfile();
        mainPage.fillAndSubmitSearchField();
        searchPage.openBarMatches();
        searchPage.clickAgentForCheckingPropPublModul();
        agentProfilePage.checkForAbsenceOfProp();
        mainPage.loginAsAgent();
       // mainPage.goToAgentProfile();
        agentProfilePage.propertyPublicModeOff();
        agentProfilePage.logoutFromProfile();
        mainPage.fillAndSubmitSearchField();
        searchPage.openBarMatches();
        searchPage.clickAgentForCheckingPropPublModul();
        agentProfilePage.checkForPresenceofProp();
    }

    @Test
    public void searchByLoggedInAgent() throws InterruptedException {

        agentProfilePage.clickGETMatched();
        searchPage.fillAreaModifyField("Honolulu, HI");
        searchPage.passSearchStepsByLogedUseer();
        agentSearchResaltPage.assertResaltsSerchByAgent();
    }

    @Test
    public void changeAgentAvatar() throws InterruptedException {

        agentProfilePage.changeAvatar(Constants.FilePathAvatarAgent2,FilePathAvatarAgent1);
    }
    @After
    public void closeBrowser() {
        Selenide.close();
    }
}


