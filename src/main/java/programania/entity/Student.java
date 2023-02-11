package programania.entity;

public class Student {

    private String fullName;

    private int course;

    private double avgGrade;

    public Student(String fullName, int course, double avgGrade) {
        this.fullName = fullName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

}
