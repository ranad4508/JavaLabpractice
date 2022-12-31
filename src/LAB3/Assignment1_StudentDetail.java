/*
 * Design a class to represent a Student details include the Student ID, Name of the Student,
 Branch, year, location and college. Assign initial values using constructor. Calculate
 average of marks of 6 subjects and calculate attendance percentage.
 */
package LAB3;

class StudentDetail {

    int studentID;
    String studentName;
    String branch;
    int year;
    String location;
    String college;
    float averageMarks;
    float attDays;
    float subOne;
    float subTwo;
    float subThree;
    float subFour;
    float subFive;
    float subSix;
    float attdays;
    float collegeDays;

    StudentDetail() {
    }

    StudentDetail(int studentID,
            String studentName,
            String branch,
            int year,
            String location,
            String college) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.branch = branch;
        this.year = year;
        this.location = location;
        this.college = college;
    }

    public float getAverageMarks() {
        return averageMarks = (subOne + subTwo + subThree + subFour + subFive + subSix) / 6;

    }

    public void setAverageMarks(float averageMarks, float subOne, float subTwo, float subThree, float subFour, float subFive, float subSix) {
        this.averageMarks = averageMarks;
        this.subOne = subOne;
        this.subTwo = subTwo;
        this.subThree = subThree;
        this.subFour = subFour;
        this.subFive = subFive;
        this.subSix = subSix;
    }

    public float getAttendanceDays() {
        return (attdays * 100) / collegeDays;
    }

    public void setAttendanceDays(float attdays, float collegeDays) {
        this.attdays = attdays;
        this.collegeDays = collegeDays;
    }

}

class Assignment1_StudentDetail {

    public static void main(String args[]) {
        StudentDetail std = new StudentDetail(1, "Dinesh", "Gaushala", 2021, "Bijayachowk", "Orchid");
        std.setAverageMarks(0, 90.0f, 93.0f, 91.0f, 97.0f, 90.0f, 92.0f);
        std.setAttendanceDays(140, 150);
        System.out.println("Student details: " + std.studentID);
        System.out.println("Student Name: " + std.studentName);
        System.out.println("Student Branch: " + std.branch);
        System.out.println("Student Year: " + std.year);
        System.out.println("Student Location: " + std.location);
        System.out.println("Student College: " + std.college);
        System.out.println("Average Marks: " + std.getAverageMarks());
        System.out.println("Attendance Days: " + std.getAttendanceDays());

    }
}
