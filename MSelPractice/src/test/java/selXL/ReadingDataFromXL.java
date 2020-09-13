package selXL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromXL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));

		// getting data from xl
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\RegisterCust.xlsx");

		// C:\Users\rrtundurwar\workspace\MSelPractice\TestData\RegisterCust.xlsx

		// creating workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// getting sheet
		XSSFSheet worksheet = workbook.getSheet("Sheet1");

		// getting nos of rows from sheet
		int totalRows = worksheet.getLastRowNum();

		System.out.println("No of rows in sheet is " + totalRows);

		int columnCount = worksheet.getRow(0).getLastCellNum();

		System.out.println("No of columns in sheet is " + columnCount);

		for (int i = 0; i <= totalRows; i++) {

			XSSFRow currentRow = worksheet.getRow(i);

			for (int j = 0; j < columnCount; j++) {

				String value = currentRow.getCell(j).toString();

				System.out.print("|" + " " + value);
			}
			System.out.println();
		}

	}

}
