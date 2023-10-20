package Part3;

import java.util.Scanner;


public class Runner {
        public static void main(String[] args) {
            int userInput = 0;
            Scanner keyboard = new Scanner(System.in);
            SharedScreen sharedObj = new SharedScreen();

            msg T1 = new msg(sharedObj, "My");
            msg T2 = new msg(sharedObj, "Name");
            
        
            T1.start();
            T2.start();
            int flag = 0;
            while(flag != -1)
            {
                int input = sharedObj.userMessage("Enter 1 to terminate: ");
                if(input == 1)
                {
                    sharedObj.terminate();
                    flag = -1;
                }
            }
            
    }
}

