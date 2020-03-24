package ifmo.Lesson8part2;

public class Director extends MainInfo {

    private Director(MainInfo person) {
        super(person.name, person.surname, person.age);
    }

    public static Director addDirector(MainInfo person) {
        Director director = null;
        if (person != null) {
            director = new Director(person);
        }
        return director;
    }

    public void startClasses() {
        System.out.println("Директор " + getName() + " " + getSurname() + " объявляет начало занятий");
    }

    public void finishClasses() {
        System.out.println("Директор " + getName() + " " + getSurname() + " объявляет окончание занятий");
    }
}