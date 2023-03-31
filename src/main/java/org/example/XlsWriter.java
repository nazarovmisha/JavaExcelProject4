package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XlsWriter {
   XSSFWorkbook workbook = new XSSFWorkbook();
   XSSFSheet sheetUniversities = workbook.createSheet("Унивеситеты");

}
