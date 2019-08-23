package com.rizkykhapidsyah.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args) {
        Scanner Penyecan = new Scanner(System.in);
        System.out.println("Program Penjumlahan Sangat Sederhana\n");

        System.out.print("Masukkan Angka Pertama : ");
        int Value1 = Penyecan.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int Value2 = Penyecan.nextInt();

        int Hasil = Value1 + Value2;

        System.out.println("Hasilnya Adalah : " + Hasil);
    }
}
