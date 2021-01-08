import java.security.Key;
import java.util.*;

public class ManagerStudent {
    List<Student> studentList = new ArrayList<>();
//    List<ClassRoom> classRoomList = new ArrayList<>();
//    Student student = new Student();

    public ManagerStudent(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addNewStudent(Student student) {
        studentList.add(student);
        FileProcess.writeObjectToFile(studentList);

    }

    public void showAllStudent() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin cần tìm : ");
        String searchBirthDays = sc.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (searchBirthDays.equals(studentList.get(i).getDateOfBirth())) {
                System.out.println(studentList.get(i));
                break;
            }
            System.out.println("Không tìm thấy thông tin");
        }
    }

    public void editStudent(String name, Student student){
        for (int i = 0; i < studentList.size(); i++) {
            if (name.equals(studentList.get(i).getNameStudent())) {
                studentList.set(i, student);
                FileProcess.writeObjectToFile(studentList);
                return;
            }
        }
        System.out.println("Không tìm thấy thông tin cần sửa");
    }

    public void deleteStudent(String dateBirthDay){
        for (int i = 0; i < studentList.size(); i++) {
            if (dateBirthDay.equals(studentList.get(i).getDateOfBirth())) {
                studentList.remove(studentList.get(i));
            }
        }

    }
}
