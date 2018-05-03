package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement mainInputSearchField = $("#searchagent-query");
    private SelenideElement mainSearchButton = $(By.xpath("//button[contains(text(),'Search')]"));
    private SelenideElement loginButton = $(By.xpath("//li[@class='head-login']//*[@class='open-popup-link']"));
    private SelenideElement loginFormEmail  = $(By.id("modal-registration-loginform-email"));
    private SelenideElement loginFormPassword = $(By.id("modal-registration-loginform-password"));
    private SelenideElement submitLoginFormButton  = $(By.xpath("//*[@id='login_open']/descendant::*[text()='Submit'][1]"));


    private SelenideElement newAccountTab = $(By.xpath("//*[contains(text(),'New account')]"));
    private SelenideElement UserRoleContainer = $(By.id("select2-modal-registration-user-id_role-container"));
    private SelenideElement selectRealEstateAgent = $(By.xpath("//li[contains(text(),'Real Estate Agent')]"));
    private SelenideElement singUpUserEmailField = $(By.id("modal-registration-user-email"));
    private SelenideElement singUpUserPasswordField = $("#modal-registration-user-password_hash");
    private SelenideElement checkboxIAmLandlord = $(By.xpath("//*[@class='checkbox']//*[@name='agree']"));
    private SelenideElement fieldSingUpFName = $("#modal-registration-userprofile-first_name");
    private SelenideElement fieldSignUpLastName = $("#modal-registration-userprofile-last_name");

    private SelenideElement fieldSignUpPhone = $("#login_user_phone_number");
    private SelenideElement checkboxIAccept = $(By.xpath("//*[@for='ifAccepted']"));
    private SelenideElement submitSignUpForm = $(By.xpath("//*[@id='login_open']/descendant::*[text()='Submit'][2]"));

    private SelenideElement selectSeller = $(By.xpath("//*[@class='select2-results__option'][contains(text(),'Seller')]"));
    private SelenideElement selectBuyer = $(By.xpath("//li[contains(text(),'Buyer')]"));
    private SelenideElement logoutFromAgentProfile = $(By.xpath("//*[@class='header-top-right']//a[contains(text(),'Logout')]"));
    private SelenideElement goToSellertProfile = $(By.xpath("//*[@class='header-top-right']//a[contains(text(),'Profile')]"));

   private  SelenideElement currentLocationInHeader=$(By.xpath("//*[@class='header-top-row']//*[@class='click-text current_position_matches']"));
    private SelenideElement chooseLocationFromList=$(By.xpath("//*[@class='header-top-row']//*[@class='cityChoose-block-name change_location']//a[1]"));
    private SelenideElement inputLacationField=$(By.xpath("//*[@class='header-top-row']//*[@id='change_city_0']"));
    private  SelenideElement submitlocationBTN=$(By.xpath("//*[@class='header-top-row']//*[text()='Submit']"));
    private  SelenideElement selectHighlightedLocation=$(By.xpath("//*[@class='header-top-row']//*[@class='select2-highlighted']"));
   // private  SelenideElement listForFreeBTN= $$(By.className("btn-action orange")).findBy(text("List for free"));
 //   private  SelenideElement listForFreeBTN= $(byText("List for free"));///////            *[@class='btn-action orange']//*[contains(text(),'List for free')]
   private  SelenideElement listForFreeBTN=$(By.xpath("//*[@class='btn btn-lg orange']//*[contains(text(),'List for free')]"));
    private  SelenideElement checkEmailAlert=$(By.xpath("//*[@class='content']//*[@class='message-wrapp']"));

    public void assertAlert(){


        checkEmailAlert.shouldHave(exactText("Account created!\n" + "Activation link was sent to you. Thank you!"));
    }
   public void fillAndSubmitSearchField(){
       enterSearchArea("anchorage,AK");
       clickSearchButton();
   }



    public void loginAsAgent() throws InterruptedException {
        clickLogin();
        fillLoginFormEmail("testermolov+1@gmail.com");
        fillLoginFormPassword("123456");
        clickSubmitLoginButton();
    }

    public void enterSearchArea(String text) {

        mainInputSearchField.sendKeys(text);
    }


    public void clickSearchButton() {
        mainSearchButton.click();
       // return page(SearchPage.class);
    }

    public void clickLogin() {
        Selenide.executeJavaScript("arguments[0].click();", loginButton);
        //loginButton.click();
    //    signInSignUpModalWindow.shouldBe(visible);
    }

    public void fillLoginFormEmail(String text) {
        loginFormEmail.shouldBe(visible);
       loginFormEmail.clear();
        loginFormEmail.sendKeys(text);
    }

    public void fillLoginFormPassword(String text) {
        loginFormPassword.sendKeys(text);
    }

    public void clickSubmitLoginButton()  {
        submitLoginFormButton.click();
        //return page(MainPageLogedIn.class);
        //Thread.sleep(3000);
        }

    public void chooseNewAccountTab() {
        newAccountTab.shouldBe(visible).click();
        UserRoleContainer.shouldBe(visible);


    }
    public void clickToSelectUserRole() {
        UserRoleContainer.click();
    }

    public void selectRealEstateAgent() {
        selectRealEstateAgent.click();
    }
    public void fillSingUpUserEmail(String text) {
        singUpUserEmailField.clear();
        singUpUserEmailField.sendKeys(text);
    }
    public void fillSingUpUserPassword(String text) {

        singUpUserPasswordField.sendKeys (text);
    }
    public void clickChekboxIAmLandlord(){

        checkboxIAmLandlord.click();
    }
    public void fillSingUpFirstName(String text) {

        fieldSingUpFName.sendKeys (text);
    }
    public void fillSingUpLastName(String text) {

        fieldSignUpLastName.sendKeys (text);
    }
    public void fillSingUpPhone(String text) {

        fieldSignUpPhone.sendKeys (text);
    }
    public void clickCheckboxIAccept() {

        checkboxIAccept.click();
    }
    public void submitSignUpForm() throws InterruptedException {
        submitSignUpForm.click();
        //Selenide.executeJavaScript("arguments[0].click();",submitSignUpForm);
      //Thread.sleep(3000);
        //
        //return page(SellerProfilePage.class);
        // createdUserName.shouldBe(visible);
    }

    public void selectSeller() {
        selectSeller.click();
    }
    public void selectBuyer() {
        selectBuyer.click();
    }


    public void clickLogoutAndGoToMainPage() {
        logoutFromAgentProfile.click();
    }
    public void clickListForFree(){
        listForFreeBTN.shouldBe(enabled).click();
        //return page(AddPropertyPage.class);
    }
}