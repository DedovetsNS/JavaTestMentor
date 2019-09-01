

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            Scanner convert = new Scanner(input);
            String numberA = convert.next();
            String oper = convert.next();
            String numberB = convert.next();
            int numberAInt=0;
            int numberBInt=0;

        try{
            Exception ex = new Exception("Оба числа должны быть рабаскими или римскими");
          if (Calculator.romanOrArabic(numberA)&&Calculator.romanOrArabic(numberB)){
              numberAInt = Integer.parseInt(numberA);
              numberBInt = Integer.parseInt(numberB);
          }
          else if (!Calculator.romanOrArabic(numberA)&&!Calculator.romanOrArabic(numberB)) {
              numberAInt = Calculator.converRomanToInt(numberA);
              numberBInt = Calculator.converRomanToInt(numberB);
          }
          else throw ex; }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        int result=0;
        if (oper.equals("+")) result= numberAInt+numberBInt;
        if (oper.equals("-")) result= numberAInt-numberBInt;
        if (oper.equals("*")) result= numberAInt*numberBInt;
        if (oper.equals("/")) result= numberAInt/numberBInt;

        if (Calculator.romanOrArabic(numberA)&&Calculator.romanOrArabic(numberB)){
            System.out.println(result);
        }
        else System.out.println(Calculator.RomanNumerals(result));
        }
    }


