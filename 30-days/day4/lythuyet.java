public class LyThuyet{
    // Class: là một khuôn mẫu dùng để tạo ra các đối tượng; gồm thuộc tính (field) và phương thức (method)
    // Object: là thực thể cụ thể. Mỗi object có field riêng nhưng dùng chung method
    static class Student{
        // fields
        String name;
        int age;

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