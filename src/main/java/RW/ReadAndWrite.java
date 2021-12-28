package RW;

import enums.StydyProf;
import models.Statistics;
import models.Students;
import models.University;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadAndWrite {

    private ReadAndWrite() {
    }
    public static List<University> readAndWriteUniversity (String filePath) throws IOException {
        List<University> universities = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Университеты");

        Iterator<Row> rows = sheet.iterator();
        rows.next();

        while (rows.hasNext()){
            Row currentRow = rows.next();
            University university = new University();
            university.add(university);
            university.setId(currentRow.getCell(0).getStringCellValue());
            university.setFullName(currentRow.getCell(1).getStringCellValue());
            university.setShortName(currentRow.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int)currentRow.getCell(3).getNumericCellValue());
            university.setMainProfile(StydyProf.valueOf(StydyProf.class, currentRow.getCell(4).getStringCellValue()));
        }
        return universities;
    }
     public static List<Students> readAndWriteStudents (String filePath) throws IOException{
        List<Students> students = new ArrayList<>();

         FileInputStream inputStream = new FileInputStream(filePath);
         XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
         XSSFSheet sheet = workbook.getSheet("Студенты");

         Iterator<Row> rows = sheet.iterator();
         rows.next();

         while (rows.hasNext()){
             Row currentRow = rows.next();
             Students student = new Students();
             students.add(student);
             student.setUniversityid(currentRow.getCell(0).getStringCellValue());
             student.setFullName(currentRow.getCell(1).getStringCellValue());
             student.setCurrentCourseNumber((int)currentRow.getCell(2).getNumericCellValue());
             student.setAvgExamScore((float) currentRow.getCell(3).getNumericCellValue());
         }
         return students;
     }

}
