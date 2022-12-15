package sem_01;
/*Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, 
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов 
массива должны быть отличны от заданного, а остальные - равны ему. */

public class sem1task4 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 1, 2, 3 };
        int last = array.length - 1;
        int value = 3;
        while (last > 0 && array[last] == value)
            last--;
        for (int i = 0; i < last; i++)
            if (array[i] == value) {
                for (int j = 0; j < last; j++)
                    array[j] = array[j + 1];
                array[last] = value;
                last--;
            }
        for (int element : array)
            System.out.print(String.format("%d ", element));
    }
}
