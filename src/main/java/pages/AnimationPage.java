package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AnimationPage {

    @FindBy(xpath = "//a[@href='https://afisha.tut.by/online-cinema/animation/']")
    public WebElement onlineAnimation;

    @FindBy(xpath = "(//button[@title='Жанры'])[3]")
    public WebElement selectAnimation;

    @FindBy(xpath = "(//span[@class='text' and text()='Драма'])[3]")
    public WebElement genreAnimation;

    @FindBy(xpath = "//label[@class='check-label js-tabs']")
    public WebElement checkGenreAnimation;


}
