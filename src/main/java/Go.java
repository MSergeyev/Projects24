import enums.StydyProf;
import models.Students;
import models.University;


public class Go {
    public static void main(String[] args) {
        Students students = new Students();
        students.setAvgExamScore((float) 3.0)
                .setCurrentCourseNumber(4)
                .setFullName("Сергей Николаевич")
                .setUniversityId("00-014");
        System.out.println(students);


        University university = new University();
        university.setId("0001")
                .setShortName("MAB")
                .setYearOfFoundation(1900)
                .setMainProfile(StydyProf.MATHEMATICS);
        System.out.println(university);
    }

}