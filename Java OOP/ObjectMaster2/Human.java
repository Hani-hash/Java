public class Human {
    int health = 100;
    int strength = 3;
    int stealth = 3;
    int inteligence = 3;
    String name = "";

    public void attackOthers(Human target){
        target.health -= strength;
        
    }
 
    
   
}