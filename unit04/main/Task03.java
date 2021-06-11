package by.epam.unit04.main;
//Дан массив действительных чисел,
// размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.


import java.util.Random;

public class Task03 {

    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];
        Random random = new Random(20);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
            System.out.println("mas[" + i + "] = " + mas[i]);
        }
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                positive++;
            }
            if (mas[i] < 0) {
                negative++;
            }
            if (mas[i] == 0) {
                zero++;
            }
        }
        System.out.println("Положительных элементов = " + positive);
        System.out.println("Отрицательных элементов = " + negative);
        System.out.println("Нулевых элементов = " + zero);
    }
}
