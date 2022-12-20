package chapterThree;

import java.util.Scanner;

public class MyersBriggs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int extrovert = 0;
        int introvert = 0;
        int sensing = 0;
        int intuition = 0;
        int turbulent = 0;
        int feeling = 0;
        int judging = 0;
        int perceive = 0;

        System.out.println("""
                MYERS` BRIGGS WELCOMES YOU TO OBTAINING YOUR PERSONALITY TEST
                PLEASE, CHOOSE BETWEEN OPTIONS "A" AND "B"
                """);
        System.out.println();
        for (int i = 0; i < 20; i++) {
            switch (i) {
                case 1 -> {
                    System.out.println("""
                            QUESTIOIN 1
                                                        
                            A. expend energy, enjoy groups
                            B. conserve energy, enjoy one-on-one
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        extrovert++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        introvert++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 2 -> {
                    System.out.println("""
                            QUESTION 2
                                                        
                            A. interpret literally
                            B. look for meaning and possibilities
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        sensing++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        intuition++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 3 -> {
                    System.out.println("""
                            QUESTION 3
                                                        
                            A. logical, thinking, questioning
                            B. empathetic, feeling, accommodating
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        turbulent++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        feeling++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 4 -> {
                    System.out.println("""
                            QUESTION 4
                                                        
                            A. organised, orderly
                            B. flexible, adaptable
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        judging++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        perceive++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 5 -> {
                    System.out.println("""
                            QUESTION 5
                                                        
                            A. more out going, think out loud
                            B. more reserved, think to yourself
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        extrovert++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        introvert++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 6 -> {
                    System.out.println("""
                            QUESTION 6
                            A. practical, realistic, experimental
                            B. imaginative, innovative, theoretical
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        sensing++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        intuition++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 7 -> {
                    System.out.println("""
                            QUESTION 7
                                                        
                            A. candid, straight forward, frank
                            B. tactful,kind, encouraging
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        turbulent++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        feeling++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 8 -> {
                    System.out.println("""
                            QUESTION 8
                                                        
                            A. plan, schedule
                            B. unplanned, spontaneous
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        judging++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        perceive++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 9 -> {
                    System.out.println("""
                            QUESTION 9
                                                        
                            A. seek many tasks, public activities
                            B. seek private, solitary activities with quite to concenterate
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        extrovert++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        introvert++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 10 -> {
                    System.out.println("""
                            QUESTION 10
                                                        
                            A. standard, usual, conventional
                            B. different, novel, unique
                             """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        sensing++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        intuition++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 11 -> {
                    System.out.println("""
                            QUESTION 11
                                                        
                            A. firm, tend to criticise, hold the line
                            B. gentle, tend to appreciate, concilliate
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        turbulent++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        feeling++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 12 -> {
                    System.out.println("""
                            QIESTION 12
                                                        
                            A. regulated, structured
                            B. easygoing, "live" and "let live"
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        judging++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        perceive++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 13 -> {
                    System.out.println("""
                            QUESTION 13
                                                        
                            A. external communicative, express yourself
                            B. internal, reticent, keep to yourself
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        extrovert++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        introvert++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 14 -> {
                    System.out.println("""
                            QUESTION 14
                                                        
                            A. focus on here-and-now
                            B. look to the future, global perspective, "big picture"
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        sensing++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        intuition++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 15 -> {
                    System.out.println("""
                            QUESTION 15
                                                        
                            A. tough-minded, just
                            B. tender-hearted, merciful
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        turbulent++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        feeling++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 16 -> {
                    System.out.println("""
                            QUESTION 16
                                                        
                            A. preparation, plan ahead
                            B. go with the flow, adapt as you go
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        judging++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        perceive++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 17 -> {
                    System.out.println("""
                            QUESTIOM 17
                                                        
                            A. active, initiate
                            B. reflective, deliberate
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        extrovert++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        introvert++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 18 -> {
                    System.out.println("""
                            QUESTION 18
                                                        
                            A. facts, things, "what is"
                            B. ideas, dreams, "what could be", philosophical
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        sensing++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        intuition++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 19 -> {
                    System.out.println("""
                            QUESTION 19
                                                        
                            A. matter of facts, "what is"
                            B. sensitive, people-oriented, compassionate
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        turbulent++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        feeling++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

                case 20 -> {
                    System.out.println("""
                            QUESTION 20
                                                        
                            A. control, govern
                            B. latitude, freedom
                            """);
                    System.out.println("pick an option");
                    String userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) {
                        judging++;
                    } else if (userInput.equalsIgnoreCase("B")) {
                        perceive++;
                    } else System.out.println("Wrong input");
                    System.out.println();
                    break;
                }

            }
        }

        extrovertOrIntrovert(extrovert, introvert);
        sensingOrIntuition(sensing, intuition);
        turbulentOrFeeling(turbulent, feeling);
        judgingOrPerceive(judging, perceive);
    }

    public static void extrovertOrIntrovert(int extrovert, int introvert) {
        if (extrovert > introvert) {
            System.out.println("You are E");
        } else System.out.println("You are I");
    }

    public static void sensingOrIntuition(int sensing, int intuition) {
        if (sensing > intuition) {
            System.out.println("You are S");
        } else System.out.println("You are N");
    }

    public static void turbulentOrFeeling(int turbulent, int feeling) {
        if (turbulent > feeling) {
            System.out.println("You are T");
        } else System.out.println("You are F");
    }

    public static void judgingOrPerceive(int judging, int perceive) {
        if (judging > perceive) {
            System.out.println("You are J");
        } else System.out.println("You are P");
    }
}