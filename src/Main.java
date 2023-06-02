import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> numbers = new ArrayList<>(List.of(2, 3, 5, 9, 56, 155, 1, 8, 32, 66));

        sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        for (int idxCurr = numbers.size() - 1; idxCurr >= 0; idxCurr--) {
            int max = Integer.MIN_VALUE;
            int idxMax = 0;
            for (int i = 0; i <= idxCurr; i++) {
                final Integer element = numbers.get(i);
                if (max < element) {
                    max = element;
                    idxMax = i;
                }
            }
            int tmp = numbers.get(idxCurr);
            numbers.set(idxCurr, max);
            numbers.set(idxMax, tmp);
        }
    }

}