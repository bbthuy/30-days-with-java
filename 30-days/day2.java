public class MathUtils{
    static int cong(int a, int b){
        return a + b;
    }

    static int tru(int a, int b){
        return a - b;
    }

    static int max(int a, int b){
        if (a < b) return b;
        return a;
    }

    static int min(int a, int b){
        if (a < b) return a;
        return b;
    }

    static boolean laChan(int a){
        return a % 2 == 0;
    }

    public static void main(String[] args){
        System.out.println(cong(3,5));
        System.out.println(tru(10, 3));     // 7
        System.out.println(max(5, 9));      // 9
        System.out.println(min(5, 9));      // 5
        System.out.println(laChan(4));    // true
        System.out.println(laChan(7));    //false
    }
    
}