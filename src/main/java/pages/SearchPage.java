package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private SelenideElement searchUserEmail = $(By.id("user-email"));
    private SelenideElement areaModifyField = $(By.xpath("//input[@id='update_query']"));
    private SelenideElement step1Buy  = $(By.xpath("//div[@id='step_1']//*[@alt='Buy']"));
    private SelenideElement step2FamilyHome = $(By.xpath("//div[@id='step_2']//*[@alt='Family Home']"));
    private SelenideElement step3Value99999 = $(By.xpath("//div[@id='step_3']//*[text()='$99,999 or less']"));
    private SelenideElement step4ASAP = $(By.xpath("//div[@id='step_4']//*[contains(text(),'ASAP')]"));
    private SelenideElement step5OnlyBuying = $(By.xpath("//div[@id='step_5']//span[contains(text(),'Only Buying')]"));
    private SelenideElement step5AddStepFamily = $(By.xpath("//div[@id='step_5']//span[contains(text(),'Family')]"));
    private SelenideElement userphonenumberField = $(By.id("userprofile-phone_number"));
    private SelenideElement userFirstNameField  = $(By.id("userprofile-first_name"));
    private SelenideElement userLustNameField = $(By.id("userprofile-last_name"));
    private SelenideElement generateMatchesButton = $(By.xpath("//button[contains(text(),'GENERATE MATCHES')]"));
    private SelenideElement alertWrongEmail = $(By.xpath("//p[@class='help-block help-block-error'][contains(text(),'Email is not a valid email address.')]"));
    private SelenideElement updateRole = $(By.id("select2-update_role-container"));
    private SelenideElement selectRole = $(By.xpath("//*[@class='select2-results__option']"));
    private SelenideElement updatePropertyType = $(By.id("select2-update_property-container"));
    private SelenideElement selectProprtyType = $(By.xpath("//*[@class='select2-results__option'][1]"));
    private SelenideElement updateValue = $(By.id("select2-update_estimate-container"));
    private SelenideElement selectValue = $(By.xpath("//*[@class='select2-results__options']/li[4]"));
    private SelenideElement updateTimeframe = $(By.id("select2-update_timeframe-container"));
    private SelenideElement selectTimeframe = $(By.xpath("//*[@class='select2-results__option'][2]"));
    private SelenideElement modifyBTN = $(By.xpath("//button[contains(text(),'modify')]"));
    private SelenideElement potentialMatchesSideBTN = $(By.xpath("//*[@class='match-button']"));
    private SelenideElement agentInModifyedArea = $(By.xpath("//*[contains(text(),'Vladd Dneprov')]"));
    private SelenideElement privateAgent=$(By.xpath("//*[@class='search-matches-img ']//*[text()='Private Agent']"));
    private  SelenideElement publicAgent=$(By.xpath("//*[@class='search-matches-img ']//*[text()='Test Ermolov']"));

    private SelenideElement propTypeStep1=$(By.xpath("//*[text()='Commercial']/preceding-sibling::a"));
    private  SelenideElement propValueStep2=$(By.xpath("//*[contains(text(),'million')]/parent::a"));
    private  SelenideElement propTimeframeStep3=$(By.xpath("//*[contains(text(),'Not Sure')]/parent::a"));
    private  SelenideElement propNeedsStep4=$(By.xpath("//*[contains(text(),'Buying and Selling')]/parent::div"));
    private  SelenideElement propReasonsAddStep4=$(By.xpath("//*[contains(text(),'Career')]/parent::div"));


    public void passSearchStepsByLogedUseer(){
        propTypeStep1.shouldBe(enabled).click();
        propValueStep2.shouldBe(enabled).click();
        propTimeframeStep3.shouldBe(enabled).click();
        propNeedsStep4.shouldBe(enabled).click();
        propReasonsAddStep4.shouldBe(enabled).click();

    }
    public void clickAgentForCheckingPropPublModul() throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].click();", publicAgent);
       // publicAgent.should(exist).click();
      //  Thread.sleep(2000);
        //return page(AgentProfilePage.class);

    }
    public void openBarMatches() {
        potentialMatchesSideBTN.should(exist).click();}

    public void assertPrivateAgentPresense(){
        privateAgent.should(exist);
    }

    public void assertPublicAgentPresense(){
        publicAgent.should(exist);
    }
    private void selectSearchStep1Buy() {
        step1Buy.shouldBe(enabled);
        step1Buy.click();
    }

    private void selectSearchStep2FamilyHome() {
        step2FamilyHome.shouldBe(enabled);
        step2FamilyHome.click();
    }

    private void selectSearchStep3EstimatedValue99999(){
        step3Value99999.shouldBe(enabled);
        step3Value99999.click();
    }
    private void selectSearchStep4TimeframeASAP() {
        step4ASAP.shouldBe(enabled);
        step4ASAP.click();
    }
    private void selectStep5OnlyBuying() {
        step5OnlyBuying.shouldBe(enabled) ;
       step5OnlyBuying.click();
    }
    private void selectStep5AddStepFamily() {
        step5AddStepFamily.shouldBe(enabled);
        step5AddStepFamily.click();
    }
    public void fillEmailField(String text) {
        searchUserEmail.shouldBe(enabled);
        searchUserEmail.clear();
        searchUserEmail.sendKeys(text);
    }
    public void fillAreaModifyField(String text) throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);",areaModifyField);
        Thread.sleep(2000);
        areaModifyField.click();
        areaModifyField.clear();
        areaModifyField.sendKeys(text);
    }
    public void fillPhoneField(String text) {
        userphonenumberField.sendKeys(text);
    }

    public void fillUserFirstName(String text) {userFirstNameField.sendKeys(text);
    }
    public void fillUserlastName(String text) {userLustNameField.sendKeys(text);
    }

    public void clickGenerateMatchesButton() throws InterruptedException {
        generateMatchesButton.shouldBe(enabled);
        generateMatchesButton.click();
        //Thread.sleep(999999999);
    }

    public void alertMassageWrongEmail() {
        alertWrongEmail.shouldBe(visible);
    }

    public void passSearchSteps() {
        selectSearchStep1Buy();
        selectSearchStep2FamilyHome();
        selectSearchStep3EstimatedValue99999();
        selectSearchStep4TimeframeASAP();
        selectStep5OnlyBuying();
        selectStep5AddStepFamily();
    }


    public void changeRole() {
        updateRole.click();
        selectRole.click();
    }

    public void changePropertyType() {
    updatePropertyType.click();
    selectProprtyType.click();
    }

    public void changeValue() {
    updateValue.click();
    selectValue.click();
    }

    public void changeTimeframe() {
    updateTimeframe.click();
    selectTimeframe.click();
    }

    public void modifySearchAndSeeMatches() {
        modifyBTN.click();
        potentialMatchesSideBTN.click();
    }


    public void assertChanges() {
    agentInModifyedArea.shouldHave(text("Vladd Dneprov"));

    }
}
