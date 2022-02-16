package com.company;

import java.util.Comparator;

public class Compare implements Comparator<Player> {
    @Override
    public int compare(Player a1, Player b1) {
        if (a1.score < b1.score) {
            return 1;
        } else if (a1.score > b1.score) {
            return -1;
        } else {
            return a1.name.compareTo(b1.name);
        }
    }
}
