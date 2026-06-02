import java.util.Scanner;

public class BasicCalculator {
    static double cong(double a, double b){
        return a+b;
    }

    static double tru(double a, double b){
        return a-b;
    }

    static double nhan(double a, double b){
        return a*b;
    }

    static public double chia(double a, double b){
        if(b==0) {
            System.out.println("Error");
            return 0;
        }
        return (double) a/b;
    }

    public static void main(String[] args){
        System.out.println("Calculator has been installed");
        // System.out.println(cong(5, 3));    
        // System.out.println(tru(10, 4));   
        // System.out.println(nhan(3, 7));     
        // System.out.println(chia(5.0, 2.0));
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất a = ");
        double a = sc.nextDouble();
        System.out.print("Nhập số thứ 2 b = ");
        double b = sc.nextDouble();
        System.out.println(cong(a, b));    
        System.out.println(tru(a, b));   
        System.out.println(nhan(a, b));     
        System.out.println(chia(a, b));
    }
}