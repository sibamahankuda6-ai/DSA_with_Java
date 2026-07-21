import java.util.*;
public class practice_2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the side of square:");
    float side = sc.nextFloat();
    float area = side*side;
    System.out.println("the area of square id: " + area);
    sc.close();
}
}
