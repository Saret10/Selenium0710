

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
public class AppTest 
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
    
    @Test (priority = 1)
    public void Caso1Login()
    {
     //Practica de login Mary Kay LOGIN
        WebElement txtConsultant =	driver.findElement(By.name("txtConsultantID"));
        txtConsultant.sendKeys("XH6695");       
        WebElement txtPass =	driver.findElement(By.name("txtPassword"));
        txtPass.sendKeys("Martinez7");          
        WebElement  btnSub=	driver.findElement(By.id("btnSubmit"));
        btnSub.click();      
    }
    @Test (priority =2)
    public void Caso2IngresarMenu()
    {
        Actions actions = new Actions(driver);
        WebElement  MoverMouse=	driver.findElement(By.id("Header_Nav_LinkSection_0"));
        actions.moveToElement(MoverMouse).perform();
        WebElement  LinkOrdenaLinea=driver.findElement(By.linkText("Ir a Ordena en Línea"));
        LinkOrdenaLinea.click();		
        
    }
    @Test (priority =3)
    public void Caso3CompararTextoAssert()
    {
    	
    	/*Syntaxis de Xpath XPath contiene la ruta del elemento situado en la página web. La sintaxis estándar para crear XPath es:
		Xpath=//nombreEtiqueta[@atributo='valor']
		//: Selecciona el nodo actual
		Nombre Etiqueta: Nombre de la etiqueta del nodo en particular
		@: Seleccionar atributo.
		atributo: nombre de atributo del nodo.
		valor: valor del atributo.*/
    	//WebElement Texto = driver.findElement(By.xpath("//div[@class='col-xs-12 welcome-greeting']")); 
    	
    //	Texto.getAttribute("value");
    	//System.out.println("hola cabeza de bola" + Texto);
        //Java       -  WebElement element = driver.findElement(By.cssSelector("#food.dairy"))
    }
    
   /* @AfterTest
    public void CerrarNavegador()
    {
    driver.close();	
    }*/
}
    
