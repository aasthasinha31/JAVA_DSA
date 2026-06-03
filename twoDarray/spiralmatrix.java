package twoDarray;

public class spiralmatrix {
    public static void printspiral(int matrix[][]) {
        int startrow = 0;
        int startcolum = 0;
        int endrow = matrix.length - 1;
        int endcolum = matrix[0].length - 1;

        while (startrow <= endrow && startcolum <= endcolum) {

            for (int j = startcolum; j <= endcolum; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcolum] + " ");
            }

            for (int j = endcolum - 1; j >= startcolum; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            for (int i = endrow - 1; i > startrow; i--) {
                if (startcolum == endcolum) {
                    break;
                }
                System.out.print(matrix[i][startcolum] + " ");
            }

            startrow++;
            startcolum++;
            endrow--;
            endcolum--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printspiral(matrix);
    }
}