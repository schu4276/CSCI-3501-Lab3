import java.util.Random;
public class Tests {
    private static Random rand = new Random();
    public static void main(String Args[]){
        //Random list of 30 random numbers (0-20) Bin
        System.out.println("Random list of 30 random numbers (0-20)"); 
        uniformTest();
        System.out.println("");
        //Test of 30 numbers from 1 - 100 ordered up from a starter to add to 100
        System.out.println("Ordered list of numbers");
        orderedTest();
        System.out.println("");
        System.out.println("");
        //Test of a known non optimal
        System.out.println("non-Optimal example");
        WorstCaseTest();
        System.out.println("");
        System.out.println("");
        //Test of a known optimal case
        System.out.println("Optimal example");
        OptimalCaseTest();
        System.out.println("");
        System.out.println("");
    }

    public static void uniformTest(){
        int binCap = 20;
        int itemCount = 30;
        int range = 20;
        Integer[] parameters = new Integer[itemCount];
        for(int i = 0; i < itemCount; i++){
            Integer inserted = rand.nextInt(range);
            parameters[i] = inserted;
        }
        Lab4.packBin(parameters, binCap);
    }

    public static void orderedTest(){
        int binCap = 20;
        int itemCount = 15;
        Integer[] parameters = new Integer[itemCount];
        for(int i = 0; i < itemCount; i++){
            parameters[i] = i;
    
        }
        Lab4.packBin(parameters, binCap);
    }

    public static void WorstCaseTest(){
       int binCap = 20;
        int itemCount = 15;
        Integer[] parameters = {1,2,3,4,5,6,7,8,9,190,11,12,13,14,15};
        Lab4.packBin(parameters, binCap);

    }

    public static void OptimalCaseTest(){
        int binCap = 20;
        int itemCount = 30;
        Integer[] parameters = {2,4,6,8,10,5,20,10,3,6,3,7,12,16,1,15,12,4,9,3,6,8,3,1,5,3,19,15,4,0};
        Lab4.packBin(parameters, binCap);

    }
}
