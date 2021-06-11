package by.epam.unit04.main;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на
//диагонали.

import java.util.Random;

public class Task07 {

    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(10);

                System.out.printf("[%2d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ===============");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    System.out.printf("[%2d]", mas[i][j]);
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }
}
