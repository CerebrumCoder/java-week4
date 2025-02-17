public class App {
    public static void main(String[] args) throws Exception {
        // This
        // double[] myList = new double[10];
        // Is equals to
        double[] myList = new double[4];

        // int[] values = new int[5];
        // for (int i = 1; i < 5; i++) {
        //     values[i] = i + values[i - 1];
        // }
        // values[0] = values[1] + values[4];

        // System.out.println(values[0]);

        // for (int i = 0; i < myList.length; i++) {
        //     myList[i] = Math.random() * 100;
        // }

        // for (int i = 0; i < myList.length; i++) {
        //     System.out.print(myList[i] + " ");
        // }

        // double max = myList[0];
        // for (int i = 1; i < myList.length; i++) {
        //     if (myList[i] > max)
        //         max = myList[i];
        // }

        for (int i = myList.length - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));

            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

    }
}
