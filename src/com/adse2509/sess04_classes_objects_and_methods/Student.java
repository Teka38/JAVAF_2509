package sess04_classes_objects_and_methods;

/**
 * A class that models a student object.
 * This class stores a student's ID, name, age, and gender, and provides
 * methods to initialise and display the student's details.
 *
 * @author Teka
 */
public class Student
{

    String studentID;
    String name;
    int age;
    char gender;

    /**
     * Creates a student object with default values.
     */
    public Student()
    {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'M';
    }

    /**
     * Initialises the student object with sample data.
     */
    public void initialiseStudent()
    {
        this.studentID = "Student0001";
        this.name = "Student One";
        this.age = 18;
    }

    /**
     * Displays the student's details on the console.
     */
    public void displayDetails()
    {
        System.out.println("Student Details");
        System.out.println("-".repeat(50));
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student's Name: " + this.name);
        System.out.println("Student's age: " + this.age);
        System.out.println("Student's gender: " + (this.gender == 'm'
                || this.gender == 'M' ? "Male" : "Female"));
        System.out.println("-".repeat(50));
    }

    /**
     * Returns the student's details as a formatted string.
     *
     * @return a string containing the student's details.
     */
    @Override
    public String toString()
    {
        return "Student Details\n"
                + "-".repeat(50)
                + "\nStudent ID: " + this.studentID
                + "\nStudent's Name: " + this.name
                + "\nStudent's age: " + this.age
                + "\nStudent's gender: " + (this.gender == 'm'
                || this.gender == 'M' ? "Male\n" : "Female\n")
                + "-".repeat(50);
    }

}