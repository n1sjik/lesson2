package ifmo.exam;

 public class HomeAnimals extends Animals implements CanRunOut,WildAnimalAttack,CanBeEatenByF{

    protected int health;
    protected int haSpeed;

    public HomeAnimals(String name, int weight, int health, int haSpeed) {
        super(name, weight);
        setHealth(health);
        setHaSpeed(haSpeed);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHaSpeed() {
        return haSpeed;
    }

    public void setHaSpeed(int haSpeed) {
        this.haSpeed = haSpeed;
    }

    public void Healing (int health){

    }


    @Override
    public void Run(WildAnimals animal) {
        if (haSpeed > animal.waSpeed){
            System.out.println(name + "Животное сбежало");
        }
    }

     @Override
     public void Attack(WildAnimals animals) {
        if (health > 0) {
            if (haSpeed < animals.waSpeed) {
                health -= animals.power;
                if (health > 0) {
                    System.out.println(name + "получил(а) урон " + animals.power);
                } else if (health == 0) {
                    System.out.println(name + "погиб(ла)");
                }
            }
        }

     }
 }
