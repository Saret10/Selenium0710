package Capturas;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.print.Doc;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CapturaMain {

	public static void main(String[] args) throws IOException, Exception  {

		//GeneracionEvidencias NuevaGeneracionEvidencias = new GeneracionEvidencias();
		NuevaGeneracionEvidencias.GeneraArchivo();
		//NuevaGeneracionEvidencias.AñadeImagen();
		
		File carpeta = new File("C:\\Saret\\Selenium\\Capturas de pantalla"); 
		File[] lista = carpeta.listFiles();
		
				
		//System.out.println("\n Hay " +  lista.length + " elementos");
		System.out.println("Que hay" + lista.length);
		
		   
	

		//Creamos el documento
		/*XWPFDocument templete = new XWPFDocument();
		XWPFParagraph par =  templete.createParagraph();
	    XWPFRun run = par.createRun();
	    run.setText("EVIDENCIAS DE AUTOMATIZACION");
	    run.setFontSize(13);
	    
	    InputStream pic = new FileInputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\ima3.png");
	    run.addPicture(pic, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(500), Units.toEMU(200));
	    FileOutputStream out = new FileOutputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\Evidencia.doc");
	    templete.write(out);
	    templete.close();
		
	    File imagen = new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima3.png");
	    FileInputStream readImage = new FileInputStream(imagen);
	    readImage.close();
	    imagen.delete();*/
	
	}
	}
