package HandCricketInJava;

import java.util.Random;

public class PlayerBatSecond {
    int TotalRun, BallsLeft, WicketsLeft, Target; 
    
    void ShowScoreBoard(int NumberOfBowls, int NumberOfWickets){
        
        System.out.print("-----------------------------------------------------------------------------------\n");
        System.out.print(" >>>\tSCOREBOARD\n");
        System.out.println(" >>> "+TotalRun+"/"+(NumberOfWickets-WicketsLeft));
        System.out.println(" >>> "+(int)((NumberOfBowls-BallsLeft)/6)+"."+((NumberOfBowls-BallsLeft)%6)+" Overs");
        System.out.println(" >>> "+BallsLeft+" Balls Left");
        System.out.println(" >>> "+WicketsLeft+" Wickets Left");
        if(NumberOfBowls != BallsLeft)
            System.out.println(" >>> "+(6*TotalRun)/(NumberOfBowls-BallsLeft)+" Runs/Over");
        System.out.println(" >>> "+(Target-TotalRun)+" Runs Needed");
        System.out.print("-----------------------------------------------------------------------------------\n");

    }
    
    boolean DoBatSecond(int NumberOfBowls, int NumberOfWickets, int target){
        int user_shot, opponent_shot;
        Random rand = new Random();
        TotalRun = 0;
        BallsLeft = NumberOfBowls;
        WicketsLeft = NumberOfWickets;
        this.Target = target;
        System.out.println("\n\nWelcome to batting mode.");
        //System.out.println(NumberOfBowls+" "+WicketsLeft);
        while(WicketsLeft > 0 && BallsLeft > 0 && TotalRun < Target){
            ShowScoreBoard(NumberOfBowls, NumberOfWickets);
            System.out.print("Enter your shot >> ");
            user_shot = InputValidator.TakeValidIntAssistMode(1 , 6);
            opponent_shot = rand.nextInt(6) + 1;
            System.out.println("\tOpponets Shot >> "+opponent_shot);
            if(user_shot == opponent_shot){
                System.out.println("\n\tAlas! OPPONENT GOT an WICKET!");
                WicketsLeft--;
            }
            else{
                TotalRun += user_shot;
            }
            BallsLeft--;
        }
        boolean isWin = (TotalRun >= target) ;
        if(isWin){
            System.out.println("  >>>  CONGRATULATIONS!!! You Have WON the GAME!\n");
        } 
        else {
            System.out.println("  >>>  ALAS!!! You Have LOST the GAME!\n");
        }
        return isWin;
    }
}
