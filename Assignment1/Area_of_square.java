import java.util.*;

public class Area_of_square {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square: ");
        float side = sc.nextFloat();
        float area= side*side;
        System.out.println("Area of Square is: "+area);

    }
}
