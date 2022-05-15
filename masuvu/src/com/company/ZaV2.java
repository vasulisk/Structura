package com.company;

public class ZaV2 {


    public static void main(String[] args) {
        int[] Mas = new int[20];
        for (int n = 0; n < Mas.length; n++) {
            Mas[n] = (int) (Math.random() * 10);
            System.out.print(Mas[n] + " ");

        }
        System.out.println();

        for (int n = 0; n < Mas.length; n++) {
            if (Mas[n] % 2 != 0)
                Mas[n] = 0;
            System.out.print(Mas[n] + " ");

        }
    }
}
