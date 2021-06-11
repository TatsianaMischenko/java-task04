package by.epam.unit04.main;

//Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
//        Если таких чисел нет, то вывести сообщение об этом факте.

public class Task01 {

    public static void main(String[] args) {

        int[] mas = new int[50];

        for (int i = 0; i < mas.length; i = i + 2) {
            mas[i] = i + 2;

            System.out.printf("[%3d] ", mas[i]);

            if (mas[i] % 2 != 0) {

                System.out.println("четных чисел нет");
            }
        }
    }
}