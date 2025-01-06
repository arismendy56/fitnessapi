package al.powerlifting.fitnessapi.excelreader;

import al.powerlifting.fitnessapi.model.LifterProfile;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

@Repository
public class LifterProfileReader {

    public LifterProfile readLifterProfileData() throws IOException {
        LifterProfile lifterProfile = new LifterProfile();
        String excelFilePath = "/Users/aris/Desktop/projects/git/fitnessapi/src/main/resources/Aris12.16to1.18.25.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet firstSheet = workbook.getSheetAt(0);

        Row row = firstSheet.getRow(7);
        Cell cell = row.getCell(3);

        lifterProfile.setFirstName(getCellValueAsString(cell));
        return  lifterProfile;
    }

    private static String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }
}
