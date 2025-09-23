package homeworks;

public class Sort {

    public static void sortArray(int[] array) {
        java.util.Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2,};

        sortArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}

