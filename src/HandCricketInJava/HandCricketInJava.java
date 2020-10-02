package HandCricketInJava;

import java.util.Scanner;
import HandCricketInJava.CricketRules;

public class HandCricketInJava {

    public static void main(String[] args) {
        
        Scanner inpt = new Scanner(System.in);
        
        System.out.print("\n\n\tWelcome to the hand cricket game\n\n\t");
        System.out.print("Press enter to continue...");
        inpt.nextLine();
        
        boolean isTossWin = InitiateToss.doToss();
        boolean isPlayerBatting, isPlayerWin;
        
        if(isTossWin) isPlayerBatting = ChosseBatOrNot.BatOrNot();
        else isPlayerBatting = ChosseBatOrNot.OppoBatOrNot();
        
        CricketRules rules = new CricketRules();
        rules.SetRules();
        
        if(isPlayerBatting){
            // Do batting
            PlayerBatFirst batFirst = new PlayerBatFirst();
            int target = batFirst.DoBatFirst(rules.NumberOfBowls, rules.NumberOfWickets);
            // Then do bowling
            PlayerBowlSecond ballSecond = new PlayerBowlSecond();
            isPlayerWin = ballSecond.DoBowlSecond(rules.NumberOfBowls,rules.NumberOfWickets,target);
        }
        else {
            // Do bowling
            PlayerBallFirst ballFirst = new PlayerBallFirst();
            int target = ballFirst.DoBallFirst(rules.NumberOfBowls, rules.NumberOfWickets);
            // Then do batting
            PlayerBatSecond batSecond = new PlayerBatSecond();
            isPlayerWin = batSecond.DoBatSecond(rules.NumberOfBowls,rules.NumberOfWickets,target);
        }
        
        System.out.println("\n\tTHANKS A LOT FOR PLAYING THIS SIMPLE LAME GAME");
        System.out.println("\n\tAny advice : codermehraj@gmail.com\n");
        inpt.nextLine(); 
    }
    
}
