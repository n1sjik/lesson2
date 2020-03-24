package ifmo.Lesson8part2;

public class Student extends SubjectForLearn implements GetEducation{
    private int subjectLevel = 0;

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Student(String name, String surname, int age, String subject) {
        super(name, surname, age, subject);
    }

    public Student(String name, String surname, int age, String subject, int subjectLevel) {
        super(name, surname, age, subject);
        setSubjectLevel(subjectLevel);
    }

    public int getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(int subjectLevel) {
        this.subjectLevel = Math.max(subjectLevel, 0);
    }

    @Override
    public void education() {
        int r =(int) Math.random() * 4 + 1;
        System.out.println(this + " получил знания по " + getSubject());
        setSubjectLevel(subjectLevel + r);
    }
}