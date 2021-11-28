package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissor Game!");
        System.out.println("0 - Rock");
        System.out.println("1 - Scissor");
        System.out.println("2 - Paper");
        System.out.print("-> Enter your choice: ");
        Random rnd = new Random();
        int a = rnd.nextInt(3);
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b < 3 && b > 0) {


            switch (a) {
                case 0 -> System.out.println("Opponent chose Rock");
                case 1 -> System.out.println("Opponent chose Scissor");
                case 2 -> System.out.println("Opponent chose Paper");
            }
            // 0 for rock, 1 for scissor, 2 for paper
            if (a == 0) {
                if (b == 1) {
                    System.out.println("You lost!");
                } else if (b == 2) {
                    System.out.println("You won!");
                } else {
                    System.out.println("Draw! ");
                }
            } else if (a == 1) {
                if (b == 0) {
                    System.out.println("You won!");
                } else if (b == 2) {
                    System.out.println("You lost!");
                } else {
                    System.out.println("Draw! ");
                }
            } else if (a == 2) {
                if (b == 0) {
                    System.out.println("You lost!");
                } else if (b == 1) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Draw! ");
                }


            }


        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
