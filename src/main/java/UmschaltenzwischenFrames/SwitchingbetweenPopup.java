package UmschaltenzwischenFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingbetweenPopup {
    public static void main(String[] args) {

        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();

        driver.get("http://output.jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        String alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);
        //driver.quit();


    }
}
