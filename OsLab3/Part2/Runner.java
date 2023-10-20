package Part2;

public class Runner {
    
    public static void main(String[] args) {
            
            SharedScreen sharedObj = new SharedScreen();
            msg1 T1 = new msg1(sharedObj, "My");
            msg2 T2 = new msg2(sharedObj, "Name");
            msg3 T3 = new msg3(sharedObj, "Is");
            msg4 T4 = new msg4(sharedObj, "Ben");
            
            T1.start();
            T2.start();
            T3.start();
            T4.start();
    }
}
