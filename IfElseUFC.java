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

        String makhachev = "islam", jones = "jones", volkanovski = "volkanovski", edwards = "edwards", pereira = "pereira", oliveira = "oliveira", strickland = "strickland", omalley = "omalley",
                adesanya = "adesanya", pantoja = "pantoja", sterling = "sterling", aspinall = "aspinall", holloway = "holloway", usman ="usman", prochazka = "prochazka", fighter;

        String rank1 = "", rank2 = "", rank3 = "", rank4 = "", rank5 = "", rank6 =" ", rank7 = "", rank8 = "", rank9 = "", rank10 = "", rank11 = "", rank12 = "", rank13 = "", rank14 = "", rank15 = "";

        int rank, wrongAnswers = 0, rankingsWrongAnswers = 0, totalWrongAnswers;

        boolean isFighterInList;
        do
        {
            do
            {
                System.out.println("Please enter a fighter's surname that you believe is in the pound4pound rankings: ");
                fighter = keyboard.next();

                isFighterInList = fighter.equals(makhachev) || fighter.equals(jones) || fighter.equals(volkanovski) || fighter.equals(edwards) || fighter.equals(pereira) || fighter.equals(oliveira) || fighter.equals(strickland) || fighter.equals(omalley) ||
                        fighter.equals(adesanya) || fighter.equals(pantoja) || fighter.equals(sterling) || fighter.equals(aspinall) || fighter.equals(holloway) || fighter.equals(usman) || fighter.equals(prochazka);

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


            if (fighter.equals(makhachev))
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

            if (fighter.equals(jones))
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

            if (fighter.equals(volkanovski))
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

            if (fighter.equals(edwards))
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

            if (fighter.equals(pereira))
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

            if (fighter.equals(oliveira))
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

            if (fighter.equals(strickland))
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

            if (fighter.equals(omalley))
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

            if (fighter.equals(adesanya))
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

            if (fighter.equals(pantoja))
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

            if (fighter.equals(sterling))
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

            if (fighter.equals(aspinall))
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

            if (fighter.equals(holloway))
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

            if (fighter.equals(usman))
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

            if (fighter.equals(prochazka))
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
        } while (!rank1.equals(makhachev) || !rank2.equals(jones) || !rank3.equals(volkanovski) || !rank4.equals(edwards) || !rank5.equals(pereira) || !rank6.equals(oliveira) || !rank7.equals(strickland) || !rank8.equals(omalley) || !rank9.equals(adesanya) || !rank10.equals(pantoja) || !rank11.equals(sterling) || !rank12.equals(aspinall) || !rank13.equals(holloway) || !rank14.equals(usman) || !rank15.equals(prochazka));

        totalWrongAnswers = wrongAnswers + rankingsWrongAnswers;
        System.out.println("Congratulations! You completed the pound4pound list\nWrong fighters given: " + wrongAnswers + "\nwrong ranking given: " + rankingsWrongAnswers + "\nTotal incorrect answers: " + totalWrongAnswers);
    }//mai
}//class


