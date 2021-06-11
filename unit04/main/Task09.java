package by.epam.unit04.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n -
//четное):

public class Task09 {
    public static void main(String[] args) {

        int[][] mas = new int[8][8];

        for (int i = 0, j = mas[i].length - 1; i < mas.length; i++) {
            mas[i][j--] = i + 1;
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%2d]", mas[i][j]);
            }
            System.out.println();
        }
    }
}
