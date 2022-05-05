package pom.equipo3.base;

<<<<<<< HEAD

=======
>>>>>>> 6a4e382bbbde9368c8a8464a85d45a4d0e4b464b
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD


=======
>>>>>>> 6a4e382bbbde9368c8a8464a85d45a4d0e4b464b
import java.time.Duration;

public class JunitBaseTest {
    /*aca trabajaremos todos los setup de configuracion inicial de los test a ejecutar*/
    public WebDriver driver;
    @BeforeClass
    public static void initTesting(){
<<<<<<< HEAD

=======
>>>>>>> 6a4e382bbbde9368c8a8464a85d45a4d0e4b464b
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp(){
        System.out.println("before");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void close(){
        System.out.println("after");
        if(driver != null){
            driver.close();
        }
    }
<<<<<<< HEAD


}

=======
}
>>>>>>> 6a4e382bbbde9368c8a8464a85d45a4d0e4b464b
