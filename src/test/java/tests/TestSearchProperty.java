package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import pages.AgentProfilePage;
import pages.AgentSearchResaltPage;
import pages.MainPage;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class TestSearchProperty {

    SearchPage searchPage;
    MainPage mainPage;
    AgentProfilePage agentProfilePage;
    AgentSearchResaltPage agentSearchResaltPage;


    @Before
    public void SingInAsAgent() throws InterruptedException {
        searchPage = new SearchPage();
        mainPage = new MainPage();
        agentProfilePage = new AgentProfilePage();
        agentSearchResaltPage = new AgentSearchResaltPage();


        System.setProperty("selenide.browser", "chrome");
        clearBrowserCache();
        Configuration.timeout = 15000;
        open("https://advantageu.realagentpro.com");
    }
}