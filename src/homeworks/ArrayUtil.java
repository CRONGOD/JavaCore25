package homeworks;

public class ArrayUtil { public static void main(String[] args) {
    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};


    System.out.print("Elements: ");
    for (int num : numbers) {
        System.out.print(num + " ");
    }
    System.out.println();


    System.out.println("First element: " + numbers[0]);


    System.out.println("Last element: " + numbers[numbers.length - 1]);


    System.out.println("Length: " + numbers.length);

    int min = numbers[0];
    for (int num : numbers) {
        if (num < min) min = num;
    }
    System.out.println("Minimum value: " + min);
    if (numbers.length <= 2) {
        System.out.println("Can't print middle values.");
    } else if (numbers.length % 2 == 0) {
        int mid1 = numbers.length / 2 - 1;
        int mid2 = numbers.length / 2;
        System.out.println("Middle elements: " + numbers[mid1] + " and " + numbers[mid2]);
    } else {
        int mid = numbers.length / 2;
        System.out.println("Middle element: " + numbers[mid]);
    }
    int evenCount = 0;
    int oddCount = 0;
    int sum = 0;
    for (int num : numbers) {
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
        sum += num;
    }
    System.out.println("Even count: " + evenCount);


    System.out.println("Odd count: " + oddCount);
    System.out.println("Sum: " + sum);

    double average = (double) sum / numbers.length;
    System.out.println("Average: " + average);
}
}

