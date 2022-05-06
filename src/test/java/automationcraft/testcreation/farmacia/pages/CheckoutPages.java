package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPages extends SeleniumBase {
    public CheckoutPages(WebDriver driver) {
        super(driver);
    }

    //atributos
    // Esceneario CA-01
    By cantidadProductos = By.xpath("//input[@name=\"cart[3415851][qty]\"]");

    By botonActulizarLaCompra = By.xpath("//span[@class=\" chromexPathFinder1\"]");

    By mensajeTopeProductosSolicitados = By.xpath("(//div[@class=\"modal-content\"])[4]");

    By btnOkTopePedidoProductos = By.xpath("//button[@class=\"action-primary action-accept\"]");


    // Escenario CA-02
    By carritoDeComprasUnProducto = By.xpath("(//input[@class=\"input-text qty valid\"])[1]");

    By medicamentoConReceta = By.xpath("class=\"message message-warning warning\"");

    //Escenario CA-03

    By ingresaCmrValido = By.xpath("(//input[@class=\"input-text\"])[11]");

    By btnAplicarCmr = By.xpath("//span[@class=\" chromexPathFinder1\"]");

    By popUpMensajeCmrInvalido = By.xpath("//div[@class=\"toast-message\"]");


    //funciones

    public void irUrlFarmacia(String url){
        goToUrl(url);
     }

     public void valildarCantidadDeProductosEnCarrito(){
        if(mensajeTopeProductosSolicitados.toString()== null){
            System.out.println("carrito con productos");
        }
     }

     public void validarCantidadTopeDeProductosEnCarrito(){
        if(mensajeTopeProductosSolicitados.toString().contains("11"));
         System.out.println("Seleecion de 11 productos");
     }

     public void presionaActualizaCompra(){

        click(botonActulizarLaCompra);
     }

     public void mostrarPopUpExedioTopeDeProductos(){
        if (mensajeTopeProductosSolicitados != null){
            System.out.println("Limite de productos alcanzados");
        }
     }

    }
