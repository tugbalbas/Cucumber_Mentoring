package apache;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _01_Tutorial {
    public static void main(String[] args) throws IOException {

        String filePath="C:\\Users\\Tuba\\IdeaProjects\\Cucumber_Mentoring\\src\\main\\resources\\DataTable.xlsx";

        // Excel dosyası
        FileInputStream fileInputStream=new FileInputStream(filePath);
        // Çalışma alanı
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        // Çalışma sayfası
        Sheet sheet= workbook.getSheet("Memberships");
        // satır
        Row row= sheet.getRow(0);
        // hücre
        Cell cell= row.getCell(0);

        System.out.println(cell);


    }
}
