package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AddPropertyPage {

    private SelenideElement chooseAgent = $(By.className("select2-selection__placeholder"));
    private SelenideElement agentSearchField = $(By.className("select2-search__field"));
    private SelenideElement chooseHighlightedResult = $(By.xpath("//span[@class='select2-results']"));
    private SelenideElement choosePackage = $(By.xpath("//*[@id='package-0']//*[@class='fa fa-check-circle']"));

    private SelenideElement btnNextStep1 = $(By.xpath("//*[contains(text(),'Next')]"));
    private SelenideElement navsearchTabs = $(By.xpath("//*[@class='nav search-tabs']"));
    private SelenideElement propertyTitle = $("#property-title");
    private SelenideElement step2PropertyTypeConteiner = $("#select2-property-id_type-container");
    private SelenideElement choosePrprtyType = $(By.xpath("//*[@class='select2-results__option'][contains(text(),'Mobile Home')]"));
    private SelenideElement step2PrprtyCategoryContainer = $("#select2-property-category_id-container");
    private SelenideElement choosePrprtyCategory = $(By.xpath("//*[@class='select2-results__option'][contains(text(),'Ground Flat')]"));
    private SelenideElement increaseBads = $("#property-beds ~ .input-group-addon[onclick*=inc]");
    private SelenideElement increaseGarage = $("#property-garage ~ .input-group-addon[onclick*=inc]");
    private SelenideElement increaseBaths = $("#property-baths ~ .input-group-addon[onclick*=inc]");
    private SelenideElement squareFeet = $("#property-square_feet");
    private SelenideElement chboContainer = $(By.xpath("//*[@class='form-group field-property-features']"));
    private SelenideElement chBo1 = $(By.xpath("//*[@id='property-features']/label[7]"));
    private SelenideElement chBo2 = $(By.xpath("//*[@id='property-features']/label[3]"));
    private SelenideElement chBo3 = $(By.xpath("//*[@id='property-features']/label[11]"));
    private SelenideElement chBo4 = $(By.xpath("//*[@id='property-features']/label[15]"));
    private SelenideElement chBo5 = $(By.xpath("//*[@id='property-features']/label[14]"));
    private SelenideElement btnNextStep2 = $(By.xpath("//*[@id='step_2']/button[contains(text(),'Next')]"));
    private SelenideElement prprtyDescriptionField = $("#property-description");
    private SelenideElement tagsField = $(By.xpath("//*[@class='bootstrap-tagsinput']/input"));
    private SelenideElement listingPrice = $("#transactioninfo-listing_price-disp");
    private SelenideElement listingPriceTitle = $(By.xpath("//*[contains(text(),'Listing price')]"));
    private SelenideElement listingDateField = $(By.id("transactioninfo-listing_date"));
    private SelenideElement listingDateInDatePicker = $(By.xpath("//*[@class='datepicker-days']//*[@class='old day'][1]"));
    private SelenideElement btnNextStep3 = $(By.xpath("//*[@id='step_3']//*[contains(text(),'Next')]"));
    private SelenideElement btnNextStep4 = $(By.xpath("//*[@id='step_4']//*[contains(text(),'Next')]"));
    private SelenideElement adressField = $("#search_areas");
    private SelenideElement uploadIMG = $("#uploadpropertygalleryimage-images");////*[@id='step_5']//*[@class='file-caption-name']
    private SelenideElement videoURL = $("#property-video_url");
    private SelenideElement virtualTour = $("#property-virtual_tour");
    private SelenideElement btnNextStep5 = $(By.xpath("//*[@id='step_5']//*[contains(text(),'Next')]"));
    private SelenideElement payBtn=$(By.xpath("//*[contains(text(),'Pay')]"));
    private SelenideElement viewYourFreeListing=$(By.xpath("//*[text()='VIEW YOUR FREE LISTING']"));
    private SelenideElement selectHighlightedAgent=$(By.xpath("//*[@class='select2-user-result']"));
    private SelenideElement selectHighlightedAdress=$(By.xpath("//*[@class='select2-highlighted']"));//*[@class='select2-highlighted']
    private SelenideElement videoTitle=$(By.xpath("//*[contains(text(),'Property Video')]"));
    private SelenideElement virtualToureTitle=$(By.xpath("//*[contains(text(),'360° Virtual tour')]"));
    private SelenideElement alertErrorsEmptyOrWrongAdress=$(By.xpath("//*[contains(text(),'Check your information for errors')]"));




    public void step1() throws InterruptedException {
        btnNextStep1.waitUntil(appear,20000);
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", btnNextStep1);
        //Thread.sleep(1000);
        chooseAgent.click();
        agentSearchField.sendKeys("testermolov+1");
        selectHighlightedAgent.click();
        //Thread.sleep(1000);

        choosePackage.click();
        btnNextStep1.click();
    }

    public void step2() throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", navsearchTabs);
        step2PropertyTypeConteiner.shouldBe(visible).click();
        choosePrprtyType.click();
        step2PrprtyCategoryContainer.click();
        choosePrprtyCategory.click();
        //Thread.sleep(200000);
        increaseBads.click();
        increaseBads.click();
        increaseGarage.click();
        increaseBaths.click();
        squareFeet.setValue("69");
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", chboContainer);
        chBo1.click();
        chBo2.click();
        chBo3.click();
        chBo4.click();
        chBo5.click();
        btnNextStep2.click();
       // Thread.sleep(1000);
    }

    public void step3(String DescriptionProperty) {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", navsearchTabs);
        propertyTitle.setValue("Automated Home");
        prprtyDescriptionField.setValue(DescriptionProperty);
        tagsField.setValue("Luxurious").pressEnter().setValue("Landscaped").pressEnter().setValue("Impeccable").pressEnter().setValue("Captivating").pressEnter();
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", listingPriceTitle);
        listingPrice.setValue("1000000");
        listingDateField.click();
        listingDateInDatePicker.shouldBe(visible).click();
        btnNextStep3.click();

    }

    public void step4() throws InterruptedException {
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", navsearchTabs);
      //  Thread.sleep(2000);
        adressField.shouldBe(visible).click();
        adressField.clear();
        adressField.setValue("200, Keawe Street, Honolulu, HI");
        Thread.sleep(1000);
        selectHighlightedAdress.shouldBe(visible).click();

        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", btnNextStep4);
        try{
            btnNextStep4.click();
        }catch(Exception e){
            if (alertErrorsEmptyOrWrongAdress.exists()){
                btnNextStep4.click();
        }
       // btnNextStep4.click();
       // Thread.sleep(99999);

        }
    }

    public void step5(String VirtualToure, String FilePathPropertyPicture) throws InterruptedException {
       Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", navsearchTabs);
       File file = new File(FilePathPropertyPicture);

       uploadIMG.uploadFile(file);
       Thread.sleep(1000);
       Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", videoTitle);
       //videoURL.setValue("https://youtu.be/_yT4jWFdHbg");
    // Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", virtualToureTitle);
       virtualTour.shouldBe(visible).setValue(VirtualToure);
       btnNextStep5.click();
    }
    public SinglePropertyPage step6AndGoTosinglPropertyPage(){
        payBtn.shouldBe(enabled).click();

        viewYourFreeListing.waitUntil(enabled,20000).click();
        return page(SinglePropertyPage.class);
    }
}