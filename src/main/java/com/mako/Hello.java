package com.mako;

public class Hello {
    public static void main(String[] args) {
//        Student stu = new Student("MMM", 50, 70);

//        System.out.println("Hello World");
        String s = "abcd1234";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3,6));

        Person p = new Person("Mako", 62.4f, 1.7f);
        p.hello();
        System.out.println(p.bmi());

        int score = 88;
        System.out.println(score >= 80 && score < 90);
        char c = 'A';
        System.out.println(c > 60);
        /*int age = 19;
        Integer age2 = 20;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 43.4f;
        float height = 1.4f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Mako";*/
    }
}
