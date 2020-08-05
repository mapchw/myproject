package com.mako.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
//        set();
        HashMap<String, String> stocks = new HashMap<>(); //<KEY,VALUE>，無排序概念，同KEY資料無法重複
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key : stocks.keySet()) {
            System.out.print(key + "=>");
            System.out.println(stocks.get(key));
        }
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>(); //資料無法重複，無index先後概念，用二元作放置其實無排序功能
        set.add(5);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(6);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList(); //資料可重複
        list.add(5);
        list.add(3);
//        list.add("Mako");
//        list.add(true);
        list.add(1);
        list.add(7);
        list.add(1);
        System.out.println(list);
//        int n1 = (int) list.get(0);
//        String s = (String) list.get(1);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(78, 34, 65, 99, 20);
        System.out.println(scores);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 34;
        numbers[4] = 2;
//        numbers[5] = 66;
        int[] scores = {78, 34, 65, 99, 20};
        System.out.println(scores);
        for (int i=0; i<5; i++) {
            System.out.println(scores[i]);
        }
        for (int n : scores) {
            System.out.println(n);
        }
    }
}
