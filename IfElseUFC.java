package UFCp4pRankingQuiz;
import java.util.Scanner;

/***
 **** Created by Owner on 24/12/2023
 **** UPDATE PROGRAM DESCRIPTION HERE
 ***/
public class IfElseUFC
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String makhachev = "islam", jones = "jones", volkanovski = "volkanovski", edwards = "edwards", pereira = "pereira", oliveira = "oliveira", omalley = "omalley", du_plessis = "dricus",
        pantoja = "pantoja", adesanya = "adesanya", strickland = "strickland", sterling = "sterling", aspinall = "aspinall", holloway = "holloway", usman ="usman", fighter;

        String rank1 = "", rank2 = "", rank3 = "", rank4 = "", rank5 = "", rank6 =" ", rank7 = "", rank8 = "", rank9 = "", rank10 = "", rank11 = "", rank12 = "", rank13 = "", rank14 = "", rank15 = "";

        int rank, wrongAnswers = 0, rankingsWrongAnswers = 0, totalWrongAnswers;

        boolean isFighterInList;
        do
        {
            do
            {
                System.out.println("Please enter a fighter's surname that you believe is in the pound4pound rankings: ");
                fighter = keyboard.next();

                isFighterInList = fighter.equalsIgnoreCase(makhachev) || fighter.equalsIgnoreCase(jones) || fighter.equalsIgnoreCase(volkanovski) || fighter.equalsIgnoreCase(edwards) || fighter.equalsIgnoreCase(pereira) || fighter.equalsIgnoreCase(oliveira) || fighter.equalsIgnoreCase(strickland) || fighter.equalsIgnoreCase(omalley) ||
                        fighter.equalsIgnoreCase(adesanya) || fighter.equalsIgnoreCase(pantoja) || fighter.equalsIgnoreCase(sterling) || fighter.equalsIgnoreCase(aspinall) || fighter.equalsIgnoreCase(holloway) || fighter.equalsIgnoreCase(usman) || fighter.equalsIgnoreCase(du_plessis);

                if (isFighterInList)
                {
                    System.out.println(fighter + " is in the Pound4Pound list");
                }//if
                else
                {
                    System.out.println(fighter + " is not in the Pound4Pound list");
                    wrongAnswers++;
                }//else
            } while (!isFighterInList);//do while


            if (fighter.equalsIgnoreCase(makhachev))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 1)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is the No." + rank + " pound4pound champ");
                rank1 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(jones))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 2)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank2 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(volkanovski))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 3)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank3 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(edwards))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 4)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank4 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(pereira))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 5)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank5 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(oliveira))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 6)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank6 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(omalley))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 7)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank7 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(du_plessis))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 8)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank8 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(pantoja))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 9)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank9 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }//if

            if (fighter.equalsIgnoreCase(adesanya))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 10)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank10 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }// if

            if (fighter.equalsIgnoreCase(strickland))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 11)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank11 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }// if

            if (fighter.equalsIgnoreCase(sterling))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 12)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank12 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }// if

            if (fighter.equalsIgnoreCase(aspinall))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 13)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank13 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }// if

            if (fighter.equalsIgnoreCase(holloway))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 14)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank14 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }// if

            if (fighter.equalsIgnoreCase(usman))
            {
                System.out.println("what rank is " + fighter + " in the pound4pound list (1-15): ");
                rank = keyboard.nextInt();

                while (rank != 15)
                {
                    System.out.println(fighter + " is not ranked No." + rank + " in the pound4pound list, please try again:");
                    rankingsWrongAnswers++;
                    rank = keyboard.nextInt();

                }//while

                System.out.println("correct," + fighter + " is No." + rank + " on the pound4pound list");
                rank15 = fighter;
                System.out.println("1. " + rank1 + "\n2. " + rank2 + "\n3. " + rank3 + "\n4. " + rank4 + "\n5. " + rank5 + "\n6. " + rank6 + "\n7. " + rank7 + "\n8. " + rank8 + "\n9. " + rank9 + "\n10. " + rank10 + "\n11." + rank11 + "\n12. " + rank12 + "\n13. " + rank13 + "\n14. " + rank14 + "\n15. " + rank15);
            }// if
        } while (!rank1.equalsIgnoreCase(makhachev) || !rank2.equalsIgnoreCase(jones) || !rank3.equalsIgnoreCase(volkanovski) || !rank4.equalsIgnoreCase(edwards) || !rank5.equalsIgnoreCase(pereira) || !rank6.equalsIgnoreCase(oliveira) || !rank7.equalsIgnoreCase(omalley) || !rank8.equalsIgnoreCase(du_plessis) || !rank9.equalsIgnoreCase(pantoja) || !rank10.equalsIgnoreCase(adesanya) || !rank11.equalsIgnoreCase(strickland) || !rank12.equalsIgnoreCase(sterling) || !rank13.equalsIgnoreCase(aspinall) || !rank14.equalsIgnoreCase(holloway) || !rank15.equalsIgnoreCase(usman));

        totalWrongAnswers = wrongAnswers + rankingsWrongAnswers;
        System.out.println("Congratulations! You completed the pound4pound list\nWrong fighters given: " + wrongAnswers + "\nwrong ranking given: " + rankingsWrongAnswers + "\nTotal incorrect answers: " + totalWrongAnswers);
    }//mai
}//class


