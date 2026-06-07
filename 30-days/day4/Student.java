public class Student{
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()) 
            this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 0) 
            this.age = age;
    }

    public double getGpa(){
        return age;
    }

    public void setGpa(double gpa){
        if (gpa >= 0.0 && gpa <= 4.0)
            this.gpa = gpa;
    }

    public void introduce(){
        System.out.println("Sinh vien: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Diem: " + gpa);
    }
}