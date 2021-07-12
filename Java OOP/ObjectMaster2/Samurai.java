public class Samurai extends Human {
    public Samurai(){
        health = 200;
        name = "Samurai Danzo";
    }

    public void deathblow(Human target){
        target.health = 0 ;
        System.out.println("You have been killed " + target.name + " By " + name);
        health = health/2;
    }
    public void mediate(){
        health += (health/2);
    }
   
}
