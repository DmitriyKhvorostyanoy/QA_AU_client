package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class BuyerProfilePage {
    private SelenideElement sellerTitle = $(By.xpath("//h5[@class='edited-hide']"));
    private SelenideElement createdUserName = $(By.xpath("//*[contains(text(),'Auto Test')]"));
    private SelenideElement buyerIcon=$(By.xpath("//*[text()='Buyer']"));

    public void assertTitleAndUrl() {
        sellerTitle.shouldHave(text("Auto test"));
        url().contains("http://advantageu.realagentpro.com/bu/");
    }
    public void assertCreatedName() {
        buyerIcon.should(exist);
        createdUserName.should(exist);
        createdUserName.shouldHave(text("Auto Test"));
    }
}

