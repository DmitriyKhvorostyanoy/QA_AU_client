package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AgentProfilePage {

    private  SelenideElement avatarImage = $(By.id("picture"));
    private  SelenideElement propertyTitleField = $(By.id("agent-add-property-property-title"));
    private  SelenideElement listYourPropertyButton  = $(By.xpath("//*[contains(text(),'LIST YOUR PROPERTY')]"));
    private  SelenideElement modalWindowOfProperty = $(By.xpath("//*[@class='modal-body']"));
    private  SelenideElement propertyAdressField = $(By.id("search_areas"));
    private  SelenideElement listingPriceField = $(By.id("transactioninfo-listing_price-disp"));
    private  SelenideElement buttonSavePropertyAddForm = $(By.xpath("//*[@id='add_property_form']//*[contains(text(),'Save')]"));
    private  SelenideElement checkPackage  = $(By.xpath("//*[@class='fa fa-check-circle']"));
    private  SelenideElement selectHighlitghtedAdress = $(By.xpath("//*[@class='select2-highlighted']"));
    private  SelenideElement loggedInAgentName = $(By.xpath("//*[@class='header-top-right']//*[@class='logged-in' and contains(text(),'Test')]"));
    private  SelenideElement btnClosePropertyAddForm = $(By.xpath("//*[@id='p16']//*[contains(text(),'Close')]"));
    private  SelenideElement prprtyContainer=$(By.xpath("//h5[contains(text(),'Automated Home')]/ancestor::*[@class='property-container']"));
    private  SelenideElement sideDropZone=$(By.xpath("//*[@class='col-md-3 side-col']//*[@class='drop-zone']"));
    private  SelenideElement downDropzone=$("#favorite_props");
    private  SelenideElement addedPropToFav= $(By.xpath("//*[@id='favorites']//a[contains(text(),'Automated Home')]"));
    private  SelenideElement showMore=$(By.xpath("//*[@id='favorites']//a[contains(text(),'Show more')]"));
    private  SelenideElement editFavorites=$(By.xpath("//*[@class='drop-zone']//*[contains(text(),'Edit')]"));
    private  SelenideElement deleteFavProp=$(By.xpath("//*[text()='Automated Home']/parent::p/following-sibling::a[position()=1]"));
    private  SelenideElement doneEditedFavorites=$(By.xpath("//*[@class='drop-zone']//*[contains(text(),'Done')]"));
    private  SelenideElement textToSeeBtnEdit=$(By.xpath("//*[@id='agent_metrics']//*[contains(text(),'Listing to Sales Price Ratio')]"));
    private  SelenideElement likePrprty=$(By.xpath("//*[text()='Automated Home']/ancestor::div[@class='property-container']//*[@class='property-like'][position()<=1]"));
    private  SelenideElement searchFieldOnAgentProfile =$("#profile_top_search_searchagent-query");
    private  SelenideElement searchBTN=$(By.xpath("//*[text()='SEARCH']"));
    private  SelenideElement changeRole=$("#select2-profile_top_search_user-id_role-container");
    private  SelenideElement choseHighlightedRole=$(By.xpath("//*[contains(@class,'select2-results__option') and text()='Sell']"));
    private  SelenideElement changeProptype=$("#select2-profile_top_search_searchagent-property_type-container");
    private  SelenideElement choseHighlightedPropType=$(By.xpath("//*[contains(@class,'select2-results__option') and text()='Mobile Home']"));
    private  SelenideElement changeValue=$("#select2-profile_top_search_searchagent-estimated_value-container");
    private  SelenideElement choseHighlightedValue=$(By.xpath("//*[contains(@class,'select2-results__option') and contains(text(),'750')]"));
    private  SelenideElement changeTimefraime=$("#select2-profile_top_search_searchagent-timeframe-container");
    private  SelenideElement choseHighlightedTimeframe=$(By.xpath("//*[contains(@class,'select2-results__option') and contains(text(),'12+')]"));
    private  SelenideElement deleteFavAgent =$(By.xpath("//*[text()='Automation Bot']/parent::p/following-sibling::a[position() <= 1]"));
    private  SelenideElement addedAgentToFav=$(By.xpath("//*[@id='favorites']//a[contains(text(),'Automation Bot')]"));
    private  SelenideElement userStatusContainer=$("#select2-user-private_account-container");
    private  SelenideElement selectPrivateStatus=$(By.xpath("//*[@class='select2-container select2-container--default select2-container--open']//*[@class='selection-agent' and text()='Private']"));
    private  SelenideElement selectPublicStatus=$(By.xpath("//*[@class='select2-container select2-container--default select2-container--open']//*[@class='selection-agent' and text()='Public']"));
    private  SelenideElement logoutAgentProfile = $(By.xpath("//*[@class='header-top-right']//a[contains(text(),'Logout')]"));
    private SelenideElement publicPropertyModeOnOff=$("#user-private_property");
    private SelenideElement moreReviewsBTN=$(By.xpath("//*[text()='MORE REVIEWS']"));
    private  SelenideElement h3NoProperties=$(By.xpath("//*[@class='property-container']//*[@class='text-center']"));
    private SelenideElement getMatchedBTN=$(By.xpath("//*[contains(text(),'Get Matched')]"));
    private  SelenideElement uploadAgentAvatar=$("#uploadfileform-user_avatar");
    private  SelenideElement saveAvatar=$("#crop-img");
    private SelenideElement cropImage=$(By.xpath("//*[@id='crop_modal']//*[@class='cr-image']"));
    private SelenideElement createdUserName = $(By.xpath("//*[contains(text(),'Auto Test')]"));
    private SelenideElement agentIcon=$(By.xpath("//*[text()='Real Estate Agent']"));
    private SelenideElement chooseClient=$("#select2-agent-add-property-transaction-id_client-container");
    private  SelenideElement clientSearchField=$(By.xpath("//*[@class='select2-search__field']"));
    private  SelenideElement selectHighlightedAgent=$(By.xpath("//*[@class='select2-user-result']"));
    private  SelenideElement descriptionField=$("#agent-add-property-property-description");
    private SelenideElement tagsField = $(By.xpath("//*[@class='bootstrap-tagsinput']/input"));
    private  SelenideElement sQFTfield=$("#agent-add-property-property-square_feet");
    private  SelenideElement sellingpriceField=$("#agent-add-property-transactioninfo-listing_price-disp");
    private SelenideElement chBo1=$(By.xpath("//*[@id='agent-add-property-property-features']/label[7]"));
    private SelenideElement chBo2=$(By.xpath("//*[@id='agent-add-property-property-features']/label[10]"));
    private SelenideElement chBo3=$(By.xpath("//*[@id='agent-add-property-property-features']/label[2]"));
    private SelenideElement chBo4=$(By.xpath("//*[@id='agent-add-property-property-features']/label[14]"));
    private SelenideElement chBo5=$(By.xpath("//*[@id='agent-add-property-property-features']/label[4]"));
    private  SelenideElement increaseBads=$("#agent-add-property-property-beds ~ .input-group-addon[onclick*=inc]");
    private SelenideElement increaseGarage = $("#agent-add-property-property-garage ~ .input-group-addon[onclick*=inc]");
    private SelenideElement increaseBaths = $("#agent-add-property-property-baths ~ .input-group-addon[onclick*=inc]");
    private SelenideElement step2PropertyTypeConteiner = $("#select2-agent-add-property-property-id_type-container");
    private SelenideElement choosePrprtyType = $(By.xpath("//*[@class='select2-results__option'][contains(text(),'Tic')]"));
    private SelenideElement step2PrprtyCategoryContainer = $("#select2-agent-add-property-property-category_id-container");
    private SelenideElement choosePrprtyCategory = $(By.xpath("//*[@class='select2-results__option'][contains(text(),'Flats')]"));
    private SelenideElement choosePackage = $(By.xpath("//*[@class='fa fa-check-circle']"));
    private SelenideElement listingDateField = $("#agent-add-property-transactioninfo-listing_date-kvdate");
    private SelenideElement listingDateInDatePicker = $(By.xpath("//*[@class='datepicker-days']//*[@class='old day'][1]"));
    private  SelenideElement activePropertyBTN=$("#agent-add-property-transaction-status");
    private  SelenideElement modalTitle=$(By.xpath("//*[text()='List Your Property']"));
    private SelenideElement uploadIMG = $("#agent-add-property-uploadpropertygalleryimage-images");
    private SelenideElement virtualTour = $("#agent-add-property-property-virtual_tour");

    public void addPictureAndVideo(String VirtualToure, String FilePathAgentPropertyPicture) throws InterruptedException {

        File file = new File(FilePathAgentPropertyPicture);

        uploadIMG.uploadFile(file);
        Thread.sleep(1000);
        // videoURL.setValue("https://youtu.be/_yT4jWFdHbg");
        virtualTour.shouldBe(visible).setValue(VirtualToure);
    }

    public void fillTextFields(String DescriptionProperty) throws InterruptedException {
        modalWindowOfProperty.shouldBe(enabled);
        chooseClient.click();
        clientSearchField.sendKeys("testSell");
        selectHighlightedAgent.click();
        propertyTitleField.sendKeys("Automated Home");
        propertyAdressField.sendKeys("901 N Rexford Dr, Beverly Hills, CA 90210, USA");
        Thread.sleep(1000);
        selectHighlitghtedAdress.shouldBe(visible).click();
        descriptionField.setValue(DescriptionProperty);
        tagsField.setValue("Luxurious").pressEnter().setValue("Landscaped").pressEnter().setValue("Impeccable").pressEnter().setValue("Captivating").pressEnter();
        sQFTfield.setValue("124");
        sellingpriceField.setValue("100000");
            }
    public void fillChboxesAndDropDownLists(){
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", modalTitle);
        step2PropertyTypeConteiner.shouldBe(visible).click();
        choosePrprtyType.click();
        step2PrprtyCategoryContainer.click();
        choosePrprtyCategory.click();
        increaseBads.click();
        increaseBads.click();
        increaseGarage.click();
        increaseBaths.click();
        increaseBaths.click();
        chBo1.click();
        chBo2.click();
        chBo3.click();
        chBo4.click();
        chBo5.click();
        choosePackage.click();
        listingDateField.click();
        listingDateInDatePicker.shouldBe(visible).click();
        activePropertyBTN.click();
    }


    public void assertCreatedName() {
        agentIcon.should(exist);
        createdUserName.should(exist);
        createdUserName.shouldHave(text("Auto Test"));
    }
    public  void changeAvatar(String FilePathAvatar2,String FilePathAvatar1) throws InterruptedException {

        File file = new File(FilePathAvatar2);
        uploadAgentAvatar.uploadFile(file);
        Thread.sleep(1000);
      //  Selenide.executeJavaScript("arguments[0].setAttribute('style', 'opacity: 1; transform: translate3d(210.015px, 60.0154px, 0px) scale(0.3608); transform-origin: 139.985px 139.985px 0px;')",cropImage);
        saveAvatar.should(exist).click();
        Thread.sleep(2000);
        Selenide.refresh();
        File file1 = new File(FilePathAvatar1);
        uploadAgentAvatar.uploadFile(file1);
        Thread.sleep(1000);
       // Selenide.executeJavaScript("arguments[0].setAttribute('style', 'opacity: 1; transform: translate3d(-51px, -94px, 0px) scale(0.3639); transform-origin: 300px 194px 0px;')",cropImage);
     //   Thread.sleep(2000000000);
        saveAvatar.should(exist).click();
        Thread.sleep(2000);

    }
    public void clickGETMatched() throws InterruptedException {
        Thread.sleep(2000);
        getMatchedBTN.should(exist);
        Selenide.executeJavaScript("arguments[0].click();", getMatchedBTN);

    }

    public  void checkForAbsenceOfProp(){
        moreReviewsBTN.should(exist);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", moreReviewsBTN);
        h3NoProperties.shouldHave(exactText("No properties yet!"));
    }

    public void checkForPresenceofProp(){
        moreReviewsBTN.should(exist);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", moreReviewsBTN);
        prprtyContainer.should(exist);
    }

    public void propertyPublicModeOn(){
        moreReviewsBTN.should(exist);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", moreReviewsBTN);
        publicPropertyModeOnOff.click();
    }

    public void propertyPublicModeOff(){
        moreReviewsBTN.should(exist);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", moreReviewsBTN);
        publicPropertyModeOnOff.click();
    }
    public void setPublicAccount(){
        userStatusContainer.click();
        selectPublicStatus.click();
    }

    public void setPrivateAccount(){
        userStatusContainer.should(exist).click();
        selectPrivateStatus.should(exist).click();
            }
    public void logoutFromProfile(){
        loggedInAgentName.hover();
        logoutAgentProfile.click();
}

    public void searchAgentUsingSearchBarInHeader(){
        searchFieldOnAgentProfile.setValue("Honolulu, HI");
        changeRole.click();
        choseHighlightedRole.click();
        changeProptype.click();
        choseHighlightedPropType.click();
        changeValue.click();
        choseHighlightedValue.click();
        changeTimefraime.click();
        choseHighlightedTimeframe.click();
        searchBTN.click();
}

    public void deleteAgentFromFavorites() throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", sideDropZone);
        addedAgentToFav.should(exist);
       // showMore.click();
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", textToSeeBtnEdit);
        editFavorites.click();
         Thread.sleep(1000);
        deleteFavAgent.shouldBe(visible).click();
        Thread.sleep(2000);
        addedAgentToFav.shouldNot(exist);
        //doneEditedFavorites.click();
        Selenide.refresh();
    }

    public  void dragAndDropPrprtyToSideZone(String JsDragAndDrop) throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", prprtyContainer);
        Selenide.executeJavaScript(JsDragAndDrop ,new Object[]{prprtyContainer, sideDropZone});
       Thread.sleep(1000);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", sideDropZone);
       // showMore.click();
        addedPropToFav.should(exist);
        //Selenide.refresh();
           }
    public void deletePropFromFavorites() throws InterruptedException {
        //Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", sideDropZone);
        // showMore.click();
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", textToSeeBtnEdit);
        editFavorites.click();
         Thread.sleep(1000);
        deleteFavProp.should(exist);
        Selenide.executeJavaScript("arguments[0].click();", deleteFavProp);
        //deleteFavProp.click();
        //Thread.sleep(2000);
        addedPropToFav.shouldNot(exist);
        Selenide.executeJavaScript("arguments[0].click();", doneEditedFavorites);
        //doneEditedFavorites.click();
       // Selenide.refresh();
    }
    public  void dragAndDropPrprtyToDownZone(String JsDragAndDrop){

    Selenide.executeJavaScript(JsDragAndDrop ,new Object[]{prprtyContainer, downDropzone});
       // prprtyContainer.dragAndDropTo(downDropzone);
    }

    public  void likeProperty(){
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", prprtyContainer);
        likePrprty.click();
    }

    public void clickListYourPropertyBtn() {
        listYourPropertyButton.click();
    }

    public void fillPropertyTitle(String text) {
        modalWindowOfProperty.shouldBe(visible);
        propertyTitleField.sendKeys(text);
    }

    public void fillPropertyAdressField(String text) {
        propertyAdressField.sendKeys(text);
        selectHighlitghtedAdress.shouldBe(visible);
        selectHighlitghtedAdress.click();
    }

    public void fillListingPriceField(String text) {
        listingPriceField.clear();
        listingPriceField.sendKeys(text);
       // selectHighlitghtedAdress.shouldBe(visible);
      //  selectHighlitghtedAdress.click();
    }

    public void setListingDate() {
        listingDateField.click();
        listingDateInDatePicker.shouldBe(visible);
        listingDateInDatePicker.click();
    }
    public void clickSaveButton() throws InterruptedException {
        buttonSavePropertyAddForm.click();

        btnClosePropertyAddForm.shouldBe(visible);
       // Thread.sleep(3000);
    }
    public void choosePackage() {
        checkPackage.click();
    }

    public void clickCloseBtn() {
        btnClosePropertyAddForm.click();
        //btnClosePropertyAddForm.shouldBe(visible);
    }
}

