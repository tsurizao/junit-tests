import org.junit.Before;
import org.junit.Test;

import java.net.CookieHandler;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohort = new Cohort();

    @Before
    public void setup() {
        Student cory = new Student(1L, "Cory");
        Student justin = new Student(2L, "Justin");
        Student casey = new Student(3L, "Casey");
        cohort.addStudent(cory);
        cohort.addStudent(justin);
        cohort.addStudent(casey);
    }

    // Cohort can add a student to a list of students
    @Test
    public void testCohortAddStudentToList() {
        assertSame(3, cohort.getStudents().size());
    }

    // Cohort can get the current list of students
    @Test
    public void testCohortCanGetCurrentListOfStudents() {
        assertSame("Cory", cohort.getStudents().get(0).getName());
        assertSame("Justin", cohort.getStudents().get(1).getName());
    }

    // Cohort get average, calculate correctly
    @Test
    public void testCohortGetAverageCalculateCorrectly() {
        assertEquals(0D, cohort.getCohortAverage(), 0);
        Student jason = new Student(5L, "Jason");
        jason.addGrade(100);
        jason.addGrade(50);
        jason.addGrade(50);
        cohort.addStudent(jason);
        assertEquals(66.6, jason.getGradeAverage(), 0.07);
        assertEquals(16.6, cohort.getCohortAverage(), 0.07);
    }
}
