package Lesson_03;
import java.util.Arrays;
import java.util.List;
public class Ex005_ArraysMethod {
   public static void main(String[] args) {
       StringBuilder day = new StringBuilder("28");
       StringBuilder month = new StringBuilder("9");
       StringBuilder year = new StringBuilder("1990");
       StringBuilder[] date = { day, month, year };
       List<StringBuilder> d = Arrays.asList(date);
       System.out.println(d); // [29, 9, 1990]
        
        
   }
}
