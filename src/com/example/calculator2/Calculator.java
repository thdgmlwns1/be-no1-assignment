package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private  List<Integer> history;

    public Calculator() {

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
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자 입력입니다");
                break;

        }
        history.add(result);
        return result;
    }

    public void removeResult() {
        this.history.remove(0);
    }




    public List<Integer> getHistory() {
        return history;
    }

    public void setHistory(List<Integer> history) {
        this.history = history;
    }
}
