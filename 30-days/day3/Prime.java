import java.util.Scanner;

public class Prime{
    //Nhập vào số nguyên dương, in ra yes nếu đó là số nguyên tố

    static boolean isPrime(int n){
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = sc.nextInt();
        if (n <= 1) System.out.println("NO");
        else if(isPrime(n)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}