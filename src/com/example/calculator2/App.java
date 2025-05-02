package com.example.calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorLv2 calc = new CalculatorLv2();
        while (true){

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1=sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2=sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator=sc.next().charAt(0);
            int result=calc.calculate(num1,num2,operator);
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }

        }

        System.out.println("모든결과 출력");
        ArrayList<Integer> history= calc.getHistory();
        System.out.println(history);

        System.out.println("가장먼저 저장된 값 삭제");
        calc.removeResult();
        System.out.println(history);

        }

    }

