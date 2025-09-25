package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class NavegationTests extends BaseTest {

    @Test(groups = {"regression", "smoke"})
    public void ejercicio1() {
        final var url = "https://www.saucedemo.com/";

        Logs.info("Navegando %s%n", url);
        driver.get(url);

        sleep(2000);

        Logs.info("Obteniendo la url actual");
        final var urlActual = driver.getCurrentUrl();

        Logs.info("Comparando si ambas url son iguales");
        Assert.assertEquals(urlActual, url);

    }

    @Test(groups = {"regression"})
    public void ejercicio2() {
        final var urlHeroku = "https://the-internet.herokuapp.com/";
        final var urlGitHub = "https://github.com/";

        Logs.info("Navegar heroku a %s%n", urlHeroku);
        driver.get(urlHeroku);
        sleep(2000);

        Logs.info("Navegar github a %s%n", urlGitHub);
        driver.get(urlGitHub);
        sleep(3000);

        Logs.info("Regresar pagina anterior");
        driver.navigate().back();
        sleep(1500);

        Logs.info("Obteniedo url actual");
        final var urlActual = driver.getCurrentUrl();

        Logs.info("Comparando url actural con la esperada");
        Assert.assertEquals(urlActual, urlHeroku);
    }

    @Test(groups = {"smoke", "regression"})
    public void siempreFallaTest() {
        final var urlHeroku = "https://the-internet.herokuapp.com/";

        Logs.info("Navegar heroku a %s%n", urlHeroku);
        driver.get(urlHeroku);

        Logs.info("Obteniendo la url actual");
        final var urlCurrent = driver.getCurrentUrl();

        Logs.info("Comparando url actual con hola mundo");
        Assert.assertEquals(urlCurrent, "Hola Mundo");
    }
}
