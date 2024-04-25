import org.example.entity.Student;
import org.example.entity.Teacher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testStudentToString() {
        Student student = new Student("John", "Doe", 12345, 20, 2, "CE");
        String expected = "Student: John Doe, ID: 12345, Age: 20, Course: 2, Faculty: CE";
        assertEquals(expected, student.toString());
    }

}
