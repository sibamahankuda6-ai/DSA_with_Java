import java.util.*;
public class Patterns {
    public static void holloRectangle(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(j==1 || j==c || i==1 || i==r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_Rotated_Half_Pyramid(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void floyd_triangle(int r){
        int counter = 1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }


     public static void zero_one_triangle(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }

     public static void butterfly_pattern(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(r-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(r-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void solid_rhombus(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }


     public static void hollow_rhombus(int r){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                for(int k=1;k<=r;k++){
                if(j==1 || j==r ||k==1 || k==r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                }
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r = sc.nextInt();
        // System.out.println("enter the number of columns:");
        // int c = sc.nextInt();
        // holloRectangle(r, c);

       inverted_Rotated_Half_Pyramid(r);
       inverted_half_pyramid_with_numbers(r);
       floyd_triangle(r);
       zero_one_triangle(r);
       butterfly_pattern(r);
       solid_rhombus(r);
       hollow_rhombus(r);
    }
}
