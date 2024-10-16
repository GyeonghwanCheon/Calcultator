package Lv_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int result = 0;

        // 계산 반복
        while (!flag) {

            System.out.println("첫 번째 숫자를 입력하시오 : ");
            int Num_1 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하시오 : ");
            char operator =sc.next().charAt(0);
            System.out.println("두 번째 숫자를 입력하시오 : ");
            int Num_2 = sc.nextInt();

            // 사칙연산에 따른 result 값 선택
            switch (operator) {
                case '+' :
                    result = Num_1 + Num_2;
                    break;
                case '-' :
                    result = Num_1 - Num_2;
                    break;
                case '*' :
                    result = Num_1 * Num_2;
                    break;
                case '/' :
                    result = Num_1 / Num_2;
                    break;
            }

            System.out.println("result = " + result);
            System.out.println("더 계산하시겠습니까? (계속 아무거나 입력, exit 입력 시 종료)");
            String answer = sc.next();

            // exit 선택 시 반복문 종료.
            if(answer.equals("exit")) {
                // boolean을 이용해 사칙연산 무한루프에서 탈출.
                flag = true;
            } else {
                flag = false;
            }
        }

    }
}
