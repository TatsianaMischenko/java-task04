package by.epam.unit04.main;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Random;

public class Task08 {

    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(10);
                System.out.printf("[%2d]", mas[i][j]);
            }
            System.out.println();
        }

        System.out.println("==================");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == 2 | j == 2) {
                    System.out.printf("[%1d]", mas[i][j]);
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}
