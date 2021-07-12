public class HumanTest {
    public static void main (String [] args ){
        Human h1 = new Human();
        Human h2 = new Human();
        h1.attackOthers(h2);
        System.out.println("health has been reduced to : " + h2.health);
    }
}