package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStepsDef {
    private WebDriver driver;
    private LoginSteps loginSteps;

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        loginSteps = new LoginSteps(driver);
        loginSteps.openLoginPage();
        screenShot();
    }

    @And("ingreso a pagina de login")
    public void ingresoAIniciarSesion() {
        loginSteps.clickLoginButton();
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.submitLogin();
        screenShot();
    }

    @When("navego a la categoria {string} y subcategoria Men")
    public void navegoALaCategoriaClothesYSubcategoriaMen(String category) {
        loginSteps.navigateToCategory(category);
        screenShot();
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int quantity) {
        loginSteps.addProductToCart(quantity);
        screenShot();
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        // Implementa la validación del popup aquí
        screenShot();
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        loginSteps.calcularProducto();
        screenShot();
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        loginSteps.finalizePurchase();
        screenShot();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        loginSteps.validarTitulodelCarito();
        screenShot();
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
        loginSteps.validarProductoCarrito();
        screenShot();
    }
}