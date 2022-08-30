package study;

import java.util.Scanner;

/**
 * @author jhkim
 * @since 2022-08-30
 */
public class StringCalc {
    public int calc() {
        int sumResult = 0;
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String[] values =  example.split(" ");
        sumResult = Integer.parseInt(values[0]);
        for (int i=1; i<values.length; i=i+2) {
            String numStr = values[i]; //2 + 3 * 4 / 2
            switch (numStr) {
                case "+":
                    sumResult += Integer.parseInt(values[i+1]);
                    break;
                case "-":
                    sumResult -= Integer.parseInt(values[i+1]);
                    break;
                case "/":
                    sumResult /= Integer.parseInt(values[i+1]);
                    break;
                case "*":
                    sumResult *= Integer.parseInt(values[i+1]);
                    break;
            }
        }
        return sumResult;
    }

}
