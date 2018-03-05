package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AgentSearchResaltPage {
    private SelenideElement logedInClientName = $(By.xpath("//a[contains(text(),'Auto Test')]"));
    private  SelenideElement desiredAgent=$(By.xpath("//*[@class='result-table']//*[text()='Automation Bot']"));
    private  SelenideElement addToMatchesDesiredAgent=$(By.xpath("//*[text()='Automation Bot']/parent::h5/following-sibling::div[@class='button-wrap']//*[text()='Add to Matches']"));
    private SelenideElement loggedInAgentName = $(By.xpath("//a[contains(text(),'Test Ermolov')]"));
    private SelenideElement goToAgentProfile = $(By.xpath("//*[@class='header-top-right']//a[contains(text(),'Profile')]"));
    private SelenideElement agentFoundByAnotherAgent=$(By.xpath("//*[@class='result-table']//*[text()='Automation Bot']"));
private SelenideElement alertuserAdded=$(By.xpath("//*[contains(text(),'User added')]"));
    public void backToAgentProfile ()  {

        loggedInAgentName.hover();
        goToAgentProfile.shouldBe(visible).click();
    }


    public void assertCreatedAccountname(){
        logedInClientName.shouldHave(text("Auto Test"));
    }

    public  void assertPresenceOfDesiredAgentAndClickAddToMatches(){
     desiredAgent.should(exist);
     addToMatchesDesiredAgent.click();
        alertuserAdded.should(disappear);
}
    public void assertResaltsSerchByAgent(){
        agentFoundByAnotherAgent.should(exist);
    }

}
