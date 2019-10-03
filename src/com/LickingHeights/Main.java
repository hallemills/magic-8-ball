package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        Double number;

        System.out.println("Pick a number 1-100");
        number = keyboard.nextDouble();

        if (10>=number && number>0) {
            System.out.println("It is certain");
        }
        else if(20>=number && number>10) {
            System.out.println("Without a doubt");
        }
        else if(30>=number && number>20) {
            System.out.println("As I see it");
        }
        else if(40>=number && number>30) {
            System.out.println("Its not lookin too hot");
        }
        else if(50>=number && number>40) {
            System.out.println("Don't count on it");
        }
        else if(60>=number && number>50) {
            System.out.println("Most likely");
        







        }
    }