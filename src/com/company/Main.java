package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        while (loop == true) {
            System.out.println("Menu Hari Ini");
            System.out.println("1 Penjumlahan Bilangan Prima");
            System.out.println("2 Jumlah Bilangan Prima");
            System.out.println("3 Exit");
            System.out.println("Masukan Pilihan Anda");
            int menu = in.nextInt();
            if (menu > 0 && menu < 3) {
                int a, b = 0;
                System.out.println("Masukan Bilangan 1");
                a = in.nextInt();
                System.out.println("Masukan Bilangan 2");
                b = in.nextInt();
                if (a >= 0 && b >= 0) {
                    System.out.println("Bilangan Prima Antara" + a + " dan " + b + " adalah");
                    switch (menu) {
                        case 1:
                            sum(a, b);
                            break;
                        case 2:
                            count(a, b);
                            break;

                    }
                } else System.out.println("Bilangan harus positif");
            } else if (menu == 3) {
                loop = false;
                System.exit( 0);
                }
            }
            System.out.println();
        }



    static void sum(int a, int b) {
        int sum = 0;
        while (a <= b) {
            int bil = a;
            int bagi = 0;
            while (bil > 1) {
                if (a % bil == 0) {
                    bagi += 1;
                }
                bil--;
            }
            if (bagi == 1) {
                sum += a;
                System.out.print(a + "\t");

            }
            a++;
        }
        System.out.println("\n Penjumlahan Bilangan Prima = " + sum);
    }

    static void count( int a, int b) {
        int sum = 0;
        while (a <= b) {
            int bil = a;
            int bagi = 0;
            while (bil > 1) {
                if (a % bil == 0) {
                    bagi += 1;
                }
                bil--;
            }
            if (bagi == 1) {
                sum += 1;
                System.out.println(a + "\t");
            }
            a++;
        }
        System.out.println("\n Penjumlahan Bilangan Prima = " + sum);

        }
    }






