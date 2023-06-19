package org.example.buildCSV;

import org.example.buildCSV.interfaceCSV.MatrixJoiner;
import org.example.buildCSV.interfaceCSV.VectorJoiner;

import java.util.List;

public class BuildCSV {

    private static final VectorJoiner<String> vectorJoiner = list -> {
        StringBuilder strings = new StringBuilder();
        list.forEach(element -> strings.append(element).append(',').append(" "));
        return strings.toString();
    };

    private static final MatrixJoiner<String> matrixJoiner = list -> {
        StringBuilder builder = new StringBuilder();
        list.stream().map(vectorJoiner::join).map(string -> builder.append(string).append("\n"));
        return builder.toString();
    };


    public static String toCsv(List<List<String>> table) throws IllegalArgumentException {
        if (table.isEmpty()) {
            throw new IllegalArgumentException("list empty");
        }
        return matrixJoiner.join(table);
    }
}
