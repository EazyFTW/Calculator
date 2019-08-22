package com.eazyftw.calculator;

import java.util.Arrays;

public enum OperationEnum {

    ADDITION("Addition", "+", "Add", "Addition", "Plus"),
    SUBTRACTION("Subtraction", "-", "Subtract", "Subtraction", "Minus"),
    MULTIPLICATION("Multiplication", "x", "X", "Multiply", "Multiplication", "Times"),
    DIVISION("Division", "/", "Divide", "Division");

    private String name;
    private String[] values;

    OperationEnum(String name, String... values) {
        this.name = name;
        this.values = values;
    }

    public String getName() { return name; }

    public String[] getValues() { return values; }

    public static OperationEnum getOperationFromValue(String value) { return Arrays.stream(OperationEnum.values()).filter(operationEnum -> Arrays.asList(operationEnum.getValues()).contains(value)).findFirst().orElse(null); }

}
