package utilityLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	
	/**
	 * this method is used to fetch single  data from the Excel sheet
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String fetchDta(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		return r.getCell(cell).toString();

	}
	/**
	 * this method is used to return the row size in excel path
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int rowSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();

		
	}
	/**
	 * this method is used to return the column size in the excel path
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int cellSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	/**
	 * this method is used to fetch all the data in the Excel sheet
	 * this method is used to 
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static Object [][] fetchAllData(String sheet) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(Iconstant.Excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		int rowsize = s.getPhysicalNumberOfRows();
		int cellsize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d = new Object[rowsize-1][cellsize];
		for(int i=0;i<rowsize-1;i++) {
			for(int j=0;j<cellsize;j++) {
				d[i][j]=s.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}
}
