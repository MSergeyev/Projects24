package Interfases.ComparsS;

import models.Students;

public class StudentavgExamScore {

    public int compare (Students o1, Students o2){

        return Float.compare(o2.getAvgExamScore(), o1.getAvgExamScore());
    }


}
