import org.example.entity.Student;
import org.example.entity.Teacher;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testCountStudentAverageAge() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 12345, 20, 2, "CE"));
        students.add(new Student("Jane", "Smith", 54321, 22, 3, "EE"));

        double expected = (20 + 22) / 2.0;
        assertEquals(expected, Student.countStudentAverageAge(students), 0.01);
    }

    @Test
    public void testCountTeacherAverageAge() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Jack", "Brown", 67890, 35, "Math"));
        teachers.add(new Teacher("Jill", "White", 98765, 40, "English"));

        int expected = (int) ((35 + 40) / 2.0);
        assertEquals(expected, Teacher.countTeacherAverageAge(teachers), 0.01);
    }
}
