
import java.util.LinkedHashMap;
import java.util.Map;

public class Calculator {
    String numberA;
    String numberB;
    String oper;

    public static int converRomanToInt(String roman){  //метод перевода String римского числа в Int арабское
        int index=0;
        String[] romanNumbers={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (int i = 0;i<romanNumbers.length;i++){
            if(romanNumbers[i].equals(roman)) index = i;
        }
        int[] arabNumbers={1,2,3,4,5,6,7,8,9,10};
        return  arabNumbers[index];
    }

    public static boolean romanOrArabic(String chek){   //метод определения содержится в String римское число или арабское,
        int index=0;                                    //возвращает true, если арабское, здесь же проверка на диапазон [0-10]
        String[] romanNumbers={"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] arabNumbers={"1","2","3","4","5","6","7","8","9","10"};
        try{
            Exception ex = new Exception("Необходимо ввести арабские или римские числа от 0 до 10");
            for (int i = 0;i<romanNumbers.length;i++){
                if(romanNumbers[i].equalsIgnoreCase(chek)) index += 1;
                else if (arabNumbers[i].equals(chek))  index += 2;
            }
        if (index == 2) return  true;
        else if(index == 1) return false;
        else throw ex;}
        catch (Exception ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        return false;
    }

    public static String RomanNumerals(int Int) {   //как работает этот метод пока не до конца понимаю, т.к. эту тему еще не изучал,
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();   //просто нашел и применил
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }
    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
