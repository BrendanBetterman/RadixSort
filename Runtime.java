package RadixSort;
import java.util.Random;

public class Runtime {
    public static void printList(int[] tmpList){
        for(int i = 0; i<tmpList.length; i++){
                System.out.println(tmpList[i]);
            }
    }
    public static void main(String[] args){
        int[] powTen = new int[]{10};
        Random RandGen = new Random();
        Radix sort = new Radix();
        int max = 999;
        int min = 100;
     
        for(int i =0; i<list.length; i++){
            list[i] = RandGen.nextInt(max - min) + min;
        }
        printList(list);
        System.out.println("sorted");
        sort.in(list);
        list = sort.getSorted();
        printList(list);  
    }   
}
