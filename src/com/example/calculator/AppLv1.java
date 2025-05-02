package com.example.calculator;

import java.util.Scanner;

public class AppLv1 {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1=sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2=sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator=sc.next().charAt(0);
            int result=0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다");
                        System.exit(0);
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 연산자 입력입니다");
                    System.exit(0);
                    break;

            }
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();

            if (answer.equals("exit")) {
                break;
            }






        }

    }
}