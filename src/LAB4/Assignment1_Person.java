/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Person {

    String firstName;
    String lastName;
    String address;
    int id;

    Person() {
    }

    Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getID() {
        return id;
    }

    public void setID(int newID) {
        id = newID;
    }

    public void display() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);

    }
}

class Student extends Person {

    double gpa;

    Student() {

    }

    Student(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double newGpa) {
        gpa = newGpa;
    }

    public void display() {
        System.out.println("Gpa: " + gpa);
    }
}

class Employee extends Person {

    String jobTitle;

    Employee() {
        super();
    }

    Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String newJobTitle) {
        jobTitle = newJobTitle;
    }

    public void display() {
        System.out.println("Job Title: " + jobTitle);
    }
}

public class Assignment1_Person {

    public static void main(String args[]) {
        Employee e = new Employee();
        e.setJobTitle("Student");
        Student s = new Student();
        s.setGpa(4.0);
        e.display();
        s.display();
        Person p = new Person("Dinesh", "Rana", "Tikathali", 07);
        p.display();
    }
}
