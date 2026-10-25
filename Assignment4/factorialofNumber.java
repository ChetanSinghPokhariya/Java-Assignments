import java.util.*;
public class factorialofNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact=1;
        for(int i = num;i>0;i--){
            fact*=i;
        }
        System.out.print("factorial of "+ num+ " is: "+fact);

    }
}