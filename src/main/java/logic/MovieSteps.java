package logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MoviePage;
import webdriver.SingletonWebdriver;

import java.util.Set;

public class MovieSteps {
    static final int TIME_WAIT = 20;
    public String textGenre;
    public WebDriver webDriver;
    public MoviePage moviePage;

    public void startChromeWebDriver() {
        WebDriver webDriver= SingletonWebdriver.getInstance();
        webDriver.manage().window().maximize();
    }

    public void startPageToOnlaineMovie() {
        webDriver.get("https://www.tut.by/");
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(moviePage.resours)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(moviePage.allResours)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(moviePage.onlineCinema)).click();
        Set<String> windowTabs = webDriver.getWindowHandles();
        for (String window : windowTabs) {
            webDriver.switchTo().window(window);
        }
    }

    public void choiseGenre() {
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(moviePage.selectMovie)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(moviePage.genre)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(moviePage.checkGenre)).getText();
        textGenre = moviePage.checkGenre.getText();
    }
}

