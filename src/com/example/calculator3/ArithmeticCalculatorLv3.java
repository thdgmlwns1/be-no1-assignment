package com.example.calculator3;

import java.util.ArrayList;
import java.util.List;



public class ArithmeticCalculatorLv3<T extends Number>{
    private  ArrayList<T> history;
    private  Class<T> type;

    public ArithmeticCalculatorLv3(Class<T> type) {

        this.history = new ArrayList<>();
        this.type = type;
    }



    public T calculate(T a, T b, Type operator) {
        double num1 = a.doubleValue();
        double num2 = b.doubleValue();
        double result=0;


        switch (operator) {
            case PLUS:
                result = num1 + num2;
                break;
            case MINUS:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
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
        T typedResult = convertToT(result);
        history.add(typedResult);
        return typedResult;
    }



    private T convertToT(double value) {
        if (type == Integer.class) {
            return type.cast((int) value);
        } else if (type == Double.class) {
            return type.cast(value);
        } else if (type == Float.class) {
            return type.cast((float) value);
        } else if (type == Long.class) {
            return type.cast((long) value);
        } else {
            throw new UnsupportedOperationException("지원하지 않는 타입입니다: " + type);
        }
    }

    public void removeResult() {
        this.history.remove(0);
    }



    public List<T> getResultsGreaterThan(T threshold) {
        double a = threshold.doubleValue();
        return history.stream()
                .filter(b -> b.doubleValue() > a)
                .toList();
    }

    public ArrayList<T> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<T> history) {
        this.history = history;
    }
}
