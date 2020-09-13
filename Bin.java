import java.util.*;
public class Bin{ 
	private ArrayList<Integer> items; 
	private int capacity; 

	// Constructor 
	public Bin(int capacity){
		this.capacity=capacity;
		this.items = new ArrayList<Integer>();
	}

	// Accessors 
	public int getUnpackSpace(){ return capacity; }
	public ArrayList<Integer> getItems(){return items; }
	// Mutators
	public void addItem(Integer itemValue){
		capacity -= itemValue;
		items.add(itemValue);
	}
	

}//end bins class