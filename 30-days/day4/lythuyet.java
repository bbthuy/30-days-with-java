public class LyThuyet{
    // Class: là một khuôn mẫu dùng để tạo ra các đối tượng; gồm thuộc tính (field) và phương thức (method)
    // Object: là thực thể cụ thể. Mỗi object có field riêng nhưng dùng chung method
    static class Student{
        // fields
        String name;
        private int age; // bên ngoài không đọc/ghi dữ liệu được
        // method
        void ThongTinSV(){
            System.out.println("Sinh vien: " + name + "\n" + "Tuoi: "  + age);
        }

        // Constructor — cửa vào của object. 
        // Chạy tự động khi new được gọi. Không có return type. Dùng để gán giá trị ban đầu cho fields.
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        // Encapsulation — đóng gói, bảo vệ dữ liệu
        // Khai báo field là private → bên ngoài không được sửa trực tiếp. 
        // Muốn truy cập phải qua method. Nhờ đó class kiểm soát được logic validation.
        public void setAge(int Age){
            if(age > 0) this.age = age;
        }

        // Getter & Setter — cổng ra vào có kiểm soát
        // Getter trả về giá trị. Setter nhận và kiểm tra trước khi gán. 
        public String getName(){
            return name;
        }
        public void setName (String name){
            if (name != null & !name.isEmpty()) this.name = name;
        }

    }
    // Tạo 2 object độc lập
    public static void main (String[] args){
        // Student a = new Student();
        Student b = new Student("bbthuy", 20);
        // a.name = "Thuy";
        // a.age = 18;
        // a.ThongTinSV();
        b.ThongTinSV();
    }
}