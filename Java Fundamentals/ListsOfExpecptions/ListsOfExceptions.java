import java.util.ArrayList;
public class ListsOfExceptions{
    public static void listExceptions(){
        ArrayList <Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("GoodBye World");
        for (int i =0 ; i < myList.size(); i++){
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (Exception e){
                System.out.println("Oh No an error has occured : " + i + "The value is : " +myList.get(i) );
                System.out.println(e);
            }
            
        }


    }
}
