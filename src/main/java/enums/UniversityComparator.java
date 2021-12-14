package enums;

import models.University;

import java.util.Comparator;

public enum UniversityComparator implements Comparator<University> {
    ID,
    FULL_NAME,
    SHORT_NAME,
    PROFILE,
    YEAR;

    @Override
    public int compare(University o1, University o2) {
        return 0;
    }
}
