import java.util.Arrays;

public class PassingParameters {
    public static void main(String[] args) {
        // String[] strings = {
        // "New York", "Boston", "Atlanta"
        // };
        // B.main(strings);

        int[][] matrix = new int[10][10];
        matrix[0][0] = 3;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int) (Math.random() * 1000);

        System.out.println(Arrays.toString(matrix));
    }

}

class B {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}