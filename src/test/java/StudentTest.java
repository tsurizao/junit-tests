import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    // Create a student
    public void testCreateStudents() {
        Student name = new Student(1L, "James");
        Student otherPerson = null;
        assertNull(otherPerson);
        assertNotNull(name);
    }

    // Fields get updated properly
    @Test
    public void testAllFieldsGetUpdated() {
        Student name = new Student(1L, "Justin");

        assertSame(1L, name.getId());
        assertSame("Justin", name.getName());
        assertSame(0, name.getGrades().size());

        Student name2 = new Student();
        assertSame(0, name2.getGrades().size());
    }

    // Able to add a grade to the application
    @Test
    public void testAddingGradesWorks() {
        Student name = new Student(1L, "Jasmine");
        name.addGrade(100);
        assertSame(100, name.getGrades().get(0));
        name.addGrade(80);
        assertSame(2, name.getGrades().size());
    }

    // Average grade calculation is correct
    @Test
    public void testAverageGradesWorks() {
        Student name = new Student(1L, "Javier");
        name.addGrade(100);
        name.addGrade(100);
        assertEquals(100, name.getGradeAverage(), 0);

        name.addGrade(50);
        assertEquals(83.3, name.getGradeAverage(), 0.04);
    }
}