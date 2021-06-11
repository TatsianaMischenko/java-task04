package by.epam.unit04.main;

//Реализовать алгоритм сортировки вставками.

public class Task05 {
    public static void main(String[] args) {
        int[] mas = {8, 90, 3, -4, 0, 54, 1, 2, 6, -8};
        for (int i = 0; i < mas.length; i++) {

        }
        for (int i = 1; i < mas.length; i++) {
            int destinationSize = mas[i];
            int j = i;
            while (j > 0 && mas[j - 1] > destinationSize) {
                mas[j] = mas[j - 1];
                --j;
            }
            mas[j] = destinationSize;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas[" + i + "] = " + mas[i]);
        }
    }
}
