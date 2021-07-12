import java.util.ArrayList;
public class BasicJava{
    public void oneTo255(){

        for (int i=0; i<256 ;i++){
            System.out.println(i);
        }
    }
    public void oddNumbers(){

        for (int i=0; i<256 ;i++){
            if(i%2 ==1){
                 System.out.println(i);
            }
           
        }
    }
     public void printSumTo255(){
        int sum = 0;
        for (int i=0; i<256 ;i++){
            sum +=i;
             System.out.println("New number: "+i + "Sum: " +sum);  
        }
        
    } 
    public void iterateArray(){
        int [] x = {1,3,5,7,9,13};
        for (Integer name : x){
            System.out.println(name);
        }
    }
    public void maxNumber(){
        Integer [] x = {1,2,3,4,5,6};
        Integer max = x[0];
        for(Integer name : x){
            if (max < name ){
                max = name;
            }
        }
        System.out.println(max);

    }
    public void averageSum(){
        int [] myArray = {10,3,2};
        int sum = 0;
        for (int name : myArray){
            sum += name;
        }
        float average = sum / (myArray.length);
        System.out.println(average);
    }
    public ArrayList<Integer> arrayOfodds(){
        ArrayList <Integer> myArray = new ArrayList<Integer>();
        for (int i = 0 ; i<256 ; i++){
            if(i%2 ==1){
                myArray.add(i);
            }
        }
        return(myArray);
    }
    public Integer greaterThanNumber(int y){
        int counter = 0;
        int [] x = {1,2,3,4,5};
        for (int name : x){
            if(name > y){
                counter++;
            }
        }
        return counter;
    }
    public static void squaredArray(){
        int[] x = {10,2,3,4,5};
        ArrayList <Integer> y = new ArrayList<Integer>();
        for (int i=0 ; i < x.length; i++){

            y.add(x[i]*x[i]);
        }
        System.out.println(y);
    }
    public static void noNegativeNumbers(){
        int [] x = {1,2,3,4,-10};
        ArrayList <Integer> y = new ArrayList<Integer>();
        for (int i = 0 ; i <x.length ; i++){
            if(x[i] > 0 ){
                y.add(x[i]);
            } else {
                y.add(0);
            }
        } 
        System.out.println(y);

    }
    public static void maxMinAvg(){
        int [] x = {10,3,5};
        Integer max = x[0];
        Integer min = x[0];
        Integer sum = x[0];
        for (int i = 1; i <x.length ; i++){
            if(min > x[i]){
                min = x[i];
            }
            if (max < x[i]){
                max = x[i]; 
            }
            sum += x[i];

        }
        float avg = sum / (x.length) ;   
        System.out.println("This is max : " + max+ " This is min : " +min + " This is avg : "+avg );
        
    }
    public static void shiftInArrays(){
        int [] x = {1,2,3,4,5};
        ArrayList <Integer> myArray = new ArrayList<Integer>();
        for (int i=1;i < x.length ; i++){
            myArray.add(x[i]);
        }
        myArray.add(0);
        System.out.println(myArray);
    }
    

}
