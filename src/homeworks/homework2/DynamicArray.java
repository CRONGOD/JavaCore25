package homeworks.homework2;

public class DynamicArray {
    private int[] array = new int[10];

    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        int[] array;
        int size;
    }
    public char deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Չկա նման ինդեքսով էլեմենտ");
            return 0;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return 0;
    }
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Չկա նման ինդեքսով էլեմենտ");
            return;
        }

        array[index] = value;
    }
    public void add(int index, int value) {
        if (index < 0 || index > size || size >= array.length) {
            System.out.println("Չկա նման ինդեքսով էլեմենտ կամ մասիվը լիքն է");
            return;
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }
    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return true;
    }
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}