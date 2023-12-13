package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] array = {"a", "b", "a","c"};

        HashSet<String> uniqueElements = HashsetTask.getUniqueElement(array);
        System.out.println(uniqueElements);


    }
}