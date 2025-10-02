package homeworks.homework2;

class DynamicArrayDemo {
public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray();

    // Ավելացնում ենք արժեքներ
    for (int i = 0; i < 15; i++) {
        dynamicArray.add(i * 10);
    }

    // Տպում ենք արժեքը ըստ ինդեքսի
    System.out.println("Index 5 -> " + dynamicArray.getByIndex(5));

    // Տպում ենք ամբողջ array-ը
    System.out.print("All elements: ");
    dynamicArray.printAll();

}
}

