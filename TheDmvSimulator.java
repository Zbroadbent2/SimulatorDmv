import java.util.Random;

public class TheDmvSimulator {
    public static void main(String args[]) {
        System.out.println("Welcome to the DMV!");

        Random random = new Random();
        int userNumber = random.nextInt(200) + 1;

        System.out.println("Your number is " + userNumber + ". Please wait until your number is called.");
        
        for (int i = userNumber + 1; i <= 200; i++) {
            System.out.println("Calling number " + i);
        }
        for (int i = 1; i < userNumber; i++) {
        } 

        System.out.println("Calling number " + userNumber);
        System.out.println("You did not come prepared! GO BACK HOME AND WAIT 5 MORE HOURS!!!  AHHAHAHA HAHAHAHA ");
    }
}