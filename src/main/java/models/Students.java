package models;

public class Students {
    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgExamScore;

    public Students() {
    }

    public String getFullName() {
        return fullName;
    }

    public Students setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUniversityId() {
        return universityId;
    }

    public Students setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public Students setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Students setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    @Override
    public String toString() {
        return String.format("fullName = %s, universityId = %s, currentCourseNumber = %s, avgExamScore = %s",
                this.fullName,
                this.universityId,
                this.currentCourseNumber,
                this.avgExamScore);
    }
}
