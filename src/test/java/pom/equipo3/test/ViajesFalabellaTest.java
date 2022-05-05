package pom.equipo3.test;

<<<<<<< HEAD
//package pom.equipoX.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.equipo3.base.JunitBaseTest;
import pom.earaya.page.GoogleHomePage;


public class ViajesFalabellaTest extends JunitBaseTest {

    ViajesFalabellaTest viajesFalabellaTest;

    public ViajesFalabellaTest(WebDriver driver) {

    }

    @Test
    public void TC09(){
/*
        viajesFalabellaTest = new ViajesFalabellaTest(driver);
        viajesFalabellaTest.botonAlojamiento();
        viajesFalabellaTest.BuscarDestino();
        viajesFalabellaTest.AutoCompletadoTc09();
        viajesFalabellaTest.fechaIda();
        viajesFalabellaTest.fechaVuelta();
        viajesFalabellaTest.botonMesSiguiente();
        viajesFalabellaTest.MonthActive();
        viajesFalabellaTest.MonthActiveRange();
        viajesFalabellaTest.botonAplicarFechas();
        viajesFalabellaTest.botonBuscar();
*/
=======
import org.junit.Test;
import pom.equipo3.base.JunitBaseTest;
import pom.equipo3.pages.ViajesFalabellaHomePage;

public class ViajesFalabellaTest extends JunitBaseTest {

    ViajesFalabellaHomePage viajesFalabellaHomePage;

    @Test
    public void busquedaAlojamiento(){
        viajesFalabellaHomePage = new ViajesFalabellaHomePage(driver);
        viajesFalabellaHomePage.irAHomePage();
        viajesFalabellaHomePage.btnCookies();
        viajesFalabellaHomePage.btnAlojamiento();
        viajesFalabellaHomePage.buscarDestino("Rio de");
        viajesFalabellaHomePage.autoCompletado();
        viajesFalabellaHomePage.sinFechasDefinidas();
        viajesFalabellaHomePage.btnBuscar();
>>>>>>> 6a4e382bbbde9368c8a8464a85d45a4d0e4b464b
    }
}
