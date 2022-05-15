package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[50];
        for (int n = 1, i = 0; n <= 99; n = n + 2, i++) {
            array[i] = n;
        }
        for (int n = 0; n < array.length; n++)
            System.out.println(array[n]+ " ");

    }
}

