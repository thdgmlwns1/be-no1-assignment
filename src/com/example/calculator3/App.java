package com.example.calculator3;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculatorLv3<Double> calc = new ArithmeticCalculatorLv3<>(Double.class);
        while (true){

            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1=sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2=sc.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operatorchar=sc.next().charAt(0);
            /// /////////////////////////////////////////////
            Type operator = Type.match(operatorchar);
            Double result=calc.calculate(num1,num2,operator);
            /// ///////////////////////////////////////////////
//            System.out.println("결과: " + result); 부동 소수점 오류 남
            System.out.printf("결과: %.5f\n", result); // 소수점 5자리까만 표현
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }

        }



        System.out.print("기준값을 입력하세요: ");
        double threshold = sc.nextDouble();

        System.out.println("전체 연산 기록:");
        calc.getHistory().forEach(v -> System.out.printf("%.5f\n", v));

        List<Double> history = calc.getResultsGreaterThan(threshold);

        System.out.println("해당 값보다 큰 결과들:");
        history.forEach(v -> System.out.printf("%.5f\n", v));





        //부동 소수점 오류남
//        System.out.println("전체 연산 기록:");
//        calc.getHistory().forEach(System.out::println);
//
//        List<Double> history = calc.getResultsGreaterThan(threshold);
//
//        System.out.println("해당 값보다 큰 결과들:");
//        history.forEach(System.out::println);



    }

}

