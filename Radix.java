package RadixSort;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class Radix {
    Queue<Integer> mainbin = new LinkedList<>();
    List<Queue<Integer>> ArrQueue = new ArrayList<Queue<Integer>>(10);
    int radixNumLen;
    //Constructors
    public Radix(int[] unsorted){
        this.in(unsorted);  
    }
    public Radix(){}
    //Private Methods - 
    //buildQueue() queueToMain() addToQueue(tmp,place) getTensPlace(tmp,place) sort()
    private int pop(){
        int tmp = this.mainbin.element();
        this.mainbin.remove();
        return tmp;
    }
    private void buildQueue(){
        this.ArrQueue.clear();
        for (int index =0; index<=9; index++){
            this.ArrQueue.add(new LinkedList<Integer>());
        }
    }
    private void queueToMain(){
        for (int u = 0; u<=9; ++u){
            while (this.ArrQueue.get(u).size() > 0){
                this.mainbin.add(this.ArrQueue.get(u).element());
                this.ArrQueue.get(u).remove();
            }}
    }
    private void addToQueue(int tmp,int place){
        int tmpMod = getTensPlace(tmp,place);
        for (int u = 0; u<=9; u++){
            if (tmpMod == u){
                this.ArrQueue.get(u).add(tmp);
                break;
            }
        } 
    }
    private int getTensPlace(int tmp , int place){
        int[] powTen ={1,10,100};
        int tmpmod;
            if (powTen[place]==1){
                tmpmod = tmp % 10;
            }else{
                tmpmod = tmp/powTen[place] % powTen[place]; 
            }
        return tmpmod;
    }
    private void sort(){
        int tmp,length;
        for (int j = 0; j<radixNumLen; j ++){
            length = this.mainbin.size();
            for (int i = 0; i<length; i++){
                tmp = this.pop();
                this.addToQueue(tmp,j);
            }
            this.queueToMain();
        }
    }
    //Public Methods
    // in(unsorted list) getSorted()
    public void in(int[] unsorted){
        this.buildQueue();
        this.radixNumLen = String.valueOf(unsorted[0]).length();
        for (Integer i : unsorted) {
            this.mainbin.add(i);
        }
    }
    public int[] getSorted(){
        this.sort();
        int quequeSize = mainbin.size();
        int[] tmp = new int[quequeSize];
        int temp;
        for (int i = 0; i< quequeSize; i++){
            temp = pop();
            tmp[i] = temp;
        }
        return tmp;
    }
    
}
