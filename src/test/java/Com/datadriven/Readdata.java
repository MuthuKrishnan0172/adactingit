package Com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata{
		
	// This program is used to read the data from one particular sheet
	
	private static void read_Particular_Data() throws IOException {
		
		File  f = new File(".\\Excel\\Surya.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING))
		
		{
			String stringCellValue = cell.getStringCellValue();
			
			System.out.println(stringCellValue);
			
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
		
			System.out.println(numericCellValue);
			
			w.close();
				
		}	
		
	}
       public static void main(String[] args) throws IOException {
	
	   read_Particular_Data();
	
}

}
