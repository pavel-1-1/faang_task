package org.example.buildCSV.interfaceCSV;

import java.util.List;

public interface MatrixJoiner<T> {
    T join(List<List<T>> matrix);
}
