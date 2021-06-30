package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
        Scanner x = new Scanner(System.in);
        System.out.println("Выберите размерность массива: ");
        int size = x.nextInt();
        int array[] = new int[size];
        System.out.println("Вставьте элементы:");
        for (int i = 0; i < size; i++) {
            array[i] = x.nextInt();
        }
        System.out.print("Элементы массива, кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print("   "+array[i]+",");
            } x.close();
        }
    }
}


