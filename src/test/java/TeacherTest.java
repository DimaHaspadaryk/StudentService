import org.example.entity.Teacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void testTeacherToString() {
        Teacher teacher = new Teacher("Jane", "Smith", 54321, 35, "Math");
        String expected = "Teacher: Jane Smith, ID: 54321, Age: 35, Subject: Math";
        assertEquals(expected, teacher.toString());
    }
}