import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private String nameStudent;
    private String dateOfBirth;
    private String homeTown;

    public Student() {
    }

    public Student(String nameStudent, String dateOfBirth, String homeTown) {
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}