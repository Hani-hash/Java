public class HumanTest {
    public static void main (String[] args){
        Human h1 = new Human();
        Ninja n1 = new Ninja();
        Wizard w1 = new Wizard();
        Wizard w2 = new Wizard();
        Samurai s1 = new Samurai();

        // wizard health = 50
        // Ninja health = 100
        // Samurai health = 200

        n1.attackOthers(w1);
        System.out.println(w1.health); // not working 
        n1.stealHuman(w1);
        System.out.println(w1.health); // not working 
        System.out.println(n1.health); // works 
        n1.runAway();
        System.out.println(n1.health); // works
        s1.deathblow(n1);
        System.out.println(n1.health); // works
        System.out.println(s1.health); //works
        s1.mediate();
        System.out.println(s1.health); // works
        w1.heal(s1);
        System.out.println(s1.health); // not working
        w1.fireBall(s1);
        System.out.println(s1.health);// not working 
        w1.howMany();
        System.out.println(w1.counter); // not working 


    }
}
