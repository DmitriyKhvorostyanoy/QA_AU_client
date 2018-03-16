package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SellerProfilePage {
    private SelenideElement sellerTitle=$(By.xpath("//h5[@class='edited-hide']"));
    private SelenideElement createdUserName = $(By.xpath("//*[contains(text(),'Auto Test')]"));
    private SelenideElement sellerIcon=$(By.xpath("//*[text()='Seller']"));

    public void assertTitleAndUrl() {
        sellerTitle.shouldHave(text("Auto test"));
        url().contains("http://advantageu.realagentpro.com/seller/");
    }
    public void assertCreatedName() {
        sellerIcon.should(exist);
        createdUserName.should(exist);
        createdUserName.shouldHave(text("Auto Test"));
    }
}
