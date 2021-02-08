import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import logic.AnimationSteps;
import logic.MovieSteps;
import logic.SerialSteps;

import java.util.List;

public class RunnerTests {
    public WebDriver webDriver;
    public MovieSteps movieSteps;
    public SerialSteps serialSteps;
    public AnimationSteps animationSteps;

    @Test
    public void checkGenreMovie() {
        movieSteps.startChromeWebDriver();
        movieSteps.startPageToOnlaineMovie();
        movieSteps.choiseGenre();
        List<WebElement> listFilms = webDriver.findElements(By.xpath("//li[@class='lists__li '] "));
        for (WebElement textGenreForTheMovie : listFilms) {
            Assert.assertTrue(textGenreForTheMovie.getText().contains(movieSteps.textGenre));
        }
    }

    @BeforeTest
    public void beforeTest() {
        movieSteps.startChromeWebDriver();
        movieSteps.startPageToOnlaineMovie();
    }

    @Test
    public void checkGenreSerial() {
        serialSteps.choiseGenreForTheSerial();
        List<WebElement> listSerial = webDriver.findElements(By.xpath("//li[@class='lists__li '] "));
        for (WebElement textGenreForTheSerial : listSerial) {
            Assert.assertTrue(textGenreForTheSerial.getText().contains(serialSteps.textGenreSerial));
        }
    }

    @AfterTest
    public void afterTest(){
        webDriver.quit();
    }

    @BeforeMethod
    public void beforeMethod(){
        movieSteps.startChromeWebDriver();
        movieSteps.startPageToOnlaineMovie();
        animationSteps.onlineAnimation();
    }

    @Test
    public void chekGenreAnimation(){
        animationSteps.choiseGenreForTheAnimation();
        List<WebElement> listAnimation = webDriver.findElements(By.xpath("//li[@class='lists__li '] "));
        for (WebElement textGenreForTheAnimation : listAnimation) {
            Assert.assertTrue(textGenreForTheAnimation.getText().contains(animationSteps.textGenreAnimation));
        }
    }

    @AfterMethod
    public void afterMethod(){
        webDriver.quit();
    }
}
