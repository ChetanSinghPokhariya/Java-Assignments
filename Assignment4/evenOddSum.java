import java.util.*;
public class evenOddSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        for ( int i=1;i<=n;i++){
            System.out.print("Enter the "+ i + " number: ");
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+= num;
            }
        }
        System.out.println("Sum of odd numbers: "+ oddSum);
        System.out.println("Sum of even numbers: "+ evenSum);
    }
    
}
