package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hSet = new HashSet<>();

        for (Integer i: sourceList) {
            if (i % 2 != 0) {
                hSet.add(i);
                hSet.add(i * 2);
            } else {
                hSet.add(i);
                while (i % 2 == 0) {
                    hSet.add(i / 2);
                    i /= 2;
                }
            }
        }
        return hSet;
    }
}
