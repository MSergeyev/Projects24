package models;

public class Students {


    private String fullName;
    private String Universityid;
    private int currentCourseNumber;
    private float avgExamScore;


    @Override
    public String toString() {
        return "Students{" +
                "fullName='" + fullName + '\'' +
                ", universityid='" + Universityid + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }


    public Students() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityid() {
        return Universityid;
    }

    public void setUniversityid(String universityid) {
        this.Universityid = universityid;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }
}
