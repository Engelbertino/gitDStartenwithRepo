package Projekt;

//import com.sun.jna.WString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static void main(String[] args) {
        // Deklalation und Instantiierung von objekten /Variablen

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //String baseUrl = "http://demo.guru99.com/test/newtours/";
        //driver.get("http://demo.guru99.com/selenium/deprecated.html");
        String baseUrl = "http://demo.guru99.com/selenium/deprecated.html";

                // Chrom starten und an die Basis-URL weiterleiten
        driver.get(baseUrl);

        // Holen Sie sich den tatsächlichen wert des Titels
        String titel =  driver.getTitle();
        System.out.println(titel);

        String url = driver.getCurrentUrl();
        System.out.println(url);


        String tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);



        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();

        //driver.close();
        //driver.quit();
        
    }
}
