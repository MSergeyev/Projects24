package Interfases.ComparsS;

import models.Students;
import org.apache.commons.lang3.StringUtils;

public class StudentuniversityId {
    public int compare(Students o1, Students o2){
        return StringUtils.compare(o1.getUniversityid(), o2.getUniversityid());
    }
}
