package com.company;

public class ZaV5 {
    public static void main(String[] args) {
        int array[] = new int[15];
        int mid = 0;
        for (int n = 0; n < 15 ; n++) {
            array[n] = (int) Math.round(Math.random() * 10);
            System.out.print(array[n] + " ");}
        System.out.println();
        for (int n = 0; n <array.length ; n++)
            if (array[n] % 2 == 0)
                mid++;
        System.out.print("Парних елементів в масиві: " + mid);
    }
    }

