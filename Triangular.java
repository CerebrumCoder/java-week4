import java.util.Arrays;

public class Triangular {
    public static int[][] lowerTriangular(int size) {
        
        int[][] result;

        // Untuk matriks, harus bikin new
        // Error karena belum ada ukuran dimensi
        // result = new int[size][size]; -> kalo begini, otomatis membuat
        // kotak bukan segitiga

        // Membuat segitiga matriks. Isinya angka nol
        result = new int[size][];

        for (int i = 0; i < size; i++) {
            result[i] = new int[i+1];
        }



        return result;
    }

    public static int[][] sequenceInMatrix(int[][] matrix) {
        int count = 1;
        // i untuk baris
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Matriks baris ke i dan kolom ke-j
                matrix[i][j] = count++;

                // matrix[i][j] = ++count; -> Kalo seperti ini, maka deklarasi int count harus = 0;
            }
        }

        return matrix;
    }
}
