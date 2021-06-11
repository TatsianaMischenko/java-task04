package by.epam.unit04.main;

//Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        double[] mas = new double[10];

        Random random = new Random(10);

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextDouble();


        }
        double max;
        double min;

        max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        System.out.println("Максимальное значение в массиве = " + max);

        min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];

            }
        }
        System.out.println("Минимальное значение в массиве = " + min);
        System.out.println("Наименьшая длина числовой оси " + (max - min));
    }
}