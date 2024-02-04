import java.util.Random;
import java.util.Scanner; //Import the Scanner class
import java.io.File; // Import File class
import java.io.FileWriter;
import java.io.IOException;

public class MatrixMultiplier {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in); // Create a scanner object
        System.out.println("Enter the number of columns and rows you would like both matrices to have");
        System.out.println("Two matrices will generate with this amount of rows and colums");
        System.out.println("and will be multiplied");

        String matrixNumbers = userInput.nextLine(); // Read user input
        userInput.close();
        int matrixSize = Integer.parseInt(matrixNumbers);

        int[][] generatedMatrix1 = generateRandomMatrix(matrixSize, matrixSize);
        int[][] generatedMatrix2 = generateRandomMatrix(matrixSize, matrixSize);
        int[][] finalMatrix = multiplyMatrix(matrixSize, matrixSize, generatedMatrix1, matrixSize, matrixSize, generatedMatrix2);

        writeMatrixtoFile(generatedMatrix1, matrixSize, matrixSize, "matrix1.txt");
        writeMatrixtoFile(generatedMatrix2, matrixSize, matrixSize, "matrix2.txt");
        writeMatrixtoFile(finalMatrix, matrixSize, matrixSize, "matrix3.txt");

    }
        static int[][] multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][])
        {
            // Check if multiplication is possible for both matrices
            if (row2 != col1){
                System.out.println("\nMultiplication Not Possible");
                return new int[row1][col2];
            }

            //Initialize new matrix
            //New matrix will be size of row1 x col2
            int C[][] = new int[row1][col2];

            // Multiply the two matrices
            for (int i = 0; i < row1; i++) { 
                for (int j = 0; j < col2; j++) { 
                    for (int k = 0; k < row2; k++) 
                        C[i][j] += A[i][k] * B[k][j];
                } 
            }
            return C;
        }
    
        //Function to provide a random matrix
        static void printRandomMatrix(int matrix[][], int rowSize, int colSize)
        {
            for (int i = 0; i < rowSize; i++)
            {
                for (int j = 0; j < colSize; j++)
                    System.out.print(matrix[i][j] + " ");
                System.out.println();
            }
        }

        static void writeMatrixtoFile(int matrix[][], int rowSize, int colSize, String fileName)
        {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < rowSize; i++)
            {
                for (int j = 0; j < colSize; j++)
                    //System.out.print(matrix[i][j] + " ");
                    builder.append(matrix[i][j] + " ");
                //System.out.println();
                builder.append("\n");
            }

            try
            {
                FileWriter matrixFile1 = new FileWriter(fileName, false);
                matrixFile1.write(builder.toString());
                matrixFile1.close();
                System.out.println("Successfully wrote to the file.");
            }
            catch (IOException e) {
                System.out.print("An error occured");
                e.printStackTrace();
            }
        }


    static int[][] generateRandomMatrix(int rowSize, int colSize){
        int[][] matrix = new int[rowSize][colSize];
        Random random = new Random();

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                // Generate random number within desired range
                matrix[i][j] = random.nextInt(5); //MAKE THIS A USER INPUT INTEGER
        }

        return matrix;
    }
}