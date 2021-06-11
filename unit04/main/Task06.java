package by.epam.unit04.main;

//Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива.

import java.util.Random;

public class Task06 {

    public static void main(String[] args) {

        int[][] mas = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(10);
            }
        }

        int num = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%2d]", mas[i][j]);
                if (mas[i][j] == 7) {
                    num++;
                }
            }
            System.out.println();
        }
        System.out.println("Число 7 среди элементов массива встречается " + num + " раз");
    }
}



