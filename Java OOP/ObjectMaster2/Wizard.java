public class Wizard extends Human {
    //int health = 50;
    //int inteligence = 8;
    static int counter = 0;

    public Wizard(){
        counter++;
        health = 50;
        inteligence = 8;
        name="Wizard";
    }

    public void heal(Human healme){
        healme.health += inteligence;
    }
    public void fireBall(Human target){
        target.health -= inteligence *3 ;
    }
    
    public int howMany(){
       return counter;
    }
}