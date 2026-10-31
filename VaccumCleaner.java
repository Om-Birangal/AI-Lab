import java.util.Scanner;
public class VaccumCleaner{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String A = "Dirty";
        String B = "Dirty";
        System.out.print("Enter location : (A/B) : ");
        char location = sc.next().charAt(0);

        while(A.equals("Dirty") || B.equals("Dirty")){
            if(location == 'A'){
                if(A.equals("Dirty")){
                    System.out.println("Room A is Dirty - Suck");
                    A = "Clean";
                }
                else{
                    System.out.println("Room A is Clean, Move to Right.");
                    location = 'B';
                }
            }
            else{
                if(B.equals("Dirty")){
                    System.out.println("Room B is Dirty - Suck");
                    B = "Clean";
                    }
                else{
                    System.out.println("Room B is Clean, Move to Left.");
                    location = 'A';
                }
            }
        }
            System.out.println("Both Rooms are Clean.");
            sc.close();
    }
}