package com.example.calculator3;

public enum Type {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char symbol;

    Type(char symbol) {
        this.symbol = symbol;
    }


    public static Type match(char input) {
        for (Type op : Type.values()) {
            if (op.symbol == input) {
                return op;
            }
        }
        return null;
    }
}