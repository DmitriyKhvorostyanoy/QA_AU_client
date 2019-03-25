package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pages.AgentSearchResaltPage;
import pages.MainPage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;


public class TestSearch {
    public Number randomS = Math.random() * 10000;
   public long now=System.currentTimeMillis();


    MainPage mainPage;
    SearchPage searchPage;
    AgentSearchResaltPage agentSearchResaltPage;

    @Before
    public void searchSteps() {
        mainPage = new MainPage();
        searchPage = new SearchPage();
        agentSearchResaltPage = new AgentSearchResaltPage();
        System.setProperty("selenide.browser", "chrome");

        clearBrowserCache();
        Configuration.timeout = 15000;
        Configuration.browserSize = "1920x1080";
        open("https://advantageu.realagentpro.com");

        mainPage.enterSearchArea("anchorage,AK");
        mainPage.clickSearchButton();
        searchPage.passSearchSteps();
    }

    @Test
    public void invalidEmailCreatingUaccountBySearch() throws InterruptedException {
        searchPage.fillEmailField("autotest" + randomS.toString() + "2@list.ruu")
                .fillPhoneField("1111111111")
                .fillUserFirstName("Auto")
                .fillUserlastName("Test")
                .clickGenerateMatchesButton()
                .alertMassageWrongEmail();
    }

    @Test
    public void searchMain() throws InterruptedException {
        searchPage.fillEmailField("testermolov+" + randomS.toString() + "@gmail.com")
                .fillPhoneField("1234567890")
                .fillUserFirstName("Auto")
                .fillUserlastName("Test")
                .clickGenerateMatchesButton();
        agentSearchResaltPage.assertCreatedAccountname();

    }

    @Test
    public void modifySearch() throws InterruptedException {
        searchPage.fillAreaModifyField("Honolulu, HI")
                .changeRole()
                .changePropertyType()
                .changeValue()
                .changeTimeframe()
                .modifySearchAndSeeMatches()
                .assertChanges();
    }

}
