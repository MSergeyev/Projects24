package UtilsCompars;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Students;
import models.University;
import java.util.List;

public class Json {

    private Json() {
    }

    public static String studentToJson(Students student) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
    }

    public static String universityToJson(University university) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(university);
    }

    public static Students jsonToStudent(String json) {
        return new Gson().fromJson(json, Students.class);
    }

    public static University jsonToUniversity(String json) {
        return new Gson().fromJson(json, University.class);
    }

    public static String studentListToJson(List<Students> students) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(students);
    }

    public static String universityListToJson(List<University> universities) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(universities);
    }

    public static List<Students> jsonToStudentList(String json) {
        return new Gson().fromJson(json, new TypeToken<List<Students>>() {
        }.getType());
    }

    public static List<University> jsonToUniversityList(String json) {
        return new Gson().fromJson(json, new TypeToken<List<University>>() {
        }.getType());
    }

}
