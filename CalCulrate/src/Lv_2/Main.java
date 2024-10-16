package Lv_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculrator calculator = new Calculrator();
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        // 반복문을 이용해 종료할 때 까지 계속 계산기 사용
        while (!flag) {

            System.out.println("첫 번째 숫자를 입력하시오 : ");
            int Num_1 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하시오 : ");
            char operator =sc.next().charAt(0);
            System.out.println("두 번째 숫자를 입력하시오 : ");
            int Num_2 = sc.nextInt();

            // Calculrator에서 계산하여 result 가져오기
            System.out.println("result = " + calculator.calculate(operator,Num_1,Num_2));
            // 접근제어자 사용하여 캡슐화를 진행하여 getter로 데이터 조회하기
            System.out.println(calculator.getResultList().toString());

            System.out.println("더 계산하시겠습니까? (계속 아무거나 입력, exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String answer = sc.next();

            // exit 입력 시 계산기 종료
            if(answer.equals("exit")) {
                flag = true;

            } else if(answer.equals("remove")) {
                // remove 입력 시 첫번 째 데이터 삭제.
                calculator.removeResult();
                // 삭제 후 데이터 조회해서 삭제가 잘 되었는지 확인하기
                System.out.println(calculator.getResultList().toString());
            }
            else {
                flag = false;
            }
        }
    }
}
