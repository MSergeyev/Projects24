package Interfases.ComparsS;

import models.Students;

public class StudentcurrentCourseNumber {
    public int compare(Students o1, Students o2){
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
