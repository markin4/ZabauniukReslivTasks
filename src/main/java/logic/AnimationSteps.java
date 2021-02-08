package logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AnimationPage;

public class AnimationSteps {
    private static final int TIME_WAIT = 20;
    public String textGenreAnimation;
    public WebDriver webDriver;
    public AnimationPage animationPage;

    public void onlineAnimation() {
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(animationPage.onlineAnimation)).click();
    }


    public void choiseGenreForTheAnimation() {
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(animationPage.selectAnimation)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(animationPage.genreAnimation)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(animationPage.checkGenreAnimation)).getText();
        textGenreAnimation = animationPage.checkGenreAnimation.getText();
    }
}
