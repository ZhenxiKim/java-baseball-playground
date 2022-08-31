package study;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jhkim
 * @since 2022-08-30
 */
public class NumberBaseballGame {

    public static void main(String[] args) {
        NumberBaseballGame gam = new NumberBaseballGame();
        gam.startGame();
    }

    public void startGame() {
        System.out.println(checkNumBaseBall(createNums(), inputHumanNum()));
    }

    //컴퓨터가 랜덤 세자리 숫자를 만든다.
    public int [] createNums () {
     int [] comNumArr = new int[3];
     int [] humanNumArr = new int[3];
     int checkNum = 0;
        while(checkNum < 3 ) {
            Random random = new Random();
            int value = random.nextInt(1 + 9) + 1;
                if(!Arrays.asList(comNumArr).contains(value)) {
                    comNumArr[checkNum] = value;
                    checkNum ++;
                }
        }
        return comNumArr;
    }

    //사람이 세자리 수를 입력한다.
    public String[] inputHumanNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요 :");
        return scanner.nextLine().split("");
    }


    //세자리 수를 순회하면서 비교한다.
    private String checkNumBaseBall(int[] comNumArr, String[] humanNumArr) {
        int ball = 0;
        int strike = 0;

        for(int i=0; i<comNumArr.length; i++) {
            int comNum = comNumArr[i];
            for (int j=0; j< humanNumArr.length; j++) {
                int humanNum = Integer.parseInt(humanNumArr[j]);
                if(comNum == humanNum) {
                    if(i == j) {
                        strike ++;
                    }
                    ball ++;
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        if(strike > 0) {
            sb.append(strike + "스트라이크");
        }
        if(ball > 0) {
            sb.append(ball + "볼");
        }
        String result = sb.toString();


        if(strike == 3) {
            result = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                    "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
        }
        return result;
    }
}
