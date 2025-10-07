package homeworks.homework2;

class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 0; i < 15; i++) {
            dynamicArray.add(i * 10);
        }

        System.out.println(dynamicArray.deleteByIndex(5));


        System.out.print("All elements: ");
        dynamicArray.printAll();{

            DynamicArray da = new DynamicArray();

            da.add(0, 10);
            da.add(1, 20);
            da.add(1, 15);
            da.print();

            da.set(1, 99);
            da.print();

            da.deleteByIndex(0);
            da.print();

            System.out.println("Index of 20: " + da.getIndexByValue(20));
            System.out.println("Exists 50: " + da.exists(50));
        }
    }
}


