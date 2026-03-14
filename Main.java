public class Main {
    public static void main(String[] args) {

        int maxNumber = 4;
        int matrixSize = 2 * maxNumber - 1;

        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {

                int distance = row;

                if (col < distance) {
                    distance = col;
                }

                if ((matrixSize - 1 - row) < distance) {
                    distance = matrixSize - 1 - row;
                }

                if ((matrixSize - 1 - col) < distance) {
                    distance = matrixSize - 1 - col;
                }

                System.out.print((maxNumber - distance) + " ");
            }

            System.out.println();
        }
    }
}
