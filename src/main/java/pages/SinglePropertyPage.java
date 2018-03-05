package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SinglePropertyPage {
    private SelenideElement titleH1Property=$(By.xpath("//h1[contains(text(),'Automated Home')]"));



    public void assertTitleAndUrl(){
        titleH1Property.shouldHave(text("Automated Home"));
       url().contains("/property/single");
    }
}
