package com.projects.study.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вітаю Вас на грі 'Мільон'\nРозпочати гру?\n1. Так     2. Ні");
        int w = sc.nextInt();
        if (w == 2){
            System.out.println("Допобачення");
            return;
        }
        if (w == 1) {
        System.out.println("Запитання 1\n\n2 + 2 =\nВиберіть правильну відповідь\n\n1. 4\n2. 5\n3. 7\n4. 9");
        }
        int q = sc.nextInt();
        switch (q) {
            case 1:
                System.out.println("Правильно");
                break;
            case 2:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 3:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 4:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q > 1) {
            return;
        }
        if (q == 1) {
            System.out.println("1. Продовжити гру");
            System.out.println("2. Завершити гру");
        }
        int q1 = sc.nextInt();
        switch (q1) {
            case 1:
                System.out.println("Продовжимо гру");
                break;
            case 2:
                System.out.println("Гру завершено\nВаш виграш 100$");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q1 ==2){
            return;
        }
        if (q1 == 1){
        System.out.println("Питання 2\n\n2 + 3 =\nВиберіть правильну відповідь\n\n1. 10\n2. 5\n3. 7\n4. 3");
        }
        int q2 = sc.nextInt();
        switch (q2) {
            case 1:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 2:
                System.out.println("Правильно");
                break;
            case 3:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 4:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q2 != 2){
            return;
        }
        if (q2 == 2) {
            System.out.println("1. Продовжити гру");
            System.out.println("2. Завершити гру");
        }
        int q3 = sc.nextInt();
        switch (q3) {
            case 1:
                System.out.println("Продовжимо гру");
                break;
            case 2:
                System.out.println("Гру завершено\nВаш виграш 200$");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q3 == 2){
            return;
        }
        if (q3 == 1) {
            System.out.println("Питання 3\n\n3 + 3 =\nВиберіть правильну відповідь\n\n1. 4\n2. 5\n3. 7\n4. 6");
        }
        int q4 = sc.nextInt();
        switch (q4) {
            case 1:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 2:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 3:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 4:
                System.out.println("Правильно");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q4 != 4) {
            return;
        }
        if (q4 == 4) {
        System.out.println("1. Продовжити гру\n2. Завершити гру");
        }
        int q5 = sc.nextInt();
        switch (q5) {
            case 1:
                System.out.println("Продовжимо гру");
                break;
            case 2:
                System.out.println("Гру завершено\nВаш виграш 300$");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q5 == 2) {
            return;
        }
        if (q5 == 1) {
            System.out.println("Питання 4\n3 + 5 =\nВиберіть правильну відповідь\n\n1. 4\n2. 5\n3. 8\n4. 6");
        }
        int q6 = sc.nextInt();
        switch (q6) {
            case 1:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 2:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 3:
                System.out.println("Правильно");
                break;
            case 4:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q6 != 3) {
            return;
        }
        if (q6 == 3) {
            System.out.println("1. Продовжити гру\n2. Завершити гру");
        }
        int q7 = sc.nextInt();
        switch (q7) {
            case 1:
                System.out.println("Продовжимо гру");
                break;
            case 2:
                System.out.println("Гру завершено\nВаш виграш 400$");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q7 == 2) {
            return;
        }
        if (q7 == 1) {
            System.out.println("Питання 5\n4 + 5 =\nВиберіть правильну відповідь\n\n1. 4\n2. 9\n3. 8\n4. 6");
        }
        int q8 = sc.nextInt();
        switch (q8) {
            case 1:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 2:
                System.out.println("Правильно");
                break;
            case 3:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            case 4:
                System.out.println("Неправильна відповідь!\nВи програли!");
                break;
            default:
                System.out.println("ERROR");
        }
        if (q8 != 2) {
            return;
        }
        if (q8 == 2) {
            System.out.println("Вітаю!\nВи пройшли гру!\nВаш виграш становить 1 000$");
        }
        return;
    }
}


