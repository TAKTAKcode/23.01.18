package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int result = 0;

        for (int i = 1; i <= a; i++) {

            result += i;

        }
        System.out.println(a + "번째 반복중 : " + result);

    }

}