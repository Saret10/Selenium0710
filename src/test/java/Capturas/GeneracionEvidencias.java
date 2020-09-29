package Capturas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class GeneracionEvidencias {

	
	
	/*public void GeneraArchivo() throws IOException, Exception {
		XWPFDocument templete = new XWPFDocument();	
	XWPFParagraph par =  templete.createParagraph();
    XWPFRun run = par.createRun();
    run.setText("EVIDENCIAS DE AUTOMATIZACION");
    run.setFontSize(13);
    FileOutputStream out = new FileOutputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\Evidencia10.doc");
    templete.write(out);
    try {
		templete.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void AñadeImagen() throws InvalidFormatException, IOException  {
		XWPFDocument templete = new XWPFDocument();	
		XWPFParagraph par =  templete.createParagraph();
	    XWPFRun run = par.createRun();
		InputStream pic = new FileInputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\ima.png");
	    run.addPicture(pic, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(500), Units.toEMU(200));
	    FileOutputStream out = new FileOutputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\Evidencia10.doc");
	    templete.write(out);
	    try {
			templete.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    
		/*File fout = new File("C:\\Saret\\Selenium\\Capturas de pantalla\\Evidencia100.doc");
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		for (int i = 0; i < 10; i++) {
		    bw.write("something");
		    bw.newLine();
		}


		    bw.close();*/
		

    
    /*InputStream pic = new FileInputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\ima.png");
    run.addPicture(pic, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(500), Units.toEMU(200));
    FileOutputStream out = new FileOutputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\Evidencia10.doc");
    templete.write(out);
	 pic.close();
		
	}*/
	

/*	XWPFDocument templete = new XWPFDocument();	

	public void GeneraArchivo() throws IOException, Exception {
	XWPFParagraph par =  templete.createParagraph();
    XWPFRun run = par.createRun();
    run.setText("EVIDENCIAS DE AUTOMATIZACION");
    run.setFontSize(13);
    InputStream pic = new FileInputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\ima.png");
    run.addPicture(pic, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(500), Units.toEMU(200));
    FileOutputStream out = new FileOutputStream("C:\\Saret\\Selenium\\Capturas de pantalla\\Evidencia10.doc");
    templete.write(out);
	 pic.close();
		try {
			templete.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	

	public void EliminaImagen()  {
    File imagen = new File("C:\\Saret\\Selenium\\Capturas de pantalla\\ima.png");
    imagen.delete();
 

	}
}
