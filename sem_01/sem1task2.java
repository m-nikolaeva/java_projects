package sem_01;
import java.time.LocalTime;
import java.util.Scanner;

// public class sem1task2 {
//     public static void main(String[] args) {
//                Scanner iScanner = new Scanner(System.in);
//                System.out.printf("Введите имя: ");
//                String name = iScanner.nextLine();
//                System.out.printf("Привет, %s!\n", name);
//                iScanner.close();
//            }
// }

/*В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */

public class sem1task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        int getTime = LocalTime.now().getHour();
        String msg = "";
        switch (getTime) {
            case 5, 6, 7, 8, 9, 10, 11 -> msg = "Доброе утро";
            case 12, 13, 14, 15, 16, 17 -> msg = "Добрый день";
            case 18, 19, 20, 21, 22 -> msg = "Добрый вечер";
            default -> msg = "Доброй ночи";

        }
        System.out.printf("%s, %s!\n", msg, name);
        iScanner.close();
    }
}
