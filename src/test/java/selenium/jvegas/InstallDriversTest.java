package selenium.jvegas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InstallDriversTest {
    @Test
    public void chromeSession() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

    @Test
    public void edgeSession() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.quit();
    }

    @Test
    public void firefoxSession() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.quit();
    }

    @Test
    public void ieSession() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.quit();
    }
}
