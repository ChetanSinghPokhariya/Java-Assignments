import java.util.Scanner;
public class costOfItems {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Price of pencil: ");
        float pencil=sc.nextFloat();
        System.out.print("Price of pen: ");
        float pen=sc.nextFloat();
        System.out.print("Price of eraser: ");
        float eraser=sc.nextFloat();
        float total=0.18f*(pen+pencil+eraser)+ pen+pencil+eraser;
        System.out.println("Total cost of 3 items after GST: "+total);
    


    }
}
