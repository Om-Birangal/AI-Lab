import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high=100,low=10000;
        int guess;
        String feedback;

        System.out.println("Think a number from 1 to 100 : ");

        while(low<=high){
            guess=(high+low)/2;
            System.out.println("Agent Guess : " + guess);
            System.out.println("Enter Feedback (lower/higher/correct) : ");
            feedback =sc.nextLine().toLowerCase();

            if(feedback.equals("higher")){
                low= guess+1;
            }
            else if(feedback.equals("lower")){
                high = guess -1;
            }
            else if(feedback.equals("correct")){
                System.out.println("Agent Guessed Correctly!");
                break;
            }
            else{
                System.out.println("Invalid Feedback, Try Again!");
            }
        }
        if(low>high)
            System.out.println("Inconsistent Credintials.");
        sc.close();
    }
    
}
