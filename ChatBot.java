import java.util.*;
public class ChatBot{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chatbot : Hello! How can I Help you?");
        System.out.println("Type 'bye' to exit.");
        while(true){
            System.out.print("You : ");
            String input = sc.nextLine().toLowerCase();
            if(input.contains("hello") || input.contains("hi")){
                System.out.println("Bot : Hello! Nice to Meet you.");
            }
            else if(input.contains("name")){
                System.out.println("Bot : My name is ChatBot.");
            }
            else if(input.contains("how are you?")){
                System.out.println("Bot : I am Fine. How are You?");
            }
            else if(input.contains("help")){
                System.out.println("Chatbot : Sure! How can I help you?");
            }
            else if(input.contains("bye")){
                System.out.println("GoodBye! Have a Nice Day.");
                break;
                
            }
            else{
                System.out.println("Sorry, I couldn't Understand.");
            }
        }
    }
}