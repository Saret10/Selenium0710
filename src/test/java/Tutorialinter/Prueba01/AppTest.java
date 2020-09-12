package Tutorialinter.Prueba01;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    
	   /*@Before
	   public void CargarPagina()
	    {
		//String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "Driver" + File.separator;
	    //System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //establece la propiedad del . exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saret\\eclipse-workspace\\Prueba01\\Driver\\chromedriver.exe" );
		   driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marykayintouch.com.mx/Login/Login.aspx?ReturnURL=%2f");
	    }
      */
 
    
    @Test
    public void Caso1Login()
    {
    	
    	assertTrue(true);
    	
    /*	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
     // Practica de login Mary Kay LOGIN
        
    	
          WebElement txtConsultant =	driver.findElement(By.name("txtConsultantID"));
           txtConsultant.sendKeys("XH6695");
           
           
           WebElement txtPass =	driver.findElement(By.name("txtPassword"));
           txtPass.sendKeys("Martinez7");
             
           WebElement  btnSub=	driver.findElement(By.id("btnSubmit"));
           //actions.moveToElement(btnSub).build().perform();
           btnSub.click();
           
    	
          /* File screenshot = ((TakesScreenshot) driver)
        		   .getScreenshotAs(OutputType.FILE);
        		   try {
					FileUtils.copyFile(screenshot, new File("Caso1Login"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/

		
   }
    
}
