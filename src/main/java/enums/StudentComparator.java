package enums;

import models.Students;

import java.util.Comparator;

public enum StudentComparator implements Comparator<Students> {
        UNIVERSITY_ID,
        FULL_NAME,
        COURSE,
        AVG_EXAM_SCORE;

    @Override
    public int compare(Students o1, Students o2) {
        return 0;
    }
}
