package Tutorialinter.Prueba01;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class App 
{
	;  
    public static void main( String[] args )
    {
       

        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Driver" + File.separator; //le dice de donde tomar la ruta del proyecto
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //establece la propiedad del . exe
        WebDriver driver;
        driver= new ChromeDriver(); //inicializa driver
       
        //String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Driver" + File.separator;
	   // System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //establece la propiedad del . exe
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saret\\eclipse-workspace\\Prueba01\\Driver\\chromedriver.exe");
		
       //driver.get("https://www.cooltesters.com"); //iniciar chrome en la URL especificada
       //driver.manage().window().maximize();
      // By element = By.id("home_buttonText1");
       //driver.findElement(By.id("home_buttonText")).click(); //dar clic en un boton.
      //WebElement element =	driver.findElement(By.id("home_buttonText")); //encuentra el elemento
       //element.click();//da clic sobre el elemento encontrado
       //driver.close();
       //driver.quit();
        
	    /*	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
			try {
				FileUtils.copyFile(scrFile, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/	
		
        /* File screenshot = ((TakesScreenshot) driver)
		   .getScreenshotAs(OutputType.FILE);
		   try {
			FileUtils.copyFile(screenshot, new File("Caso1Login"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
       // Practica de login Mary Kay LOGIN
       
        driver.get("https://www.marykayintouch.com.mx/Login/Login.aspx?ReturnURL=%2f");
        driver.manage().window().maximize();
        
        
        WebElement txtConsultant =	driver.findElement(By.name("txtConsultantID"));
        txtConsultant.sendKeys("XH6695");
        
        WebElement txtPass =	driver.findElement(By.name("txtPassword"));
        txtPass.sendKeys("Martinez7");
        
       // Actions actions = new Actions(driver);
        
        WebElement  btnSub=	driver.findElement(By.id("btnSubmit"));
        //actions.moveToElement(btnSub).build().perform();
        btnSub.click();
        
    
       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
    			try {
    				FileUtils.copyFile(scrFile, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima1.png"));
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
        }
        /*WebElement  MoverMouse=	driver.findElement(By.id("Header_Nav_LinkSection_0"));
        //MoverMouse.click();
        actions.moveToElement(MoverMouse).perform();
        
        
        WebElement  LinkOrdenaLinea=driver.findElement(By.linkText("Ir a Ordena en Línea"));
        LinkOrdenaLinea.click();
   
        WebElement  CheckOrdena=driver.findElement(By.className("mix-match-item"));
        CheckOrdena.click();*/
        
     
        
        
        
        /* Practica de login Mary Kay LIMPIAR CAJAS DE TEXTO
        
        driver.get("https://www.marykayintouch.com.mx/Login/Login.aspx?ReturnURL=%2f");
        driver.manage().window().maximize();
        
        WebElement txtConsultant =	driver.findElement(By.name("txtConsultantID"));
        txtConsultant.sendKeys("XH6695");
        txtConsultant.clear();*/
        
// Practica de llenar un FORMULARIO 
        
     /*  driver.get("https://www.curp-gratis.com.mx/consulta-curp");//driver representa el navegador, aqui se accede a la ruta y se abre el navegador
       driver.manage().window().maximize(); //se maximiza el navegador debido a que por default lo da minimizado
        
       
        WebElement TxtNames =	driver.findElement(By.id("names")); 
        //WebElement representa un nodo por ejemplo un campo de entrada o un enlace
        //names = nombre del objeto
        //driver = navegador
        //findElement = Busca el elemento por id "names"
        // El objeto TxtNames va a tener el elemento igual a id"names (esto sera buscado en el navegador)" 
        TxtNames.sendKeys("saret");
        //ahora aqui la instruccion le dice que el objeto de tipo WebElement "TxtNames",va a escribirse "saret"
        WebElement TxtApellidoP =	driver.findElement(By.id("first-surname")); //encuentra el elemento
        TxtApellidoP.sendKeys("Martinez"); //escribe sobre el elemento
        
        WebElement TxtApellidoM =	driver.findElement(By.id("second-surname"));
       TxtApellidoM.sendKeys("Leon");*/
        
        //driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click(); //Funciona
        
     // WebElement RdioSexo = driver.findElement(By.id("(//input[@name='gender'])[2]"));//Funciona
        
        ///**********Xpath relativo*************/
        //WebElement RdioSexo = driver.findElement(By.xpath("(//label[@class='radio-inline'])[2]")); //encuentra el elemento en la pocicion 2
        //En RdioSexo contiene el elemento buscado por el xpath (ruta) en la posicion 2
        
        /*Syntaxis de Xpath XPath contiene la ruta del elemento situado en la página web. La sintaxis estándar para crear XPath es:
		Xpath=//nombreEtiqueta[@atributo='valor']
		//: Selecciona el nodo actual
		Nombre Etiqueta: Nombre de la etiqueta del nodo en particular
		@: Seleccionar atributo.
		atributo: nombre de atributo del nodo.
		valor: valor del atributo.*/
       
       /*Select RdioSexo = new Select(driver.findElement(By.id("gender")));
       RdioSexo.selectByVisibleText("MUJER");
       //RdioSexo.click(); //Se da clic en el objeto RdioSexo en la ubicacion que se le indico
        
 
        Select SelectDia = new Select(driver.findElement(By.name("day")));*/
        //Se crea un objeto Select llamado SelectDia y se busca el elemetnto por el atributo name "day" y se seleccioma
        //El objeto Select te proporcionará una serie de comandos que te permitirán interactuar con los elementos <select>. 
        
        //SelectDia.selectByValue("07"); // Selecciona una <option> basándose en su atributo value
        /*SelectDia.selectByVisibleText("07"); /// Selecciona una <option> basándose en el texto que muestra
        //SelectDia.selectByIndex(7); //// Selecciona una <option> basándose en el indice interno del elemento <select>
        
        
        Select SelectMes = new Select(driver.findElement(By.name("month"))); //encuentra el elemento
        SelectMes.selectByVisibleText("Octubre"); //selecciona el elemento indicado
        
        Select SelectAño = new Select(driver.findElement(By.name("year")));
        SelectAño.selectByVisibleText("1991");
        
       
        Select SelectEntidad = new Select(driver.findElement(By.id("federativeState"))); //Es igual tipo select solo que se busca por id
        SelectEntidad.selectByVisibleText("HIDALGO");*/
        
        //Select Entidad = new Select(driver.findElement(By.name("federativeState"))); 
        //Entidad.selectByVisibleText("HIDALGO"); //Funciona solo cambia que se busca el elemento por el atributo "name"*/
        
        
        //Seleccionar el boton de calcular CURP
      /* WebElement  BtnEnviar=	driver.findElement(By.linkText("Calcular CURP")); //encuentra el eleemento
        // En el elemnto web BtnEnviar se busca por linkText 
       BtnEnviar.click(); //da clic sobre el elemento*/
        //se da clic en el boton enviar
       
  
       /* String comparaTexto2="Hola";
        if(compara == comparaTexto2) {
        	System.out.println("Mismo texto");
        }
        	else {
        		System.out.println("Texto diferente");
        	}*/
        	
        
        

}
