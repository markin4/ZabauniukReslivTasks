package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoviePage {

    @FindBy(xpath = "//a[@href='https://www.tut.by/resource/' and text()='Разделы']")
    public WebElement resours;

    @FindBy(xpath = "//a[@href='https://www.tut.by/resource/' and text()='Все разделы']")
    public WebElement allResours;

    @FindBy(xpath = "//a[@href='https://afisha.tut.by/online-cinema/']")
    public WebElement onlineCinema;

    @FindBy(xpath = "(//button[@title='Жанры'])[1]")
    public WebElement selectMovie;

    @FindBy(xpath = "(//span[@class='text' and text()='Драма'])[1]")
    public WebElement genre;

    @FindBy(xpath = "//li[@class='lists__li '] ")
    public WebElement textToGenre;

    @FindBy(xpath = "//label[@class='check-label js-tabs']")
    public WebElement checkGenre;

}
