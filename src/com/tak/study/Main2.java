package com.tak.study;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //총 가격
        int all = sc.nextInt();
        //총 구매 개수
        int c = sc.nextInt();
        //for문이 돌아 갈 때마다 가격을 더함
        int num = 0;

        //입력한 횟수만큼 반복
        for (int i = 0; i < c; i++) {

            //해당물건 개당 가격
            int a = sc.nextInt();
            //해당물건 개수
            int b = sc.nextInt();

            //해당물건 총 가격
            int ab = a * b;

            //중첩되는 총 가격
            num += ab;
        }

        //if : [입력한 가격], [출력된 총 가격] 일치
        if (all == num) {
            System.out.println("Yes");

        //else if : 불일치
        } else if (all != num) {
            System.out.println("No");
        }

    }

}