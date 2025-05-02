package com.example.calculator2;

import java.util.ArrayList;

public class CalculatorLv2 {
    private  ArrayList<Integer> history;

    public CalculatorLv2() {

        this.history = new ArrayList<>();
    }



    public int calculate(int num1, int num2, char operator) {

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
        history.add(result);
        return result;
    }

    public void removeResult() {
        this.history.remove(0);
    }




    public ArrayList<Integer> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Integer> history) {
        this.history = history;
    }
}
