package com.company;

public class ZaV3 {
        public static void main(String[] args) {
                int array1[] = new int[5];
                int array2[] = new int[5];
                int array3[] = new int[5];
                double mid1 = 0, mid2 = 0, mid3=0;
                for (int n = 0; n < 5; n++) {
                        array1[n] = (int) Math.round(Math.random() * 5);
                        mid1 = mid1 + array1[n];
                        System.out.print(array1[n] + " ");
                }
                System.out.println();
                for (int n = 0; n < 5; n++) {
                        array2[n] = (int) Math.round(Math.random() * 5);
                        mid2 = mid2 + array2[n];
                        System.out.print(array2[n] + " ");

                }
                System.out.println();
                for (int n = 0; n < 5; n++) {
                        array1[n] = (int) Math.round(Math.random() * 5);
                        mid3 = mid3 + array1[n];
                        System.out.print(array1[n] + " ");}

                System.out.println();
                System.out.println(mid1 = mid1 / 5);
                System.out.println(mid2 = mid2 / 5);
                System.out.println(mid3 = mid2 / 5);
                if (mid1 > mid2 && mid1> mid3)
                        System.out.println("перше число найбільше");
                else if (mid1 < mid2 && mid2> mid3)
                        System.out.println("друге число найбільше ");
                else if (mid3 > mid1 && mid3> mid2)
                        System.out.println("третє найбільше найбільше");
                else
                        System.out.println("Вони рівні");
        }
}
