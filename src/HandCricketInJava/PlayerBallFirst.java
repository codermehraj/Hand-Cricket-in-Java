package HandCricketInJava;

import java.util.Random;

public class PlayerBallFirst {
    int TotalRun, BallsLeft, WicketsLeft; 
    
    void ShowScoreBoard(int NumberOfBowls, int NumberOfWickets){
        
        System.out.print("-----------------------------------------------------------------------------------\n");
        System.out.print(" >>>\tSCOREBOARD\n");
        System.out.println(" >>> "+TotalRun+"/"+(NumberOfWickets-WicketsLeft));
        System.out.println(" >>> "+(int)((NumberOfBowls-BallsLeft)/6)+"."+((NumberOfBowls-BallsLeft)%6)+" Overs");
        System.out.println(" >>> "+BallsLeft+" Balls Left");
        System.out.println(" >>> "+WicketsLeft+" Wickets Left");
        if(NumberOfBowls != BallsLeft)
            System.out.println(" >>> "+(6*TotalRun)/(NumberOfBowls-BallsLeft)+" Runs/Over");
        System.out.print("-----------------------------------------------------------------------------------\n");

    }
    
    int DoBallFirst(int NumberOfBowls, int NumberOfWickets){
        int user_shot, opponent_shot;
        Random rand = new Random();
        TotalRun = 0;
        BallsLeft = NumberOfBowls;
        WicketsLeft = NumberOfWickets;
        System.out.println("\n\nWelcome to balling mode.");
        //System.out.println(NumberOfBowls+" "+WicketsLeft);
        while(WicketsLeft > 0 && BallsLeft > 0){
            ShowScoreBoard(NumberOfBowls, NumberOfWickets);
            System.out.print("Enter your shot >> ");
            user_shot = InputValidator.TakeValidIntAssistMode(1 , 6);
            opponent_shot = rand.nextInt(6) + 1;
            System.out.println("\tOpponets Shot >> "+opponent_shot);
            if(user_shot == opponent_shot){
                System.out.println("\n\tCongratulations! YOU GOT an WICKET!");
                WicketsLeft--;
            }
            else{
                TotalRun += opponent_shot;
            }
            BallsLeft--;
        }
        System.out.println("You Need "+TotalRun+" runs in "+NumberOfBowls+" Balls");
        return TotalRun;
    }
}
