// used this source for reverse sorting array: https://www.java67.com/2016/07/how-to-sort-array-in-descending-order-in-java.html
// help on scanner class and input: https://stackoverflow.com/questions/7646392/convert-string-to-int-array-in-java
// Algorithm for packBin() is based on algorithm from: https://security-consulting.icu/blog/2014/08/bin-packing-algorithm-java/
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

        // making sure user input is correct 
        if(parameters.length-2 != n ){
        	System.out.println("ERROR: Requested n does not match # of items.  Please try again");
        	System.exit(0);

        }
        Integer[] itemArray = new Integer[parameters.length-2];
        for(int i =0; i < n; i++){
        	itemArray[i] = parameters[i+2];
        } 
             
        packBin(itemArray, binCapacity);
        

    }//end main

    public static void packBin(Integer[] itemArray, int binCapacity){
       // sorting the items in reverse order
       String[] binsOutput = new String[itemArray.length];
       ArrayList<Integer> unSorted = new ArrayList<Integer>();
       ArrayList<Bin> bins = new ArrayList<Bin>();
       Arrays.sort(itemArray, Collections.reverseOrder());
       
       bins.add(new Bin(binCapacity));
     
       for(int i=0; i< itemArray.length; i++){
       		// check to make sure item is not too large
       		if(itemArray[i] > binCapacity){
            	unSorted.add(itemArray[i]);
            	i++;
            }
            // continue searching for appropriate bin until item has been placed
            boolean itemPlaced = false; 
            int binCount = 0;
            while(!itemPlaced){
            	if(binCount>= bins.size()){
            		bins.add(new Bin(binCapacity));
            	}
            	Bin currBin = bins.get(binCount);
                if (itemArray[i] <= currBin.getUnpackSpace()){
                	currBin.addItem(itemArray[i]);
                    itemPlaced= true;

                }
                else if(itemArray[i] > currBin.getUnpackSpace()){
                    binCount++;
                    
                }

            }

       }
       binOutput(bins, unSorted);
    }

    public static void binOutput(ArrayList<Bin> bins, ArrayList<Integer> unSorted ){
    	int totalUnusedSpace =0; 
    	for(int i=0; i<bins.size(); i++){
    		Bin currBin = bins.get(i);
    		System.out.println("Bin " + i +": " + currBin.getItems() + " space remaining: " + currBin.getUnpackSpace());	
    		totalUnusedSpace += currBin.getUnpackSpace();
    	}
    	// Print unpacked items
    	if(unSorted.size() <= 0){
    		System.out.println();
    			System.out.println("all items were packed");
    	}else{
    		System.out.println();
    		System.out.println(" *items unpacked: " + unSorted);
    	}
    	// Print total unused space
    	System.out.println();
    	System.out.println(" *Total unused space: " + totalUnusedSpace);

    }

       


} //end lab4
