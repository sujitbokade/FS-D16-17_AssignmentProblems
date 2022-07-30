package com.bridgelabz.problems;

public class InsertionSort {
    public static void main(String[] args) {
        int []array={8,6,9,5,12,15};

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        for(int i=1;i<array.length;i++){
            int current=array[i];
            int j=i-1;
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        System.out.println();
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
