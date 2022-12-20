import java.util.LinkedHashMap;
import java.util.Map;

/* Написать метод, который переведёт данное целое число в римский формат.
http://graecolatini.bsu.by/htm-different/num-converter-roman.htm
Принципы римской с/с */

// public class sem5task3 {
//     public static void main(String[] args) {
//         int number = 535;
//         LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
//         hashMap.put(1000,"M");
//         hashMap.put(900,"CM");
//         hashMap.put(500,"D");
//         hashMap.put(400,"CD");
//         hashMap.put(100,"C");
//         hashMap.put(90,"XC");
//         hashMap.put(50,"L");
//         hashMap.put(40,"XL");
//         hashMap.put(10,"X");
//         hashMap.put(9,"IX");
//         hashMap.put(5,"V");
//         hashMap.put(4,"IV");
//         hashMap.put(1,"I");
//         while(number != 0) {
//                 for(int i : hashMap.keySet()) {
//                     while(i <= number) { //1000 <= 954
//                         number -= i;
//                         System.out.print(hashMap.get(i));
//                     }
//                 }
//         }
//     }
// }

public class sem5task3 {
    public static Map<Integer, String> InitMap() {
        Map<Integer, String> ArabToRoman = new LinkedHashMap<Integer, String>();        
        ArabToRoman.put(1000, "M");        
        ArabToRoman.put(900, "CM");        
        ArabToRoman.put(500, "D");        
        ArabToRoman.put(400, "CD");
        ArabToRoman.put(100, "C");        
        ArabToRoman.put(90, "XC");        
        ArabToRoman.put(50, "L");
        ArabToRoman.put(40, "XL");        
        ArabToRoman.put(10, "X");
        ArabToRoman.put(9, "IX");
        ArabToRoman.put(5, "V");
        ArabToRoman.put(4, "IV");
        ArabToRoman.put(1, "I");
        return ArabToRoman;
    }

    public static String ArabToRoman(int number) {
        Map<Integer, String> ArabMap = InitMap();
        String result = "";
        for (Map.Entry<Integer, String> elemEntry : ArabMap.entrySet()) {
            if (number >= elemEntry.getKey()) {
                int tmp = number / elemEntry.getKey();
                result += elemEntry.getValue().repeat(tmp);
                number -= tmp * elemEntry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(ArabToRoman(2022));
        System.out.println(ArabToRoman(44));
        System.out.println(ArabToRoman(96));
        System.out.println(ArabToRoman(4597));
    }
}