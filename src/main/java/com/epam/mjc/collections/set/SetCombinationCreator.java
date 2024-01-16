package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> all = new HashSet<>();

        all.addAll(firstSet);
        all.addAll(secondSet);
        all.addAll(thirdSet);

        for (String s: all) {
            if (((firstSet.contains(s) && secondSet.contains(s)) && !thirdSet.contains(s))
            || (thirdSet.contains(s) && (!firstSet.contains(s) && !secondSet.contains(s)))) {
                hashSet.add(s);
            }
        }
        return hashSet;
    }
}
