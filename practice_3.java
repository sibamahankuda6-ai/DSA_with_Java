import java.util.*;
public class practice_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pencil cost:");
        float pencil = sc.nextFloat();
        System.out.println("enter the pen cost:");
        float pen = sc.nextFloat();
        System.out.println("enter the eraser cost");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        float gst = total*0.18f;
        float finalBill = total + gst;

        System.out.println("total cost: " + total);
        System.out.println("gst: " + gst);
        System.out.println("final bill: " + finalBill);
        sc.close();
    }
}
