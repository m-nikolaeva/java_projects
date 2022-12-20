import java.util.Scanner;

/* Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. 
То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
обработает возвращенное значение и покажет читаемый результат пользователю. 
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”. */

public class sem1excep1 {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 5, 69, 66 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your index: ");
        int number = sc.nextInt();

        try {
            System.out.println("Your number = " + check(arr, number));
        } catch (Exception e) {
            switch (Integer.parseInt(e.getMessage())) {
                case -1 -> System.out.println("Array is too small!");
                case -2 -> System.out.println("Element with your index do not exist!");
                case -3 -> System.out.println("Empty array!");
                case -69 -> System.out.println("Array do not include important number!");
            }
        }
        sc.close();
    }

    public static int check(int[] arr, int index) throws Exception {
        if (arr.length < index) {
            throw new Exception("-2");
        }
        if (arr.length == 0) {
            throw new Exception("-3");
        }
        if (arr[3] != 69) {
            throw new Exception("-69");
        }
        if (arr.length < 5) {
            throw new Exception("-1");
        }
        return arr[index];
    }
}