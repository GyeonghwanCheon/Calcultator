package Lv_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculrator calculator = new Calculrator();
        boolean flag = false;

        Scanner sc = new Scanner(System.in);

        while (!flag) {

            System.out.println("첫 번째 숫자를 입력하시오 : ");
            int Num_1 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하시오 : ");
            char operator =sc.next().charAt(0);
            System.out.println("두 번째 숫자를 입력하시오 : ");
            int Num_2 = sc.nextInt();

            System.out.println("result = " + calculator.calculate(operator,Num_1,Num_2));
            System.out.println(calculator.getResultList().toString());

            System.out.println("더 계산하시겠습니까? (계속 아무거나 입력, exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String answer = sc.next();

            if(answer.equals("exit")) {
                flag = true;

            } else if(answer.equals("remove")) {
                calculator.removeResult();
                System.out.println(calculator.getResultList().toString());
            }
            else {
                flag = false;
            }
        }
    }
}
