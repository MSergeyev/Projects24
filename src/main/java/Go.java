import RW.ReadAndWrite;
import RW.Write;
import UtilsCompars.CompUtisl;
import UtilsCompars.Json;
import UtilsCompars.StatisticsU;
import enums.StudentComparator;
import enums.UniversityComparator;
import models.Statistics;
import models.Students;
import models.University;


import java.io.IOException;
import java.util.List;


public class Go {
    public static void main(String[] args) throws IOException {

        List<University> universities =
                ReadAndWrite.readAndWriteUniversity("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                CompUtisl.getUniversityComparator(UniversityComparator.YEAR);
        universities.sort(universityComparator);
        String universitiesJson = Json.universityListToJson(universities);
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = Json.jsonToUniversityList(universitiesJson);
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {
            String universityJson = Json.universityToJson(university);

            System.out.println(universityJson);
            University universityFromJson = Json.jsonToUniversity(universityJson);

            System.out.println(universityFromJson);
        });

        List<Students> students =
                ReadAndWrite.readAndWriteStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                CompUtisl.getStudentComparator(StudentComparator.AVG_EXAM_SCORE);
        students.sort(studentComparator);
        String studentsJson = Json.studentListToJson(students);

        System.out.println(studentsJson);
        List<Students> studentsFromJson = Json.jsonToStudentList(studentsJson);

        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {
            String studentJson = Json.studentToJson(student);

            System.out.println(studentJson);
            Students studentFromJson = Json.jsonToStudent(studentJson);

            System.out.println(studentFromJson);
        });

        List<Statistics> statisticsList = StatisticsU.createStatistics(students, universities);
        Write.writeXlsStatistics(statisticsList, "src/main/resources//statistics.xlsx");
    }
}


