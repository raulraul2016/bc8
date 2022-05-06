package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoDeComprasPages extends SeleniumBase {


    public CarritoDeComprasPages(WebDriver driver) {
        super(driver);
    }
    //atributos
    By btnAgregarAlCarrito = By.xpath("//button[@class=\"action tocart primary \"]");

    By mensajeOKAgregarProductoAlCarrito = By.xpath("//div[@class='toast-message']");

    By contadorProductosCarrito = By.xpath("//span[@class=\"counter-number\"]");
    //a[@class="button action primary checkout"]

    By btnCarrito = By.xpath("//a[@class=\"button action primary checkout\"]");
    //i[@class="navbar-tool-icon icon-cart"]
    By btnVerdeCarrito = By.xpath("top-cart-btn-checkout");




    //funciones
    public void irUrlfarmacia (String url){

        goToUrl(url);
    }

    /*public void setBtnAgregarAlCarrito(){
        click((btnAgregarAlCarrito));
    }
*/
    public String validarMensajeIngresoProductoEnCarrito() {
        exwait(mensajeOKAgregarProductoAlCarrito);
        if (isDisplayed(mensajeOKAgregarProductoAlCarrito)) {
            return getText(mensajeOKAgregarProductoAlCarrito);
        }
        return "mensaje no valido";
    }

    public boolean verificarCantidadProductos(){

        return false;
    }

    public void irACarritoDeCompras(){
        click(btnCarrito);
        click(btnVerdeCarrito);
    }
}
