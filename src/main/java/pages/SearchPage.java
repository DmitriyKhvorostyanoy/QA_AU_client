package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private SelenideElement searchUserEmail = $(By.id("user-email")),
                            areaModifyField = $(By.xpath("//input[@id='update_query']")),
                            step1Buy = $(By.xpath("//div[@id='step_1']//*[@alt='Buy']")),
                            step2FamilyHome = $(By.xpath("//div[@id='step_2']//*[@alt='Family Home']")),
                            step3Value99999 = $(By.xpath("//div[@id='step_3']//*[text()='$99,999 or less']")),
                            step4ASAP = $(By.xpath("//div[@id='step_4']//*[contains(text(),'ASAP')]")),
                            step5OnlyBuying = $(By.xpath("//div[@id='step_5']//span[contains(text(),'Only Buying')]")),
                            step5AddStepFamily = $(By.xpath("//div[@id='step_5']//span[contains(text(),'Family')]")),
                            userphonenumberField = $(By.id("userprofile-phone_number")),
                            userFirstNameField = $(By.id("userprofile-first_name")),
                            userLustNameField = $(By.id("userprofile-last_name")),
                            generateMatchesButton = $(By.xpath("//button[contains(text(),'GENERATE MATCHES')]")),
                            alertWrongEmail = $(By.xpath("//p[@class='help-block help-block-error'][contains(text(),'Email is not a valid email address.')]")),
                            updateRole = $(By.id("select2-update_role-container")),
                            selectRole = $(By.xpath("//*[@class='select2-results__option']")),
                            updatePropertyType = $(By.id("select2-update_property-container")),
                            selectProprtyType = $(By.xpath("//*[@class='select2-results__option'][1]")),
                            updateValue = $(By.id("select2-update_estimate-container")),
                            selectValue = $(By.xpath("//*[@class='select2-results__options']/li[4]")),
                            updateTimeframe = $(By.id("select2-update_timeframe-container")),
                            selectTimeframe = $(By.xpath("//*[@class='select2-results__option'][2]")),
                            modifyBTN = $(By.xpath("//button[contains(text(),'modify')]")),
                            potentialMatchesSideBTN = $(By.xpath("//*[@class='match-button']")),
                            agentInModifyedArea = $(By.xpath("//*[contains(text(),'Vladd Dneprov')]")),
                            privateAgent = $(By.xpath("//*[@class='search-matches-img ']//*[text()='Private Agent']")),
                            publicAgent = $(By.xpath("//*[@class='search-matches-img ']//*[text()='Test Ermolov']")),
                            propTypeStep1 = $(By.xpath("//*[text()='Commercial']/preceding-sibling::a")),
                            propValueStep2 = $(By.xpath("//*[contains(text(),'million')]/parent::a")),
                            propTimeframeStep3 = $(By.xpath("//*[contains(text(),'Not Sure')]/parent::a")),
                            propNeedsStep4 = $(By.xpath("//*[contains(text(),'Buying and Selling')]/parent::div")),
                            propReasonsAddStep4 = $(By.xpath("//*[contains(text(),'Career')]/parent::div"));


    public SearchPage passSearchStepsByLogedUseer() {
        propTypeStep1.shouldBe(enabled).click();
        propValueStep2.shouldBe(enabled).click();
        propTimeframeStep3.shouldBe(enabled).click();
        propNeedsStep4.shouldBe(enabled).click();
        propReasonsAddStep4.shouldBe(enabled).click();
        return this;
    }

    public SearchPage clickAgentForCheckingPropPublModul() throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].click();", publicAgent);
        // publicAgent.should(exist).click();
        //  Thread.sleep(2000);
        //return page(AgentProfilePage.class);
        return this;
    }

    public SearchPage openBarMatches() {
        potentialMatchesSideBTN.should(exist).click();
        return this;
    }

    public SearchPage assertPrivateAgentPresense() {
        privateAgent.should(exist);
        return this;
    }

    public SearchPage assertPublicAgentPresense() {
        publicAgent.should(exist);
        return this;
    }

    private SearchPage selectSearchStep1Buy() {
        step1Buy.shouldBe(enabled);
        step1Buy.click();
        return this;
    }

    private SearchPage selectSearchStep2FamilyHome() {
        step2FamilyHome.shouldBe(enabled);
        step2FamilyHome.click();
        return this;
    }

    private SearchPage selectSearchStep3EstimatedValue99999() {
        step3Value99999.shouldBe(enabled);
        step3Value99999.click();
        return this;
    }

    private SearchPage selectSearchStep4TimeframeASAP() {
        step4ASAP.shouldBe(enabled);
        step4ASAP.click();
        return this;
    }

    private SearchPage selectStep5OnlyBuying() {
        step5OnlyBuying.shouldBe(enabled);
        step5OnlyBuying.click();
        return this;
    }

    private SearchPage selectStep5AddStepFamily() {
        step5AddStepFamily.shouldBe(enabled);
        step5AddStepFamily.click();
        return this;
    }

    public SearchPage fillEmailField(String text) {
        searchUserEmail.shouldBe(enabled).clear();
        searchUserEmail.clear();
        searchUserEmail.sendKeys(text);
        return this;
    }

    public SearchPage fillAreaModifyField(String text) throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", areaModifyField);
        Thread.sleep(2000);
        areaModifyField.click();
        areaModifyField.clear();
        areaModifyField.sendKeys(text);
        return this;
    }

    public SearchPage fillPhoneField(String text) {
        userphonenumberField.sendKeys(text);
        return this;
    }

    public SearchPage fillUserFirstName(String text) {
        userFirstNameField.sendKeys(text);
        return this;
    }

    public SearchPage fillUserlastName(String text) {
        userLustNameField.sendKeys(text);
        return this;
    }

    public SearchPage clickGenerateMatchesButton() throws InterruptedException {
        generateMatchesButton.shouldBe(enabled);
        generateMatchesButton.click();
        return this; //Thread.sleep(999999999);return this;
    }

    public SearchPage alertMassageWrongEmail() {
        alertWrongEmail.shouldBe(visible);
        return this;
    }

    public SearchPage passSearchSteps() {
        selectSearchStep1Buy();
        selectSearchStep2FamilyHome();
        selectSearchStep3EstimatedValue99999();
        selectSearchStep4TimeframeASAP();
        selectStep5OnlyBuying();
        selectStep5AddStepFamily();
        return this;
    }


    public SearchPage changeRole() {
        updateRole.click();
        selectRole.click();
        return this;
    }

    public SearchPage changePropertyType() {
        updatePropertyType.click();
        selectProprtyType.click();
        return this;
    }

    public SearchPage changeValue() {
        updateValue.click();
        selectValue.click();
        return this;
    }

    public SearchPage changeTimeframe() {
        updateTimeframe.click();
        selectTimeframe.click();
        return this;
    }

    public SearchPage modifySearchAndSeeMatches() {
        modifyBTN.click();
        potentialMatchesSideBTN.click();
        return this;
    }


    public SearchPage assertChanges() {
        agentInModifyedArea.shouldHave(text("Vladd Dneprov"));
        return this;
    }
}
