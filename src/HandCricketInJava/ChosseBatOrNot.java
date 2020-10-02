package HandCricketInJava;

import java.util.Scanner;
import java.util.Random;

public class ChosseBatOrNot {

    // Returns true if the user wants to do batting
    static boolean BatOrNot() {

        Scanner take_input = new Scanner(System.in);

        int user_choice = 0;
        boolean flag = false;
        System.out.print("\n\n\tPress 1 to choose Batting and Press 2 to Choose Bowling\n");

        do {
            try {

                if (flag) {
                    System.out.print("\n\tINVALID CHOICE\n\tMUST ENTER 1 or 2");
                }
                flag = true;
                System.out.print("\n\tEnter your choice...");
                user_choice = take_input.nextInt();

            } catch (Exception e) {
                System.out.print("Error : " + e);
                take_input.nextLine();
            }
        } while (!(user_choice == 1 || user_choice == 2));
        
        flag = (user_choice == 1);
        
        if(flag) {
            System.out.print("\n\tSo, You won the toss and choose to bat first\n\t");
        } else {
            System.out.print("\n\tSo, Yout won the toss and choose to bowl first\n\t");
        }
        
        return flag;
        
    }
    
    // Returns true if the user wants to do batting
    static boolean OppoBatOrNot() {

        Random AI_choice = new Random();
        
        int user_choice = (AI_choice.nextInt(2) + 1);
        
        boolean flag = (user_choice == 1);
        
        if(flag) {
            System.out.print("\n\tSo, You loose the toss and opponent choose to bat first\n\t");
        } else {
            System.out.print("\n\tSo, You loose the toss and opponent choose to bowl first\n\t");
        }
        
        return !flag;
        
    }

}
