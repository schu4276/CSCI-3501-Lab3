import java.util.*;
public class Lab4{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter bin capacity, number of items, then the number of items, then the items themselves. All separated by spaces");
        String input = myScanner.nextLine();
        String[] splitInput = input.split(" ");
        int[] parameters = new int[splitInput.length];
        for(int i=0; i<splitInput.length; i++){
        	parameters[i] = Integer.parseInt(splitInput[i]);

        }
        int binCapacity = parameters[0];
        int n = parameters[1];
        int[] itemArray = new int[parameters.length-2];
        for(int i =0; i < n; i++){
        	itemArray[i] = parameters[i+2];
        } 

        // Test prints to make sure input is being taken correctly
        System.out.println(binCapacity);
        System.out.println(n);
        for(int i=0; i< itemArray.length; i++){
        	System.out.println(itemArray[i]);
        }
        Collections.reverse(Arrays.sort(itemArray));

    }//end main

    public static void packBin(int[] itemArray, int binCapacity){
        //Collections.reverse(Arrays.sort(itemArray));


    } 
} //end lab4
