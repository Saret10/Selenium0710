package Tutorialinter.Prueba01;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
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
public class AppTest3 
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
    public void Caso3Login()
    {
     //Practica de login Mary Kay LOGIN
        WebElement txtConsultant =	driver.findElement(By.name("txtConsultantID"));
        txtConsultant.sendKeys("XH6695");       
        WebElement txtPass =	driver.findElement(By.name("txtPassword"));
        txtPass.sendKeys("Martinez7");          
        WebElement  btnSub=	driver.findElement(By.id("btnSubmit"));
        btnSub.click();      
    }
   
    @AfterTest
    public void CerrarNavegador()
    { 
    	driver.close();	
    }
}
    
