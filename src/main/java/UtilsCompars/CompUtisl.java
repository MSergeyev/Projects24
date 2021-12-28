package UtilsCompars;

import Interfases.ComparsS.StudentavgExamScore;
import Interfases.ComparsS.StudentcurrentCourseNumber;
import Interfases.ComparsS.StudentfullName;
import Interfases.ComparsS.StudentuniversityId;
import Interfases.ComparsU.*;
import enums.StudentComparator;
import enums.UniversityComparator;


public class CompUtisl {

    private CompUtisl() {
    }

    public static StudentComparator getStudentComparator(StudentComparator studentComparatorType) {

        switch (studentComparatorType) {

            case UNIVERSITY_ID -> new StudentuniversityId();
            case FULL_NAME -> new StudentfullName();
            case COURSE -> new StudentcurrentCourseNumber();
            case AVG_EXAM_SCORE -> new StudentavgExamScore();
            default -> new StudentfullName();
        }
        return StudentComparator.FULL_NAME;
    }

    public static UniversityComparator getUniversityComparator(UniversityComparator universityComparatorType) {

        switch (universityComparatorType) {

            case ID -> new Universityid();
            case FULL_NAME -> new UniversityfullName();
            case SHORT_NAME -> new UniversityshortName();
            case PROFILE -> new UniversitymainProfile();
            case YEAR -> new UniversityyearOfFoundation();
            default -> new UniversityfullName();

        }
        return UniversityComparator.FULL_NAME;
    }
}
