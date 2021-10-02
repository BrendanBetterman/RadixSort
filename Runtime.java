package RadixSort;

import java.util.Random;
import java.util.Scanner;
import java.time.Instant;			// https://docs.oracle.com/javase/tutorial/datetime/iso/period.html
import java.time.temporal.ChronoUnit;   // units include: SECONDS, MILLIS, MICROS, NANOS

public class Runtime {
    public static void main(String[] args){
        int[] powTen = new int[]{10};
        
        Random RandGen = new Random();
        Radix sort = new Radix();
        Scanner scnr = new Scanner(System.in);
        int max = 999;
        int min = 100;
        Instant beg, end;
        int times = scnr.nextInt();
        scnr.close();
        for (int k = 0; k<powTen.length; k++){
            int[] list = new int[powTen[k]];
            beg = Instant.now();
            for (int u = 0; u<times; u ++){
                
                for(int i =0; i<list.length; i++){
                    list[i] = RandGen.nextInt(max - min) + min;
                }
                for(int i = 0; i<list.length; i++){
                    System.out.println(list[i]);
                }
                System.out.println("sorted");
                sort.in(list);
                list = sort.getSorted();
                for(int i = 0; i<list.length; i++){
                    System.out.println(list[i]);
                } 
            }
            end = Instant.now();
            Long timeN5M = ChronoUnit.NANOS.between(beg,end);
            System.out.println((times) + " time: " + timeN5M + " ns.");
        }
    }
    
}
