import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int x = 1; // x represents an int value
        int[] y = new int[10]; // y represents an array of int values

        m(x, y); // Invoke m with arguments x and y
        System.out.println("x is " + x);
        System.out.println("y[0] is " + y[0]);

        int[] list1 = { 1, 2, 3, 4, 5, 6 };
        int[] list2 = reverse(list1);
        System.out.println(Arrays.toString(list2));

        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);

        int j = linearSearch(list, 3);
        int k = linearSearch(list, -3);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

    public static void m(int number, int[] numbers) {
        number = 1001; // Assign a new value to number
        numbers[0] = 5555; // Assign a new value to numbers[0]
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }            
        }
        return -1;
    }

}
