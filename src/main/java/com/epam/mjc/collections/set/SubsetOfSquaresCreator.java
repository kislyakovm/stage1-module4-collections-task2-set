package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> tSet = new TreeSet<>();
        int pow;

        for (Integer i: sourceList) {
            pow = i * i;
            if (pow >= lowerBound && upperBound >= pow) {
                tSet.add(pow);
            }
        }
        return tSet;
    }
}
