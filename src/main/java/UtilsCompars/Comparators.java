package UtilsCompars;

import Interfases.ComparsS.StudentavgExamScore;
import Interfases.ComparsS.StudentcurrentCourseNumber;
import Interfases.ComparsS.StudentfullName;
import Interfases.ComparsS.StudentuniversityId;
import Interfases.ComparsU.*;
import enums.StudentComparator;
import enums.UniversityComparator;

public class Comparators {

    public Comparators() {
    }

    public static StudentComparator getStudentComparator(StudentComparator studentComparator) {
        switch (studentComparator) {
            case COURSE -> new StudentcurrentCourseNumber();
            case UNIVERSITY_ID -> new StudentuniversityId();
            case FULL_NAME -> new StudentfullName();
            case AVG_EXAM_SCORE -> new StudentavgExamScore();
            default -> new StudentfullName();
        }
        return StudentComparator.FULL_NAME;
    }

    public static UniversityComparator getUniversityComparator (UniversityComparator universityComparator){
        switch (universityComparator){
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
