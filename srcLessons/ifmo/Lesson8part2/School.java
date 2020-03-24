package ifmo.Lesson8part2;

import java.util.Arrays;

public class School {
    private final String name;
    private Director director;
    private Teacher[] teachers;
    private Student[] students;

    public School(String name, Director director) {
        this.name = name;
        this.director = director;
        teachers = new Teacher[10];
        students = new Student[25];
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        if (director != null) {
            this.director = director;
        }
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                return;
            }
        }
        teachers = Arrays.copyOf(teachers, teachers.length + 15);
        teachers[teachers.length - 15] = teacher;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
        students = Arrays.copyOf(students, students.length + 15);
        students[students.length - 15] = student;
    }

    public void schoolDay() {
        director.startClasses();
        for (Student student : students) {
            if (student != null) {
                for (Teacher teacher : teachers) {
                    if (teacher != null) {
                        if (!"".equals(student.getSubject())
                                && student.getSubject().equals(teacher.getSubject())) {
                            teacher.educate(student);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        director.finishClasses();
    }

    public void Learning() {
        for (Student student : students) {
            if (student != null) {
                System.out.printf("\n", student.name, student.surname, student.getSubject(),
                        student.getSubjectLevel());
            } else {
                break;
            }
        }
    }
}





