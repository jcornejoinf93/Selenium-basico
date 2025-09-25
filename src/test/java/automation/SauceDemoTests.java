package automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class SauceDemoTests extends BaseTest {

    @Test
    public void usuarioInvalidoTest() {

        rellenarFormularioLogin("locked_out_user", "secret_sauce");

        Logs.info("Verificar mensaje de error");
        final var errorLabel = driver.findElement(By.cssSelector("h3[data-test='error']"));

        softAssert.assertTrue(errorLabel.isDisplayed());
        softAssert.assertEquals(errorLabel.getText(),
                "Epic sadface: Sorry, this user has been locked out.");
        softAssert.assertAll();
    }

    @Test
    public void loginCorrectoTest() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        Logs.info("Verificar acceso al home de inventarios");
        final var inventoryList = driver.findElement(By.className("inventory_list"));

        Logs.info("verificar si el inventario es visible en el DOM");
        Assert.assertTrue(inventoryList.isDisplayed());
    }

    @Test
    public void detalleProductoTest() {
        rellenarFormularioLogin("standard_user", "secret_sauce");

        final var imgList = driver.findElements(By.cssSelector("img[class='inventory_item_img']"));
        Logs.info("Se hace click en el primer elemento de la lista");
        imgList.get(0).click();

        Logs.info("Esperar el detalle del producto");
        sleep(1000);

        Logs.info("Verificar el detalle del producto");


        final var titulo = driver.findElement(By.className("inventory_details_name"));
        final var precio = driver.findElement(By.className("inventory_details_price"));
        final var descripcion = driver.findElement(By.className("inventory_details_desc"));
        final var imagen = driver.findElement(By.className("inventory_details_img"));
        final var anadirCarrito = driver.findElement(By.className("btn_inventory"));

        softAssert.assertTrue(titulo.isDisplayed());
        softAssert.assertTrue(precio.isDisplayed());
        softAssert.assertTrue(descripcion.isDisplayed());
        softAssert.assertTrue(imagen.isDisplayed());
        softAssert.assertTrue(anadirCarrito.isDisplayed());
        softAssert.assertAll();
    }

    private void rellenarFormularioLogin(String username, String password) {
        Logs.info("Navegando a la pagina");
        driver.get("https://www.saucedemo.com/");

        sleep(3000);
        Logs.info("Escribieno username");
        driver.findElement(By.id("user-name")).sendKeys(username);
        Logs.info("Escribieno password");
        driver.findElement(By.id("password")).sendKeys(password);

        Logs.info("Click en login");
        driver.findElement(By.id("login-button")).click();
        sleep(3000);
    }

}
