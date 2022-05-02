package pom.equipo3.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.earaya.base.SeleniumBasePage;

public class ViajesFalabellaPage extends SeleniumBasePage{

    public ViajesFalabellaPage(WebDriver driver) {
        super(driver);
    }

    //identificar locators (page object model) o webElements (PageFactory Model)
    String url = "https://www.viajesfalabella.cl/";
    By BotonCookie = By.xpath("//a[@class=\"lgpd-banner--button eva-3-btn -white -md\"]");
    By botonAlojamiento = By.xpath("//li[@class=\"header-product-item \"]/descendant::a[@class=\"shifu-3-button-circle HOTELS paint-circle \"]");
    By barraBuscarDestino = By.xpath("//input[@class=\"input-tag sbox-main-focus sbox-destination sbox-primary undefined\"]");
    By AutoCompletadoTc09 = By.xpath("(//span[@class=\"item-text\"])[6]");
    By fechasIda = By.xpath("//input[@class=\"input-tag sbox-checkin-date\"]");
    By fechasVuelta = By.xpath("//input[@class=\"input-tag sbox-checkout-date\"]");
    By botonMesSiguiente = By.xpath("(//i[@class=\"_dpmg2--icon-ico-arrow\"])[2]");
    By MonthActive = By.xpath("//div[@class=\"_dpmg2--month _dpmg2--o-7 _dpmg2--month-active\"]");
    By MonthActiveRange = By.xpath("//div[contains(@class, \"_dpmg2--has-start-range\")]");

    By botonAplicarFechas = By.xpath("//button[@class=\"_dpmg2--desktopFooter-button _dpmg2--desktopFooter-button-apply sbox-3-btn -lg -primary\"]");
    By botonBuscar = By.xpath("//div[@class=\"sbox-button-container\"]");


    //funciones o acciones que podemos hacer en la web -> buscar en barra google
    public void irAHomePage(){
        goToUrl(url);
    }
    /*public void buscarTexto(String texto){
        type(texto,barraGoogle);
        click(btnGoogle);
    }
*/

}

