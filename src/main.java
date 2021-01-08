import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Student> studentList = FileProcess.readObjectFromFile();
        ManagerStudent managerStudent = new ManagerStudent(studentList);
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("1.ADD NEW STUDENT");
            System.out.println("2.SHOW ALL SUTDENT");
            System.out.println("3.SEACH STUDENT BY NAME");
            System.out.println("4.EDIT STUDENT BY NAME");
            System.out.println("5.EXIT PROGRAM");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("ENTER NAME STUDENT");
                    String nameStudent = scanner.nextLine();
                    System.out.println("ENTER DATE OF BIRTHDAY");
                    String dateOfBirthDay = scanner.nextLine();
                    System.out.println("ENTER HOME TOWN");
                    String homeTown = scanner.nextLine();
                    Student student = new Student(nameStudent, dateOfBirthDay, homeTown);
                    managerStudent.addNewStudent(student);
                    break;
                case 2:
                    managerStudent.showAllStudent();
                    break;
                case 3:
                    managerStudent.searchStudent();
                    break;
                case 4:
                    System.out.println("ENTER EDIT NAME STUDENT ");
                    String nameStudent1 = scanner.nextLine();
                    System.out.println("ENTER EDIT DATE OF BIRTHDAY");
                    String dateOfBirthDay1 = scanner.nextLine();
                    System.out.println("ENTER EDIT HOME TOWN");
                    String homeTown1 = scanner.nextLine();
                    Student student1 = new Student(nameStudent1,dateOfBirthDay1,homeTown1);
                    managerStudent.editStudent(nameStudent1,student1);
                case 5:
                    System.out.println("EXIT PROGRAM");
            }
        }while (choice != 0);
        System.exit(0);
    }

}
