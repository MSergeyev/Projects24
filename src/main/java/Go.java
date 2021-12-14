import RW.ReadAndWrite;
import enums.StudentComparator;
import enums.UniversityComparator;
import models.Students;
import models.University;
import java.io.IOException;
import java.util.List;


public class Go {


    public Go() throws IOException {
    }

    public static void main(String[] args) throws IOException{

        List<University> universities = ReadAndWrite.readAndWriteUniversity ("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = Comparators.getUniversityComparator(UniversityComparator.YEAR);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);


        List<Students> students = ReadAndWrite.readAndWriteStudents ("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = Comparators.getStudentComparator(StudentComparator.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
}
}


