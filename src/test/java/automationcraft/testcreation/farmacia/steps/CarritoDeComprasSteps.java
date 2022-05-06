package automationcraft.testcreation.farmacia.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.farmacia.pages.CarritoDeComprasPages;
import automationcraft.testcreation.farmacia.pages.CheckoutPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CarritoDeComprasSteps {

    CarritoDeComprasPages carrito;
    CheckoutPages checkoutPages;

    @Given("que estoy en la url {string}")
    public void que_estoy_en_la_url(String url) {
        carrito = new CarritoDeComprasPages(DriverFactory.getDriver());
        carrito.irUrlfarmacia(url);

    }

    @When("presiono el boton agregar al carrito")
    public void presiono_el_boton_agregar_al_carrito() {
        Assert.assertTrue( carrito.validarMensajeIngresoProductoEnCarrito().contains("Se agreg"));

    }

    @Then("se debe agregar correctamente el producto al carrito")
    public void se_debe_agregar_correctamente_el_producto_al_carrito() {


    }

    @Then("ver el carrito de compra en pantalla")
    public void ver_el_carrito_de_compra_en_pantalla() {

    }

    public void valildarCantidadDeProductosEnCarrito(){

        Assert.assertTrue(carrito.verificarCantidadProductos());
    }


}
