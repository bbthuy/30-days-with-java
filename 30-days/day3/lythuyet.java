public class LyThuyet {

    public static void main (String[] args){
        // IF ELSE: Java đánh giá điều kiện theo thứ tự từ trên xuống và dừng ngay khi gặp 
        // điều kiện đầu tiên là true. Các nhánh phía dưới không bao giờ được kiểm tra nữa.
        int score = 75;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 75) {
            System.out.println("B");  // ← dừng tại đây
        } else if (score >= 60) {
            System.out.println("C");  // không bao giờ chạy
        } else {
            System.out.println("F");
        } 

        // SWITCH: switch phù hợp khi bạn so sánh một biến với nhiều giá trị cố định (không 
        // phải khoảng). Ưu điểm: dễ đọc hơn, Java có thể tối ưu hóa tốt hơn.

        int day = 3;
        switch (day) {
            case 1: System.out.println("Thứ Hai"); break;
            case 2: System.out.println("Thứ Ba");  break;
            case 3: System.out.println("Thứ Tư");  break;
            default: System.out.println("Khác");
        }
        // Quên break → fall-through: code sẽ tiếp tục chạy xuống case tiếp theo dù không khớp.

        // FOR: dùng for khi bạn biết trước số lần lặp
        // WHILE: kiểm tra điều kiện trước khi chạy body
        // DO WHILE: chạy body ít nhất 1 lần trước khi kiểm tra
        // BREAK; CONTINUE
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue; // bỏ qua i=3, nhảy thẳng lên i++
            if (i == 7) break;    // thoát vòng lặp hoàn toàn
            System.out.print(i + " "); // in: 0 1 2 4 5 6
        }
        

        // ARRAY: Array là một dãy ô nhớ liền nhau, cùng kiểu dữ liệu.
        int[] scores = {85, 92, 78, 96, 88};
        System.out.println(scores[0]);  // 85 (index bắt đầu từ 0)
        System.out.println(scores.length); // 5
        // Duyệt mảng bằng for-each (đọc gọn hơn)
        for (int s : scores) {
            System.out.print(s + " ");
        }
        // Duyệt bằng for thường (khi cần index)
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Vị trí " + i + ": " + scores[i]);
        }

        // STRING: String trong Java là object, không phải primitive. Và String 
        // là immutable — một khi tạo ra, giá trị không thể thay đổi
        String s = "Hello";
        // Các method cần nhớ
        s.length()              // 5
        s.charAt(0)             // 'H'
        s.toUpperCase()         // "HELLO"
        s.toLowerCase()         // "hello"
        s.contains("ell")       // true
        s.substring(1, 4)       // "ell" (từ index 1, đến trước 4)
        s.replace("l", "r")     // "Herro"
        s.trim()                // xóa khoảng trắng đầu/cuối
        s.split(",")            // tách thành String[]
        s.equals("Hello")      // true ← so sánh nội dung

        // STRINGBUILDER: StringBuilder là object mutable — nó giữ một buffer 
        // nội bộ và sửa trực tiếp vào đó.
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        sb.insert(5, ",");      // "Hello, World"
        sb.reverse();           // "dlroW ,olleH"
        sb.delete(0, 3);        // xóa từ index 0 đến trước 3
        String result = sb.toString(); // chuyển về String khi xong
    }
    // Quy tắc thực tế: dùng StringBuilder khi ghép chuỗi trong vòng lặp. 
    // Dùng + bình thường khi chỉ ghép vài chuỗi một lần.
}