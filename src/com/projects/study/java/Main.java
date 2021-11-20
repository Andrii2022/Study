package com.projects.study.java;

import com.projects.study.java.logger.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вітаю Вас на грі 'Мільон'\nРозпочати гру?\n1. Так     2. Ні");
        int answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("Нову гру почато...\n" +
                    "Питання 1. Об'єм двигуна жигуля копейки?\n" +
                    "1) 1.6; 2) 5.7;\n" +
                    "3) 1.2; 4) 7.4;");
            answer = sc.nextInt();
            if (answer == 1) {
                System.out.println("Вітаю, ти виграв 100грн\n---Грати далі(1)/Забрати гроші(2)---");
                answer = sc.nextInt();
                if (answer == 1) {
                    System.out.println("Питання 2. Скільки лап в здорового кота не інвалідa\n" +
                            "1) 8; 2) 16;\n" +
                            "3) 4; 4) 2;");
                    answer = sc.nextInt();
                    if (answer == 3){
                        System.out.println("Вітаю, ти виграв 200грн\n---Грати далі(1)/Забрати гроші(2)---");
                        answer = sc.nextInt();
                        if (answer == 1){
                            System.out.println("Питання 3. ЗиЛ?\n" +
                                    "1) 5557; 2) 131;\n" +
                                    "3) Ikarus; 4) 2;");
                            answer = sc.nextInt();

                        } else {
                            System.out.println("Ваш виграш 200грн. До зустрічі...");

                        }
                    } else {
                        System.out.println("Ваш виграш 0грн. До зустрічі...");
                    }
                } else {
                    System.out.println("Ваш виграш 100грн. До зустрічі...");
                }
            } else {
                System.out.println("Ваш виграш 0грн. До зустрічі.");
            }
        }

        /*if (answer == 2) {
            System.out.println("Допобачення");
            return;
        }
        if (answer == 1) {
            System.out.println("Запитання 1\n\n2 + 2 =\nВиберіть правильну відповідь\n\n1. 4\n2. 5\n3. 7\n4. 9");
        }
        answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("Правильно");
        }
        if ((answer == 2) || (answer == 3) || (q == 4)) {
            System.out.println("Неправильна відповідь!\nВи програли!");
        } if (q >= 5){
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
        if (q1 == 1) {
            System.out.println("Продовжимо гру");
        }
        if (q1 == 2) {
            System.out.println("Гру завершено\nВаш виграш 100$");
        } if (q1 >= 3) {
            System.out.println("ERROR");
        }
        if (q1 != 1) {
            return;
        }
        if (q1 == 1) {
            System.out.println("Питання 2\n\n2 + 3 =\nВиберіть правильну відповідь\n\n1. 10\n2. 5\n3. 7\n4. 3");
        }
        int q2 = sc.nextInt();
        if (q2 == 2) {
            System.out.println("Правильно");
        }
            if ((q2 == 1) || (q2 == 3) || (q2 == 4)) {
                System.out.println("Неправильна відповідь!\nВи програли!");
            } if (q2 >= 5) {
                System.out.println("ERROR");
            }
            if (q2 != 2) {
                return;
            }
            if (q2 == 2) {
                System.out.println("1. Продовжити гру");
                System.out.println("2. Завершити гру");
            }
            int q3 = sc.nextInt();
            if (q3 == 1) {
                System.out.println("Продовжимо гру");
            }
                   if (q3 == 2) {
                       System.out.println("Гру завершено\nВаш виграш 200$");
                   }
                   if (q3 >= 3) {
                       System.out.println("ERROR");
                   }
            if (q3 != 1) {
                return;
            }
            if (q3 == 1) {
                System.out.println("Питання 3\n\n3 + 3 =\nВиберіть правильну відповідь\n\n1. 4\n2. 5\n3. 7\n4. 6");
            }
            int q4 = sc.nextInt();
           if (q4 == 4) {
               System.out.println("Правильно");
           }
           if ((q4 == 1) || (q4 == 2) || (q4 == 3)) {
               System.out.println("Неправильна відповідь!\nВи програли!");
           }
           if (q4 >= 5){
                    System.out.println("ERROR");
            }
            if (q4 != 4) {
                return;
            }
            if (q4 == 4) {
                System.out.println("1. Продовжити гру\n2. Завершити гру");
            }
            int q5 = sc.nextInt();
            if (q5 == 1) {
                System.out.println("Продовжимо гру");
            }
                if (q5 == 2) {
                    System.out.println("Гру завершено\nВаш виграш 300$");
                }
                if (q5 >= 3) {
                    System.out.println("ERROR");
                }
                if (q5 != 1) {
                    return;
                }
                if (q5 == 1) {
                    System.out.println("Питання 4\n3 + 5 =\nВиберіть правильну відповідь\n\n1. 4\n2. 5\n3. 8\n4. 6");
                }
                int q6 = sc.nextInt();
                if (q6 == 3) {
                    System.out.println("Правильно");
                }
                if ((q6 == 1) || (q6 == 2) || (q6 == 4)) {
                    System.out.println("Неправильна відповідь!\nВи програли!");
                }
                if (q6 >= 5) {
                    System.out.println("ERROR");
                }
                if (q6 != 3) {
                    return;
                }
                if (q6 == 3) {
                    System.out.println("1. Продовжити гру\n2. Завершити гру");
                }
                int q7 = sc.nextInt();
                if (q7 == 1) {
                    System.out.println("Продовжимо гру");
                }
                if (q7 == 2) {
                    System.out.println("Гру завершено\nВаш виграш 400$");
                }
                if (q7 >= 3) {
                    System.out.println("ERROR");
            }
            if (q7 != 1) {
                return;
            }
            if (q7 == 1) {
                System.out.println("Питання 5\n4 + 5 =\nВиберіть правильну відповідь\n\n1. 4\n2. 9\n3. 8\n4. 6");
            }
        int q8 = sc.nextInt();
        if (q8 == 2) {
            System.out.println("Правильно");
        }
                if ((q8 == 1) || (q8 == 3) || (q8 == 4)) {
                    System.out.println("Неправильна відповідь!\nВи програли!");
                }
                if (q8 >= 5){
                System.out.println("ERROR");
        }
        if (q8 != 2) {
            return;
        }
        if (q8 == 2) {
            System.out.println("Вітаю!\nВи пройшли гру!\nВаш виграш становить 1 000$");
        }
        return;*/
        }
}