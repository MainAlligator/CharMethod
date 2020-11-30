package com.company;

public class Main {

    public static void main(String[] args) {
        char simple1 = 'F';
        char simple2 = '$';
        char simple3 = ' ';
        char simple4 = '5';

        System.out.println("Значение \" F\" цифра?  : " + Character.isDigit(simple1)); // метод isDigit - определяет, является ли указанное значение типа char цифрой.
        System.out.println("Значение \" $\" цифра?  : " + Character.isDigit(simple2));
        System.out.println("Значение \" %\" цифра?  : " + Character.isDigit(simple3));
        System.out.println("Значение \" 5\" цифра?  : " + Character.isDigit(simple4));
        System.out.println(" \n");

        System.out.println("Значение \" F\" буква?  : " + Character.isLetter(simple1)); // метод isLetter - определяет, является ли указанное значение типа char буквой.
        System.out.println("Значение \" $\" буква?  : " + Character.isLetter(simple2));
        System.out.println("Значение \" %\" буква?  : " + Character.isLetter(simple3));
        System.out.println("Значение \" 5\" буква?  : " + Character.isLetter(simple4));
        System.out.println(" \n");

        System.out.println("Значение \" F\" пустое пространство?  : " + Character.isWhitespace(simple1)); // метод isWhitespace - определяет, является ли указанное значение типа char пустым пространством, которое включает в себя пробел, табуляцию или новую строку..
        System.out.println("Значение \" $\" пустое пространство?  : " + Character.isWhitespace(simple2));
        System.out.println("Значение \" %\" пустое пространство?  : " + Character.isWhitespace(simple3));
        System.out.println("Значение \" 5\" пустое пространство?  : " + Character.isWhitespace(simple4));
        System.out.println(" \n");

        System.out.println("Значение \" F\" в верхнем регистре?  : " + Character.isUpperCase(simple1)); // метод isUpperCase - определяет, является ли указанное значение типа char  в верхнем регистре.
        System.out.println("Значение \" $\" в верхнем регистре?  : " + Character.isUpperCase(simple2));
        System.out.println("Значение \" %\" в нижнем  регистре?  : " + Character.isLowerCase(simple3)); // метод isLowerCase - определяет, является ли указанное значение типа char  в нижнем  регистре.
        System.out.println("Значение \" 5\" в нижнем регистре?  : " + Character.isLowerCase(simple4));
        System.out.println(" \n");

        System.out.println(" Меняем регистр : " + Character.toUpperCase(simple1)); // метод toUpperCase - переводит  значение типа char  в верхнии регистр.
        System.out.println("Меняем регистр   : " + Character.toUpperCase(simple2));
        System.out.println("Меняем регистр   : " + Character.toLowerCase(simple1)); // метод toLowerCase   - переводит  значение типа char  в  нижний регистр.
        System.out.println("Меняем регистр   : " + Character.toLowerCase(simple1));
        System.out.println(" \n");

        System.out.println("Меняем на строку   : " + Character.toString(simple1)); // метод toString -  преоброзует   значение типа char  в строку  .
        System.out.println("Меняем на строку : " + Character.toString(simple2));


        String experience = "Ура! Java!";

        int code1 = experience.codePointAt(1);
        int code2 = experience.codePointAt(3);
        int code3 = experience.codePointAt(9);
        System.out.println("  Character(at index 1) = "+code1);
        System.out.println("  Character(at index 3) = "+code2);
        System.out.println("  Character(at index 9) = "+code3);


    }
}
