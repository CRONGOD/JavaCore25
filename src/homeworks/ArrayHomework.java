package homeworks;

import java.util.HashSet;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 3, 4, 5, 6, 6, 7, 8};
        int n = 6;
        int count = 0;
        for (int num : numbers) {
            if (num == n) {
                count++;
            }
        }
        System.out.println("Փոխանցված թիվը (" + n + ") հանդիպում է " + count + " անգամ։");
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 6, 1};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Կրկնվող թվերը. " + duplicates);
        System.out.println("Կրկնվող թվերի քանակը՝ " + duplicates.size());
    }
    char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};  // Հայերեն սիմվոլների մասիվ
    String vowels = "աևեուոայ";
    int count = 0;
    {
        if (vowels.indexOf(count)>= 0) {
            count++;
        }
    }
}

