package TakeUForward;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {1, 1, 1},
                {1, 1, 0}

        };
        boolean[] zeroRows = new boolean[3];
        boolean[] zeroCols = new boolean[3];

        //step1 :finding zeros
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
