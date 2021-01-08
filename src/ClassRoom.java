public class ClassRoom {
    private String nameClass;
    private int theCourse;
    private int semester;

    public ClassRoom(){}


    public ClassRoom(String nameClass, int theCourse, int semester) {
        this.nameClass = nameClass;
        this.theCourse = theCourse;
        this.semester = semester;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getTheCourse() {
        return theCourse;
    }

    public void setTheCourse(int theCourse) {
        this.theCourse = theCourse;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "nameClass='" + nameClass + '\'' +
                ", theCourse=" + theCourse +
                ", semester=" + semester +
                '}';
    }
}
