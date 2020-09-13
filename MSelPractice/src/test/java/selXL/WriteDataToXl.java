package selXL;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToXl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\WriteData.xlsx");

		// creating workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// getting sheet
		XSSFSheet worksheet = workbook.createSheet("Data");
		
		worksheet.createRow(0).createCell(0).setCellValue("a");
		worksheet.createRow(0).createCell(1).setCellValue("b");
		worksheet.createRow(0).createCell(2).setCellValue("c");
		worksheet.createRow(1).createCell(0).setCellValue("d");
		worksheet.createRow(1).createCell(1).setCellValue("e");
		worksheet.createRow(1).createCell(2).setCellValue("f");

		/*for (int i = 0; i < 5; i++) {
			XSSFRow currentRow = worksheet.createRow(i);
			for (int j = 0; j < 3; j++) {
				//currentRow.createCell(j).setCellValue("Test");
				currentRow.createCell(1).setCellValue("abc");
				currentRow.createCell(2).setCellValue("pqr");
				currentRow.createCell(3).setCellValue("Vishal");
				currentRow.createCell(4).setCellValue("Rachita");
			}
		}*/

		workbook.write(file);
		file.close();
		System.out.println("Data written in excel successful");
	}

}
