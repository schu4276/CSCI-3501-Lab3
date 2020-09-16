import java.util.Random;
public class Tests {
    private static Random rand = new Random();
    public static void main(String Args[]){
        //Random list of 30 random numbers (0-20) to add to 20
        uniformTest();
        System.out.println("");
        //Test of 30 numbers from 1 - 100 ordered up from a starter to add to 100
        orderedTest();
        System.out.println("");
        //Test of a known best case
        knownOptimalTest();
        System.out.println("");
        //Test of a known worst case
        knownWorstCaseTest();
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
        int binCap = 100;
        int itemCount = 30;
        int range = binCap-itemCount;
        Integer[] parameters = new Integer[itemCount];
        Integer seed = rand.nextInt(range);
        for(int i = 0; i < itemCount; i++){
            parameters[i] = seed;
            seed++;
        }
        Lab4.packBin(parameters, binCap);
    }

    public static void knownOptimalTest(){

    }

    public static void knownWorstCaseTest(){

    }
}
