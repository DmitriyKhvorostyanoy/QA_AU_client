package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPageLogedIn {
    private SelenideElement loggedInAgentName = $(By.xpath("//a[contains(text(),'Test Ermolov')]"));
    private SelenideElement loggedInSellertName = $(By.xpath("//*[@class='header-top-right']//a[contains(text(),'AutoTest')]"));
    private SelenideElement createdUserName = $(By.xpath("//*[contains(text(),'Auto Test')]"));
    private SelenideElement goToAgentProfile = $(By.xpath("//*[@class='header-top-right']//a[contains(text(),'Profile')]"));


    public void moveTologgedInAgentName() throws InterruptedException {
        loggedInAgentName.hover();
        goToAgentProfile.shouldBe(visible) ;
    }
    public void goToAgentProfile() throws InterruptedException {
        moveTologgedInAgentName();
        clickProfileAndGoToAgentPage();
    }
    public AgentProfilePage clickProfileAndGoToAgentPage() {
        goToAgentProfile.shouldBe(visible).click();
        return page(AgentProfilePage.class);
    }
    public void moveTologgedInSellerName() throws InterruptedException {
        loggedInSellertName.hover();
        goToAgentProfile.shouldBe(visible) ;
    }
    public void assertAgentNameIsDisplayed() {
        loggedInAgentName.shouldHave(exactText("Test Ermolov"));
    }
    public void assertCreatedName() {
        createdUserName.should(exist);
        createdUserName.shouldHave(text("Auto Test"));
    }

}

