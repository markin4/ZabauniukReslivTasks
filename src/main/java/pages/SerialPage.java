package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SerialPage {

    @FindBy(xpath = "//a[@href='https://afisha.tut.by/online-cinema/serial/']")
    public WebElement onlineSerial;

    @FindBy(xpath = "(//button[@title='Жанры'])[2]")
    public WebElement selectSerial;

    @FindBy(xpath = "(//span[@class='text' and text()='Драма'])[2]")
    public WebElement genreSerial;

    @FindBy(xpath = "//label[@class='check-label js-tabs']")
    public WebElement checkGenreSerial;

}
