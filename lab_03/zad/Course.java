package zad;

public class Course {
    public static final int DEFAULT_MAX_STUDENTS = 30;
    private static int numberOfCreatedCourses = 0;

    private String name;
    private int maxStudents;
    private Student[] enrolledStudents;
    private int currentStudentsCount = 0;

    public Course(String name, int maxStudents) {
        setName(name);
        if (maxStudents <= 0) {
            throw new IllegalArgumentException("Limit studentów musi być dodatni.");
        }
        this.maxStudents = maxStudents;
        this.enrolledStudents = new Student[maxStudents];
        numberOfCreatedCourses++;
    }

    public Course(String name) {
        this(name, DEFAULT_MAX_STUDENTS);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nazwa kursu nie może być pusta.");
        }
        this.name = name;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public int getCurrentStudentsCount() {
        return this.currentStudentsCount;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public boolean enroll(Student student) {
        if (student == null || currentStudentsCount >= maxStudents) {
            return false;
        }
        enrolledStudents[currentStudentsCount++] = student;
        return true;
    }

    public boolean enroll(String studentName, String albumNumber) {
        return enroll(new Student(studentName, albumNumber));
    }
}