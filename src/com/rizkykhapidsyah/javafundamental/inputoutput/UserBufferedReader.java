package com.rizkykhapidsyah.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main(String[] args) {

        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);

        System.out.println("Program Penjumlahan Sangat Sederhana");

        int Value1 = 0;
        int Value2 = 0;

        try {
            System.out.print("Masukkan Angka Pertama: ");
            Value1 = Integer.parseInt(BR.readLine());
            System.out.print("Masukkan Angka Kedua: ");
            Value2 = Integer.parseInt(BR.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int Hasil = Value1 + Value2;
        System.out.println("Hasilnya Adalah: " + Hasil);
    }
}
