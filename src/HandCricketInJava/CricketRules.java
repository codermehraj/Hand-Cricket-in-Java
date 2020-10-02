
package HandCricketInJava;

import java.util.Scanner;

public class CricketRules {
    
    int NumberOfWickets=0, NumberOfBowls=0;
    
    void SetRules(){
        
        System.out.print("\n\n\tHow many wickets do you want : ");
        NumberOfWickets = InputValidator.TakeValidIntAssistMode(1,10);
        
        System.out.print("\n\n\tHow many Bowls do you want : ");
        NumberOfBowls = InputValidator.TakeValidIntAssistMode(6,600);
        
    }
    
}
