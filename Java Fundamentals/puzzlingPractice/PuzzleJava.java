import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava{
    public static void first(){
        int [] x = {3,5,1,2,7,9,8,13,25,32};
        ArrayList <Integer> myArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i =0 ; i < x.length ; i++){
            sum += x[i];
            if (x[i] > 10){
                myArray.add(x[i]);
            }
        }
        System.out.println(sum);
        System.out.println(myArray);
        


    }
    public static void shuffleAndPrint(){
        ArrayList <String> myArray = new ArrayList<String>();
        ArrayList <String> myArray2 = new ArrayList<String>();
        myArray.add("Nancy");
        myArray.add("Jinichi");
        myArray.add("Fujibayashi");
        myArray.add("Momochi");
        myArray.add("Ishikawa");
        Collections.shuffle(myArray);
        System.out.println(myArray);
        for(int i = 0 ; i<myArray.size() ; i++){
            if(myArray.get(i).length() > 5){
                myArray2.add(myArray.get(i));
            }
        }
        System.out.println(myArray2);
    }
    public static void allLettersInAlphabet(){
        ArrayList<String> myArray = new ArrayList<String>();
        for (char i = 'A' ; i <='Z' ; i++){
            myArray.add(Character.toString(i));
        }
        System.out.println(myArray);
        Collections.shuffle(myArray);
        System.out.println("Last Letter After Shuffle " + myArray.get(myArray.size() - 1));
        System.out.println("First Letter After Shuffle " +myArray.get(0));

        if("AIEUO".indexOf(myArray.get(0)) > 0){
            System.out.println("The first letter is vowel");
        }
    }   
    public static void generateRandomNumber(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0 ; i < 10 ; i ++){
            int finalNumber = ThreadLocalRandom.current().nextInt(55, 101);
            myArray.add(finalNumber);
        }
        
        System.out.println(myArray);
    }
    public static void random2(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0 ; i < 10 ; i ++){
            int finalNumber = ThreadLocalRandom.current().nextInt(55, 101);
            myArray.add(finalNumber);
        }
        Collections.sort(myArray);
        System.out.println(myArray);
        System.out.println("This is the Smallest value in array: " + myArray.get(0));
        System.out.println("This is the biggest value in array: "+  myArray.get(9));

    }
    public static void randomString(){
        Random r = new Random();
        StringBuilder randString = new StringBuilder();
        String allCharacters = "abcdefghijklmnopqrstuvwxy";
        for (int i=0 ; i <5 ; i++){
            randString.append(allCharacters.charAt(r.nextInt(allCharacters.length())));
        }
        System.out.println(randString);

    }
    public static void randomArrayOfString(){
        Random r = new Random();
        StringBuilder randString = new StringBuilder();
        ArrayList<String> myArray = new ArrayList<String>();
        String allCharacters = "abcdefghijklmnopqrstuvwxy";
        for (int x = 0 ; x <10 ; x++){
             for (int i=0 ; i <5 ; i++){
            randString.append(allCharacters.charAt(r.nextInt(allCharacters.length())));
            }
            String myString = randString.toString();
            myArray.add(myString);
            randString.setLength(0);
        
        }
        System.out.println(myArray);
        
        


    }
}