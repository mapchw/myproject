package com.mako.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame { //abstract抽象類別
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate(); //abstract抽象方法
    public boolean vaildate() {
        if (numbers.size() == numberCount) {
            return true;
        } else {
            return false;
        }
    }
}
