package tests;

import org.junit.Before;
import org.junit.Test;
import pages.AgentSearchResaltPage;
import pages.MainPage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;


public class TestSearch {
    public Number randomS = Math.random() * 10000;
    public String str = new String();



    MainPage mainPage;
    SearchPage searchPage;
AgentSearchResaltPage agentSearchResaltPage;
    @Before
    public void searchSteps() {
        mainPage=new MainPage();
        searchPage=new SearchPage();
        agentSearchResaltPage=new AgentSearchResaltPage();
        System.setProperty("selenide.browser", "chrome");

        clearBrowserCache();

        open("https://advantageu.realagentpro.com");

        mainPage.enterSearchArea("alaska");
        mainPage.clickSearchButton();
        searchPage.passSearchSteps();
    }

    @Test
    public void invalidEmailCreatingUaccountBySearch()  {
        searchPage.fillEmailField("autotest"+ randomS.toString() + "2@list.ruu");
        searchPage.fillPhoneField("1111111111");
        searchPage.fillUserFirstName("Auto");
        searchPage.fillUserlastName("Test");
        searchPage.clickGenerateMatchesButton();
        searchPage.alertMassageWrongEmail();
    }

    @Test
    public void searchMain()  {
        searchPage.fillEmailField("autotest"+ randomS.toString() + "2@list.ru");
        searchPage.fillPhoneField("1234567890");
        searchPage.fillUserFirstName("Auto");
        searchPage.fillUserlastName("Test");
        searchPage.clickGenerateMatchesButton();
       agentSearchResaltPage.assertCreatedAccountname();
    }

    @Test
    public void modifySearch() throws InterruptedException  {
        searchPage.fillAreaModifyField("Hawaii, United States");
        searchPage.changeRole();
        searchPage.changePropertyType();
        searchPage.changeValue();
        searchPage.changeTimeframe();
        searchPage.modifySearchAndSeeMatches();
        searchPage.assertChanges();
    }

}
