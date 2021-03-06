package edu.ifrs.vvs;

public class App {


    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args){
        System.out.println("aqui");

        //int arr[] = { 12, 11, 13, 5, 6, 7 };
        //int n = arr.length;

        HeapSort ob = new HeapSort();
        int[] values = ob.read();
        ob.sort(values);
        System.out.println("Sorted array is");
        printArray(values);
    }
}
