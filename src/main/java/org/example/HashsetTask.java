package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetTask {

    public static <T> HashSet<T> getUniqueElement(T[] array) {
        HashSet<T> uniqueElements = new HashSet<>();

        for(T element : array) {
            uniqueElements.add(element);
        }

        return uniqueElements;
    }
}
