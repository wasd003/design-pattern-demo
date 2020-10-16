package strategy;


import java.util.Scanner;

public class Context {
    private IAlgorithm algo;

    public static void main(String[] args) {
        new Context().entry();
    }
    public void entry(){
        Scanner in = new Scanner(System.in);
        int x = 0;
        while((x = in.nextInt()) != 0){
            setAlgo(x);
            doIt();
        }
    }
    public void doIt(){
        algo.speakAlgorithm();
    }
    public void setAlgo(int x){
        if(x == 1){
            algo = new QuickSort();
        } else if (x == 2) {
            algo = new MergeSort();
        } else if(x == 3){
            algo = new HeapSort();
        }
    }
}
