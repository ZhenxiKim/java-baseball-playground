package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jhkim
 * @since 2022-08-28
 */
public class StringCalcTest {

    @DisplayName("문자열 계산기")
    @Test
    void stringCalcTest() {
        StringCalc stringCalc = new StringCalc();
        String example = "2 + 3 * 4 / 2";

        int result = stringCalc.calc(example);
        assertThat(result).isEqualTo(10);
    }

    private class StringCalc {
        public int calc(String example) {
            int sumResult = 0;
            //Scanner scanner = new Scanner(System.in);
            //String example = scanner.nextLine();
            while(example != null) {
                System.out.println("example = " + example);
                String[] values =  example.split(" ");
                sumResult = Integer.parseInt(values[0]);
                for (int i=1; i<values.length; i=i+2) {
                    String numStr = values[i]; //2 + 3 * 4 / 2
                    System.out.println("numStr = " + numStr);
                    System.out.println("values[i+1] = " + values[i+1]);
                    System.out.println("sumResult = " + sumResult);
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

            }
            return sumResult;
        }
    }
}
