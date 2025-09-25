package utilities;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

     private final static String screenShotPath = "src/test/resources/screenshots";
     private final static String pageSourcePath = "src/test/resources/pageStructure";

     /*public static void getScreenshot(String screenshotName) {
         Logs.debug("Tomando screenshot");

         final var screenshotFile = ((TakesScreenshot) new WebDriverProvider().get())
                 .getScreenshotAs(OutputType.FILE);

         final var path = String.format("%s/%s.png", screenShotPath, screenshotName);

         try {
             FileUtils.copyFile(screenshotFile, new File(path));
         } catch (IOException ioException) {
             Logs.error("Error al tomar el screenshot %s%n", ioException.getLocalizedMessage());
         }
     }

     public static void getPageSourcee(String fileName) {
         Logs.debug("Tomando source");

         final var path = String.format("%s/%s.html", pageSourcePath, fileName);

         try {
             final var file = new File(path);

             Logs.debug("Creando directorios padres si es que no existen");
             if(file.getParentFile().mkdirs()) {
                 final var fileWriter = new FileWriter(file);
                 final var pageSource = new WebDriverProvider().get().getPageSource();
                 fileWriter.write(Jsoup.parse(pageSource).toString());
                 fileWriter.close();
             }

         } catch (IOException ioExceptione) {
             Logs.error("Error al tomar page source: %s", ioExceptione.getLocalizedMessage());
         }
     }

     public static void deletePreviousEvidence() {
         try {
             Logs.debug("Borrando las evidencias previas");
             FileUtils.deleteDirectory(new File(screenShotPath));
             FileUtils.deleteDirectory(new File(pageSourcePath));
         } catch (IOException ioException) {
             Logs.error("Error al eliminar la evidencia %s%n", ioException.getLocalizedMessage());
         }
     } */

    /* @Attachment(value = "screenshot", type = "image/png")
     public static byte[] getScreenshot() {
         return ((TakesScreenshot) new WebDriverProvider().get())
                 .getScreenshotAs(OutputType.BYTES);
     }*/
}
