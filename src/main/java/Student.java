import java.util.ArrayList;

public class Student {
    //    id should be a long number used to represent a "unique user" in our application.
    private long id;
    //    name is a String that holds the name of the student.
    private String name;
    //    grades is an ArrayList that contains a list of Integer numbers.
    private ArrayList<Integer> grades;

    public Student() {
    }

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}