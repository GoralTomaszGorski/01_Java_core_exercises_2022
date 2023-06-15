import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NotSerializableExample {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Jane", "Kowlaski");
        FileOutputStream fos = new FileOutputStream("person.p");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
    }
}
