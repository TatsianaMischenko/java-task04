package by.epam.unit04.main;

//Сформировать квадратную матрицу порядка n по заданному образцу(n -
//четное):

public class Task10 {
    public static void main(String[] args) {

        int n = 5;
        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if ((i == 0 || i == n - 1)
                        || (j == 0 || j == n - 1)) {
                    mas[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%2d]", mas[i][j]);
            }
            System.out.println();
        }
    }
}
