package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
   @BeforeClass
    public static void setUp() {

       System.setProperty("selenide.browser", "chrome");
       Configuration.timeout = 10000;
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
