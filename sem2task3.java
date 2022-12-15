

import java.util.Scanner;

/* Напишите метод, который принимает на вход строку (String) 
и определяет является ли строка палиндромом (возвращает boolean значение). */

public class sem2task3 {
    public static boolean palindrome(String s) {
        for (int i = 0; i <s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inpuString = iScanner.next();
        System.out.print("Результат: ");
        System.out.println(palindrome(inpuString));
        iScanner.close();
    }
}
