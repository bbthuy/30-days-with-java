// KẾ THỪA -  Inheritance
// Tại sao kế thừa tồn tại?
// Giả sử bạn có Student và Teacher. Cả hai đều có name, age, introduce(). 
// Không có kế thừa → bạn viết trùng code. Kế thừa giải quyết: đặt phần chung vào lớp cha,
// lớp con chỉ viết phần riêng.

// extends — "kế thừa từ". Chỉ kế thừa được 1 class (Java không cho đa kế thừa class).
// super() — gọi constructor lớp cha. Phải là dòng đầu tiên trong constructor con.
// super.method() — gọi method lớp cha khi lớp con đã override.
// @Override — báo compiler "tôi đang ghi đè method cha". Không bắt buộc, nhưng giúp bắt lỗi.
class Person{
    private String name;
    private int age;

    Person (String name, int age){
        this.name = name;
        this.age = age
    }

    void introduce (){
        System.out.printl("Toi la " + name);
    }
}

class Student extends Person{
    private String major;

    Student (String name, int age, String major){
        super(name, age); // gọi constructor của Person
        this.major = major;
    }
}




