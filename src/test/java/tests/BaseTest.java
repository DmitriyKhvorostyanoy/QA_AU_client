package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import customClasses.AllureSelenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
   @BeforeClass
    public static void setUp() {
       SelenideLogger.addListener("allure", new AllureSelenide());

       System.setProperty("selenide.browser", "chrome");
       Configuration.browserSize = "1920x1080";
       Configuration.timeout = 15000;
        //clear cache
        clearBrowserCache();
open("https://advantageu.realagentpro.com");
       // Configuration.baseUrl = "https://advantageu.realagentpro.com";

    }
    @AfterClass
    public static void closeBrowser(){
      Selenide.close();
    //public static boolean holdBrowserOpen = Boolean.getBoolean("selenide.holdBrowserOpen");
    }
}
