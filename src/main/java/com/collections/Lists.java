package com.collections;

import java.util.List;

public class Lists {
    public static Integer indexOf(String color, List<String> lista) {
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).equals(color)) return i;

        return -1;
    }

    public static Integer indexOfByIndex(String color, List<String> lista, Integer index) {
        for (int i = index; i < lista.size(); i++)
            if (lista.get(i).equals(color)) return i;

        return -1;
    }

    public static int indexOfEmpty(List<String> lista) {
        return put("", lista);
    }

    public static Integer put(String color, List<String> lista) {
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).isEmpty())
                return i;

        return -1;
    }

    public static Integer remove(String color, List<String> colors) {
        int total = 0;

        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                total++;
                colors.remove(i);
            }
        }

        return total;
    }
}
