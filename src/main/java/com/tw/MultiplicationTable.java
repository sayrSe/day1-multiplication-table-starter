package com.tw;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number > 0 && number < 1001;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start < end;
    }

    public String generateTable(int start, int end) {
        StringBuilder table = new StringBuilder();
        for (int multiplier = start; multiplier <= end; multiplier++) {
            table.append(generateLine(start, multiplier));
            if (multiplier != end) table.append(System.lineSeparator());
        }
        return table.toString();
    }

    public String generateLine(int start, int row) {
        List<String> expressions = new ArrayList<>();

        for (int multiplicand = start; multiplicand <= row; multiplicand++) {
            expressions.add(generateSingleExpression(multiplicand, row));
        }
        return String.join("  ", expressions);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + (multiplicand * multiplier);
    }
}
