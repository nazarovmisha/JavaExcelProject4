package org.example;

public class Statistics {
   private String studyProfile;
    private float avgExamScore;
    private int numberOfStudentsByProfile;
    private int numbersOfUniversities;
    private String UniversitiesNames;

    public Statistics(String studyProfile, float avgExamScore, int numberOfStudentsByProfile, int numbersOfUniversities, String universitiesNames) {
        this.studyProfile = studyProfile;
        this.avgExamScore = avgExamScore;
        this.numberOfStudentsByProfile = numberOfStudentsByProfile;
        this.numbersOfUniversities = numbersOfUniversities;
        UniversitiesNames = universitiesNames;
    }

    public String getStudyProfile() {
        return studyProfile;
    }

    public Statistics setStudyProfile(String studyProfile) {
        this.studyProfile = studyProfile;
        return this;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Statistics setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public int getNumberOfStudentsByProfile() {
        return numberOfStudentsByProfile;
    }

    public Statistics setNumberOfStudentsByProfile(int numberOfStudentsByProfile) {
        this.numberOfStudentsByProfile = numberOfStudentsByProfile;
        return this;
    }

    public int getNumbersOfUniversities() {
        return numbersOfUniversities;
    }

    public Statistics setNumbersOfUniversities(int numbersOfUniversities) {
        this.numbersOfUniversities = numbersOfUniversities;
        return this;
    }

    public String getUniversitiesNames() {
        return UniversitiesNames;
    }

    public Statistics setUniversitiesNames(String universitiesNames) {
        UniversitiesNames = universitiesNames;
        return this;
    }
}
