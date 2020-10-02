package HandCricketInJava;

import java.util.Scanner;
import java.util.Random;

public class InitiateToss {

    // returns true if the player wins the toss
    static boolean doToss() {

        Scanner take_toss = new Scanner(System.in);
        int user_choice = 0, the_real_toss;
        boolean flag = false;

        System.out.print("\n\n\tPress 1 for head and press 2 for tail\n\n\t");

        do {
            if (flag) {
                System.out.print("\n\tInvalid Choice\n\tYou must enter 1 or 2\n\t");
            }
            flag = true;
            try{
                System.out.print("Enter your choice... ");
                user_choice = (int) take_toss.nextInt();
            } catch (Exception e){
                 System.out.println("ERROR : "+e);
                 take_toss.nextLine();
            }
            
        } while (!(user_choice == 1 || user_choice == 2));

        Random rand = new Random();
        the_real_toss = rand.nextInt(2) + 1;

        flag = (the_real_toss == user_choice);

        if (flag) {
            System.out.print("\n\tCongratulations! You have won the toss.\n\n");
        } else {
            System.out.print("\n\tAlas! You have loose the toss");
        }

        return flag;

    }

}
