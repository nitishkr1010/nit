package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
    public static ArrayList getTestData(String filepath ) {
    	ArrayList ary = new ArrayList();
        try {
            FileInputStream inputStream = new FileInputStream(new File(filepath));
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0); // Assuming you want to read from the first sheet

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            ary.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                        	ary.add(cell.getNumericCellValue() + "t");
                            break;
//                        case BOOLEAN:
//                       	ary.add(cell.getBooleanCellValue() + "t");
//                            break;
//                        case FORMULA:
//                           System.out.print(cell.getCellFormula() + "t");
//                            break;     
                    }System.out.println("\n");
                }
                System.out.println("\n");
            }

            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ary;
    }
}
