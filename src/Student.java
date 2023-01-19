import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Student {
    private String firstName;
    private String lastName;
    private Integer studentNumber;
    private List<String> activities;

    // Constructor
    public Student(String firstName, String lastName, Integer studentNumber, List<String> activities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.activities = activities;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("teaching", "coding"));
        Student s1 = new Student("Bob", "Wright", 45, arr);
        System.out.println(s1.getFirstName() + " " + s1.getLastName());
        s1.setFirstName("John");
        System.out.println(s1.getFirstName() + " " + s1.getLastName());
    }
}
