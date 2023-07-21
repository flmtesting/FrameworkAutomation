package jul21st;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\FLM0730PM\\softwares\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		
		 System.out.println(ws.getLastRowNum());
		 
		 System.out.println(ws.getPhysicalNumberOfRows());
		 
		 //to focus on row 
		 
		 System.out.println(ws.getRow(1).getLastCellNum());
		 
		 System.out.println(ws.getRow(1).getPhysicalNumberOfCells());
		 
		 Row row=null;
		 
		 
		 
		 for(int i=0;i<=ws.getLastRowNum();i++)
		 {
			 
			 row=ws.getRow(i);
			 
			 for(int j=0;j<row.getLastCellNum();j++)
			 {
				 if( row.getCell(j).getCellType() == CellType.STRING)
				 {
					 System.out.println(row.getCell(j).getStringCellValue()+" is a String");
							
				 }
				 else  if( row.getCell(j).getCellType() == CellType.NUMERIC)
				 {
					 System.out.println(row.getCell(j).getNumericCellValue()+" is a Number");
							
				 }
				 else  if( row.getCell(j).getCellType() == CellType.BOOLEAN)
				 {
					 System.out.println(row.getCell(j).getBooleanCellValue()+" is a boolean");
							
				 }
			 }
			 
			 
		 }
		 
		 System.out.println("End of Program");
		
		
		
		
		
		
		
		

	}

}
