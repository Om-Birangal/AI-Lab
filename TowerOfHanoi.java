import java.util.*;
public class TowerOfHanoi {
    static void solve(int n, char source,char auxillary,char destination){
        if(n==1){
            System.out.println("Move Disk 1 from "+source + " to " + destination);
            return;
        }
        solve(n-1,source,destination,auxillary);
        System.out.println("Move Disk " + n + " from " + source + " to " + destination);
        solve(n-1,auxillary,source,destination);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Disks : ");
        int n=sc.nextInt();
        System.out.println("Tower of Hanoi Solution : ");
        solve(n,'A','B','C');
        sc.close();
    }    
}