package Lv_2;

import java.util.*;

public class Calculrator {

    private ArrayList<Double> resultList = new ArrayList<Double>();

    // Getter
    public ArrayList<Double> getResultList() {
        return resultList;
    }
    // Setter
    public void setResultList(ArrayList<Double> resultList) {
        this.resultList = resultList;
    }

    public void removeResult() {
        resultList.remove(0);
    }

    public double calculate(char operator, int a, int b) {
        double result = 0;
        if(operator == '+') {
            // 더하기 연상
            result = a + b;
        } else if (operator == '-') {
            // 빼기 연산
            result = a- b;
        } else if (operator == '*') {
            // 곱하기 연산
            result = a * b;
        } else if (operator == '/') {
            // 나누기 연산
            result = a / b;
        }
        resultList.add(result);
        return result;
    }
}
