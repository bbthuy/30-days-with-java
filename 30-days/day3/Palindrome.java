import java.util.Scanner;

public class Palindrom{
    //Kiểm tra có phải chuỗi đối xứng hay không
    //Cách 1: Dùng StringBuilder, thực thi chậm, độ phức tạp cao hơn, tốn bộ nhớ hơn
    static boolean isPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    //Cách 2: Dùng 2 con trỏ trái phải, nhanh và đỡ bộ nhớ
    static boolean isPalindrome1(String s){
        int left = 0; 
        int right = s.length() - 1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right--;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra doi xung: ");
        String s = sc.next();
        System.out.print("Ket qua kiem tra bang cach 1: " );
        if (isPalindrome(s)) System.out.println("YES");
        else System.out.println("NO");
        System.out.print("Ket qua kiem tra bang cach 2: " );
        if (isPalindrome1(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
