package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebdriver {
    private static WebDriver webDriver;

    private SingletonWebdriver(){

    }

    public static WebDriver getInstance(){
        if (webDriver==null){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            webDriver=new ChromeDriver();
        }
        return webDriver;
    }
}
