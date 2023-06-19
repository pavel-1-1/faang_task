package org.example.buildCSV.interfaceCSV;

import java.util.List;

public interface VectorJoiner<T> {
    T join(List<T> vector);
}
