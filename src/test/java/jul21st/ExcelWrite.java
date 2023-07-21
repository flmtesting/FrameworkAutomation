package jul21st;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\FLM0730PM\\softwares\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		//case 1: modifying an existing cell
		
		//ws.getRow(0).getCell(1).setCellValue("FLM");
		
		//case 2: creating a new cell in existing row
		
		//ws.getRow(2).createCell(2).setCellValue("New");
		
		//case 3: creating a Row and a new cell in it
		
		ws.createRow(4).createCell(0).setCellValue("New Row");
		
		FileOutputStream fos=new FileOutputStream("D:\\FLM0730PM\\softwares\\Book1.xlsx");
		
		wb.write(fos);
		
		fos.close();
		
		System.out.println("End of Program");

	}

}
