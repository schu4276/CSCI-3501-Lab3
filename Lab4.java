// used this source for reverse sorting array: https://www.java67.com/2016/07/how-to-sort-array-in-descending-order-in-java.html

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
        Integer[] itemArray = new Integer[parameters.length-2];
        for(int i =0; i < n; i++){
        	itemArray[i] = parameters[i+2];
        } 
        System.out.println();
       
        // Test prints to make sure input is being taken correctly


        for(int i=0; i< itemArray.length; i++){
        	System.out.println(itemArray[i]);
        }
        

    }//end main

    public static void packBin(int[] itemArray, int binCapacity){
       // sorting the items in reverse order
       ArrayList<Integer> bins = new ArrayList<Integer>();
       ArrayList<Integer> binsOutput = new ArrayList<Integer>();
       Arrays.sort(itemArray, Collections.reverseOrder());
       for(int i = 0; i < itemArray.length; i++){
           bins.add(binCapacity);
       }
       for(int i=0; i< itemArray.length; i++){
            boolean itemPlaced = false; 
            // continue until item has been placed
            int binCount = 0;
            while(!itemPlaced){
                if (itemArray[i] <= bin.get(binCount)){
                    bin.get(binCount) = bin.get(binCount) - itemArray[i];
                    System.out.println("item " + itemArray[i] + " placed in bin " + binCount);
                    itemPlaced= true;

                }
                else if(itemArray[i] > bin.get(binCount)){
                    binCount++;
                   
                }


            }sss

       }
      





    } 
} //end lab4
