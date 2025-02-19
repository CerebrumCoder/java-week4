import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] sourceArray = { 2, 3, 1, 5, 10 };
        int[] targetArray = new int[sourceArray.length]; // Lengthnya 5

        for (int i = 0; i < sourceArray.length; i++)
            targetArray[i] = sourceArray[i];
        
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));


        // int[] list = {3, 1, 2, 6, 4, 2};
        printArray(new int[]{3, 1, 2, 6, 4, 2});
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }        
    }
    
}
