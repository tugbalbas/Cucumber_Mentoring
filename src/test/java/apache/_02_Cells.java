package apache;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _02_Cells {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\Tuba\\IdeaProjects\\Cucumber_Mentoring\\src\\main\\resources\\DataTable.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet= workbook.getSheet("Memberships");

        int rowCount= sheet.getPhysicalNumberOfRows();
        // System.out.println(rowCount);

        for (int i = 0; i < rowCount; i++) {
            Row row= sheet.getRow(i);
            int cellCount= row.getPhysicalNumberOfCells();

            for (int j = 0; j < cellCount; j++) {
                Cell cell=row.getCell(j);
                System.out.println(cell + " ");
            }
            System.out.println();
            System.out.println();
        }

    }
}
