package ifmo.Lesson8part2;

abstract public class SubjectForLearn extends MainInfo {
    private static final String[] subjects = {"Физика", "Математика", "Биология", "Химия"};
    private String subject = "";

    public SubjectForLearn(String name, String surname, int age) {
        super(name, surname, age);
    }

    public SubjectForLearn(String name, String surname, int age, String subject) {
        super(name, surname, age);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        for (String s : subjects) {
            if (s.equals(subject)) {
                this.subject = subject;
                break;
            }
        }
    }
}
