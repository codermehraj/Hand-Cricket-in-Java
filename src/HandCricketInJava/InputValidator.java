
package HandCricketInJava;

import java.util.Scanner;

// This class can handle I/O
public class InputValidator {
    
   
    
    
    // Returns an integer between u to v
    static int TakeValidInt(int u, int v){
        
        Scanner inpt = new Scanner(System.in);
        int x = u-1;
        
        do{
            try{
                x = inpt.nextInt();
            } catch (Exception e) {
                inpt.nextLine();
            }
        }while(!(u <= x && v >= x));
        
        return x;
    }
    
    static int TakeValidIntAssistMode(int u, int v){
        
        Scanner inpt = new Scanner(System.in);
        int x = u-1;
        boolean flag = false;
        System.out.print("\n\tEnter a number between "+u+" and "+v+" :: ");
        
        do{
            if(flag) {
                System.out.print("\n\t INVALID INPUT\n\t");
                System.out.print("You must enter a number between "+u+" and "+v+".\n");
                System.out.print("\tEnter again : ");

            }
            flag = true;
            try{
                x = inpt.nextInt();
            } catch (Exception e) {
                inpt.nextLine();
            }
        }while(!(u <= x && v >= x));
        
        return x;
    }
    
}
