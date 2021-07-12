public class Human {
     int strength = 3;
     int stealth = 3 ;
     int inteligence = 3;
     int health = 100;
    
    public void attackOthers(Human target){
        target.health -= strength;

    }
}
