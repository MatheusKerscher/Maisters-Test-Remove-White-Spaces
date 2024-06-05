package org.example;

import RemoveWhiteSpaces.RemoveWhiteSpaces;

public class Main {
    public static void main(String[] args) {
        String input = "Esta é uma string de exemplo com espaços.";
        String result = RemoveWhiteSpaces.removeWhiteSpaces(input);
        System.out.println("String original: " + input);
        System.out.println("String sem espaços: " + result);
    }
}