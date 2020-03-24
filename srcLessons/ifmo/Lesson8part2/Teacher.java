package ifmo.Lesson8part2;

public class Teacher extends SubjectForLearn implements LetEducate {
    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age, subject);
    }


    @Override
    public void educate(GetEducation student) {
        System.out.println(this + " преподаёт " + getSubject());
        student.education();
    }
}
