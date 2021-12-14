package Interfases.ComparsU;

import models.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityshortName {

    public int compare (University o1, University o2){
        return StringUtils.compare(o1.getShortName(),o2.getShortName());
    }
}
