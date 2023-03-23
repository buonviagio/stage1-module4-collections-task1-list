package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {

    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a), second = Integer.parseInt(b);
        int resultA = (5 * (first * first) + 3);
        int resultB = (5 * (second * second) + 3);
        if (resultA == resultB) {
            return -1;
        }
        return resultA - resultB;
    }
}
