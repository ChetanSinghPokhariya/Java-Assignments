import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("you want table of ? :");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+" X " + i +" = "+mul);
        }

    }
}
