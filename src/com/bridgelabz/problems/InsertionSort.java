package com.bridgelabz.problems;

import java.lang.reflect.Array;

public class InsertionSort {
    public static void main(String[] args) {
        String [] array={"Rohit","Neha","Rajveer","Sonali","Raj"};

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        for(int i=1;i<array.length;i++){
            String current=array[i];
            int j=i-1;
            while(j>=0 && current.compareTo(array[j])<0){
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
