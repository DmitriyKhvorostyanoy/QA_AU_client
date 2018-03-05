package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SellerProfilePage {
    private SelenideElement sellerTitle=$(By.xpath("//h5[@class='edited-hide']"));

    public void assertTitleAndUrl() {
        sellerTitle.shouldHave(text("Auto test"));
        url().contains("http://advantageu.realagentpro.com/seller/");
    }
}
