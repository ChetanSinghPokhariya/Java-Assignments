import java.util.*;
public class LeapeepYear {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if (year%4 !=0){
            System.out.println("Not a leap year!");
        }
        else if (year%100!=0) {
            System.out.println("Its a leap year");
            
        }
        else if (year%400==0) {
            System.out.println("Its a Leap Year!");
            
        }
        else{
            System.out.println("Not a Leap Year!");
        }
    }
}