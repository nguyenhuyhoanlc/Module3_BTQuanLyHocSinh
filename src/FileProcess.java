import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileProcess {
    public static final String FILEPATH = "HOAN.dat";

    public static void writeObjectToFile(List<Student> m) {
        try {
            FileOutputStream hoan = new FileOutputStream(FILEPATH);
            ObjectOutputStream thinh = new ObjectOutputStream(hoan);
            thinh.writeObject(m);
            thinh.flush();
            thinh.close();
            hoan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readObjectFromFile() {
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream hoan1 = new FileInputStream(FILEPATH);
            ObjectInputStream thinh1 = new ObjectInputStream(hoan1);
            studentList = (List<Student>) thinh1.readObject();
            thinh1.close();
            hoan1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return studentList;
    }
}
