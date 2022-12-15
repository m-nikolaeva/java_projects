import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран. */

public class sem3task1 {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = size; i > 0; i--) {
            arr.add(new Random().nextInt(100));
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
