package org.example;

public class Main6 {
    public static void main(String[] args) {
        int array [] ={1,23,4,5,1,2,3,5,7,8,9,945,2,2,1,2,3,4,5,6,7,8,0};
        printAllPrime(array, array.length);
    }

    public static boolean isPrime(int n)
    {
        if(n <2 ) return false;
        if(n == 2) return true;
        for(int i = 2; i < n; i++)
            if(n%i==0) return false;
        return true;
    }
    public static void printAllPrime(int array[], int n)
    {
        for (int item: array)
        {
            if(isPrime(item)){
                System.out.print(item + "\t");
            }
        }
    }
}
