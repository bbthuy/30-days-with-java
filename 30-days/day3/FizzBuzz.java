import java.util.Scanner;

// Đề bài: Cho một số nguyên dương n.
// In ra các số từ 1 đến n theo quy tắc:
// Nếu số chia hết cho 3, in "Fizz"
// Nếu số chia hết cho 5, in "Buzz"
// Nếu số chia hết cho cả 3 và 5, in "FizzBuzz"
// Ngược lại in chính số đó
// Mỗi kết quả nằm trên một dòng.

public class FizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }
}