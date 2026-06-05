import java.util.Scanner;

public class StarTriangle{
    //Nhập số dòng n, in ra hình tam giác sao n dòng
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}