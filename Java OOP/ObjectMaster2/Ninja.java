public class Ninja extends Human {
    public Ninja(){
        stealth = 10;
        name ="Itachi";
    }

    public void stealHuman (Human target){
        target.health -= stealth;
        health += stealth;
    }
    public void runAway (){
        health -= 10;
    }
}
