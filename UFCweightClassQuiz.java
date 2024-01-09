package UFCp4pRankingQuiz;

import java.util.Arrays;
import java.util.Scanner;

/***
 **** Created by Owner on 04/01/2024
 **** UPDATE PROGRAM DESCRIPTION HERE
 ***/
public class UFCweightClassQuiz
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[] weightClasses = new int[7];
        int menuChoice, guessWeight, wrongAnswer = 0, wrongAnswerLbs = 0;
        int heavyWeight = 265, lightheavyweight1 = 205, middleweight = 185, welterweight = 170, lightweight = 155, featherweight = 145, bantamweight = 135, flyweight = 125;
        String[] weightClass = {"heavyweight", "light heavyweight", "middleweight", "welterweight", "lightweight", "featherweight", "bantamweight", "flyweight"};
        String weightDivision, lightHeavyweight = "lightheavyweight";
        String[] printWeightClass = {"","","","","","","",""}, printedWeightLimits = {"","","","","","","",""};
        boolean isItAweightDivision;

        do
        {
            System.out.println("Please enter the name of a weight division:");
            weightDivision = keyboard.nextLine();

            isItAweightDivision = ((weightDivision.equalsIgnoreCase(lightHeavyweight) || (weightDivision.equalsIgnoreCase(weightClass[0])) || (weightDivision.equalsIgnoreCase(weightClass[1])) || (weightDivision.equalsIgnoreCase(weightClass[2])) || (weightDivision.equalsIgnoreCase(weightClass[3])) || (weightDivision.equalsIgnoreCase(weightClass[4])) || (weightDivision.equalsIgnoreCase(weightClass[5])) || (weightDivision.equalsIgnoreCase(weightClass[6])) || (weightDivision.equalsIgnoreCase(weightClass[7]))));

            if (isItAweightDivision)
            {
                System.out.println("Correct, " + weightDivision + " is an official UFC weight class");

                do
                {

                    System.out.println("If you would like to guess the cut off weight enter 1:\t If you want to guess another weight division enter 2:");
                    menuChoice = keyboard.nextInt();
                    keyboard.nextLine();

                } while ((menuChoice !=1) && (menuChoice!=2));

                    if (menuChoice == 1)
                    {
                           do
                           {
                               System.out.println("please enter what you believe to be the cut off weight for " + weightDivision + ":");
                               guessWeight = keyboard.nextInt();
                               keyboard.nextLine();

                               if ((guessWeight == heavyWeight) && (weightDivision.equalsIgnoreCase(weightClass[0])))
                               {
                                   System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[0]);
                                   printWeightClass[0] = weightClass[0];
                                   printedWeightLimits[0] = "265lbs";
                                   System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                               break;

                               }//if

                               else if ((guessWeight == lightheavyweight1) && (weightDivision.equalsIgnoreCase(weightClass[1])) || (weightDivision.equalsIgnoreCase(lightHeavyweight)))
                               {
                                   System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[1]);
                                   printWeightClass[1] = weightClass[1];
                                   printedWeightLimits[1] = "205lbs";
                                   System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                              break;

                               }//else if

                                    else if ((guessWeight == middleweight) && (weightDivision.equalsIgnoreCase(weightClass[2])))
                                    {
                                        System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[2]);
                                        printWeightClass[2] = weightClass[2];
                                        printedWeightLimits[2] = "185lbs";
                                        System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                                    break;

                                    }//else if

                                        else if ((guessWeight == welterweight) && (weightDivision.equalsIgnoreCase(weightClass[3])))
                                        {
                                            System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[3]);
                                            printWeightClass[3] = weightClass[3];
                                            printedWeightLimits[3] = "170lbs";
                                            System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                                        break;

                                        }//else if

                                            else if ((guessWeight == lightweight) && (weightDivision.equalsIgnoreCase(weightClass[4])))
                                            {
                                                System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[4]);
                                                printWeightClass[4] = weightClass[4];
                                                printedWeightLimits[4] = "155lbs";
                                                System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                                            break;

                                            }//else if

                                                else if ((guessWeight == featherweight) && (weightDivision.equalsIgnoreCase(weightClass[5])))
                                                {
                                                    System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[5]);
                                                    printWeightClass[5] = weightClass[5];
                                                    printedWeightLimits[5] = "145lbs";
                                                    System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                                                break;

                                                }//else if

                                                    else if ((guessWeight == bantamweight) && (weightDivision.equalsIgnoreCase(weightClass[6])))
                                                    {
                                                        System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[6]);
                                                        printWeightClass[6] = weightClass[6];
                                                        printedWeightLimits[6] = "135lbs";
                                                        System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                                                    break;

                                                    }//else if

                                                        else if ((guessWeight == flyweight) && (weightDivision.equalsIgnoreCase(weightClass[7])))
                                                        {
                                                            System.out.println("Correct, " + guessWeight + "lbs is the cut off weight for " + weightClass[7]);
                                                            printWeightClass[7] = weightClass[7];
                                                            printedWeightLimits[7] = "125lbs";
                                                            System.out.println("1) " + printWeightClass[0] + " " + printedWeightLimits[0] + "\n2) " + printWeightClass[1] + " " + printedWeightLimits[1] + "\n3) " + printWeightClass[2] + " " + printedWeightLimits[2] + "\n4) " + printWeightClass[3] + " " + printedWeightLimits[3] + "\n5) " + printWeightClass[4] + " " + printedWeightLimits[4] + "\n6) " + printWeightClass[5] + " " + printedWeightLimits[5] + "\n7) " + printWeightClass[6] + " " + printedWeightLimits[6] + "\n8) " + printWeightClass[7] + " " + printedWeightLimits[7] + "\n");

                                                        break;

                                                        }//else if

                                                            else
                                                            {
                                                                System.out.println("this is not the cut off weight for " + weightDivision);
                                                                wrongAnswerLbs++;
                                                            }//else
                           } while (true);

                    }//if

            }//if
            else
            {
                System.out.println("This is not a weight division in the UFC");
                wrongAnswer++;
            }//else

        } while (!Arrays.equals(printWeightClass, weightClass));

        System.out.println("Congratulations! You have guessed every weight division and their championship fight weight limit");
        System.out.print("Wrong weight classes given: " + wrongAnswer + "\nWrong weight limit given: " + wrongAnswerLbs);

    }//main
}//class
