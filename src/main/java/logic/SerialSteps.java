package logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SerialPage;



public class SerialSteps {

    private static final int TIME_WAIT = 20;
    private WebDriver webDriver;
    public String textGenreSerial;
    public SerialPage serialPage;

    public void choiseGenreForTheSerial() {
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(serialPage.onlineSerial)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(serialPage.selectSerial)).click();
        (new WebDriverWait(webDriver, TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(serialPage.genreSerial)).click();
        (new WebDriverWait(webDriver,TIME_WAIT))
                .until(ExpectedConditions.elementToBeClickable(serialPage.checkGenreSerial)).getText();
        textGenreSerial= serialPage.checkGenreSerial.getText();
    }
}
