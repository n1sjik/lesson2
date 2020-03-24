package ifmo.Lesson8part2;

public class Main {
    public static void main(String[] args) {
        Teacher headTeacher = new Teacher("Антон Алексеевич", "Иванов", 44);
        School school = new School("МОУ Лицей  №11", Director.addDirector(headTeacher));
        school.addStudent(new Student("Владимир", "Харламов", 13, "Физика"));
        school.addStudent(new Student("Никита", "Попов", 15, "Химия"));
        school.addStudent(new Student("Сергей", "Бабаков", 10, "История"));
        school.addStudent(new Student("Иван", "Никулин", 10, "География"));


        school.addTeacher(new Teacher("Василиса Петровна", "Аксенова", 27, "Физика"));
        school.addTeacher(new Teacher("Семён Андреевич", "Пынцарь", 33, "Математика"));
        school.addTeacher(new Teacher("Анастасия Михайловна", "Ненская", 37, "Биология"));
        school.addTeacher(new Teacher("Галина Адольфовна", "Аксенова", 43, "Химия"));


        school.Learning();
        for (int i = 0; i < 20; i++) {
            school.schoolDay();
        }
        school.Learning();
    }
}
