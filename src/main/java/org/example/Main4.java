package org.example;

public class Main4 {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        // reverse array
        int j  = array.length - 1;
        for(int i =0;i< array.length / 2 ; i ++){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j --;
        }

        for (int item: array) {
            System.out.print(item + "\t");
        }
    }
}
