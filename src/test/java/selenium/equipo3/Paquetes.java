package selenium.equipo3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Paquetes {
    public static WebDriver driver;

    public By localizadorPaquete = By.xpath("//i[@class=\"shifu-icon-product shifu-3-icon-packages\"]");
    public By localizadorOrigen = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-origin sbox-primary sbox-places-first sbox-origin-container places-inline\"]\n");
    //            public By origen= By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-origin sbox-primary sbox-places-first sbox-origin-container places-inline\"]\n");
    public By localizadorResultado = By.xpath("//span[@class=\"item-text\"]");
    public By localizadorDestino = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-destination sbox-secondary sbox-places-second places-inline\"]");
    public By localizadorAceptarCookie = By.xpath("//em[@class=\"btn-text\"]");
    public By localizadorFechaIda = By.xpath("//input[@class=\"input-tag sbox-checkin-date\"]");
    public By localizadorIda = By.xpath("//div[@class=\"_dpmg2--wrapper _dpmg2--roundtrip _dpmg2--show-info _dpmg2--show\"] //descendant:: div[@data-month=\"2022-05\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available\"] //descendant:: span[text()=\"20\"]");
    public By localizadorDiaSeleccionado = By.xpath("//div[@class=\"_dpmg2--month _dpmg2--o-7 _dpmg2--has-start-range _dpmg2--month-active\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available _dpmg2--nights-tooltip\"] //descendant:: span[text()=\"20\"]");
    public By localizadorFechaVuelta = By.xpath("//div[@class=\"_dpmg2--month _dpmg2--o-5 _dpmg2--month-active\"]//descendant :: div[@data-month=\\\"2022-05\\\"] //descendant:: span[@class=\"_dpmg2--date _dpmg2--available \"] //descedant:: span[text()=\\25\\\"]");




    @BeforeClass

    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @Before public void setup(){
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public  void TC01(){

        //apertura e ingreso a la web
        driver.get("https://www.viajesfalabella.cl/");

        //Click sobre paquetes
        WebElement webElementPaquete = driver.findElement(localizadorPaquete);
        webElementPaquete.click();

        // input Origen y destino
        WebElement webElementOrigen = driver.findElement(localizadorOrigen);
        webElementOrigen.sendKeys("bue");
        WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(8));
        exwait.until(ExpectedConditions.elementToBeClickable(localizadorResultado));
        WebElement webElementResultado = driver.findElement(localizadorResultado);
        webElementResultado.click();

        WebElement webElementDestino = driver.findElement(localizadorDestino);
        webElementDestino.sendKeys("españa");
        exwait.until(ExpectedConditions.elementToBeClickable(localizadorResultado));
        webElementDestino.click();

        //Cookie
        WebElement webElementCookie = driver.findElement(localizadorAceptarCookie);
        webElementCookie.click();

        //Fecha Ida y Vuelta
        WebElement webElementFechaIda = driver.findElement(localizadorFechaIda);
        webElementFechaIda.click();
        WebElement webElementSeleccionarFechaIda = driver.findElement(localizadorIda);
        webElementSeleccionarFechaIda.click();
        WebElement webElementDiaSelecionado = driver.findElement(localizadorDiaSeleccionado);
        webElementDiaSelecionado.click();

        WebElement webElementFechaVuelta = driver.findElement(localizadorFechaVuelta);
        webElementFechaIda.click();
        //WebElement webElementSeleccionarFechaVuelta = driver.findElement(localizadorVuelta);
        //webElementSeleccionarFechaIda.click();
        //WebElement webElementDiaSelecionado = driver.findElement(localizadorDiaSeleccionado);
        //webElementDiaSelecionado.click();




    }
/*
    @After
    public void close(){
        if(driver != null){
            driver.close();
        }
    }*/
}
