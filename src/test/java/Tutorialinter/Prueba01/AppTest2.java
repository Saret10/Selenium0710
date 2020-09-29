package Tutorialinter.Prueba01;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest2 
{    
	 WebDriver driver;
	
	 @BeforeTest
	 public void CargarPagina()
	 {  
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Driver" + File.separator; //le dice de donde tomar la ruta del proyecto
	    System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //establece la propiedad del . exe
	    driver=new ChromeDriver();   
		driver.manage().window().maximize();
		driver.get("https://www.marykayintouch.com.mx/Login/Login.aspx?ReturnURL=%2f");
	 }
    
    @Test (priority = 1, groups ="Negative")
    public void Caso2Login() throws IOException
    {
     //Practica de login Mary Kay LOGIN
        WebElement txtConsultant =	driver.findElement(By.name("txtConsultantID"));
        txtConsultant.sendKeys("XH6695");       
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
     	FileUtils.copyFile(scrFile1, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima1.png"));
     	
        WebElement txtPass =	driver.findElement(By.name("txtPassword"));
        txtPass.sendKeys("Martinez7");     
        File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
     	FileUtils.copyFile(scrFile2, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima2.png"));
     	
        WebElement  btnSub=	driver.findElement(By.id("btnSubmit"));
        btnSub.click();     
        File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
     	FileUtils.copyFile(scrFile3, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima3.png"));
     	
        Actions actions = new Actions(driver);
        WebElement  MoverMouse=	driver.findElement(By.id("Header_Nav_LinkSection_0"));
        actions.moveToElement(MoverMouse).perform();
        File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
     	FileUtils.copyFile(scrFile4, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima4.png"));
     	
        WebElement  LinkOrdenaLinea=driver.findElement(By.linkText("Ir a Ordena en Línea"));
        LinkOrdenaLinea.click();		
        File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
     	FileUtils.copyFile(scrFile5, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima5.png"));
     	
    }
   
    @AfterTest
    public void CerrarNavegador()
    { 
    	driver.close();	
    }
}
    
