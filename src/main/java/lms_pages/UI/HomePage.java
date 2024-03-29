package lms_pages.UI;

import com.microsoft.playwright.Page;
import io.qameta.allure.Allure;
import lms_pages.BasePage;

public class HomePage extends BasePage {
    public static String homePageURL() {
        return "https://lms-development-rtprf.ondigitalocean.app/#/";
    }
    public HomePage(Page page) {
        super(page);
    }
    public void navigateToHomePage() {
        Allure.step("Navigate to Home Page", () -> {
            if (!page.url().equals(HomePage.homePageURL())) {
                page.navigate(HomePage.homePageURL());
            }
        });
    }
}