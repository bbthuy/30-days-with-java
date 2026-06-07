public class QLSV{
    public static void main (String[] args){
        Student a = new Student("Bui Bich Thuy", 20, 4.0);
        Course c = new Course("Java", 3, "David");
        Teacher t = new Teacher("David", "Java", 10);
        a.introduce();
        c.getInfo();
        t.teach(c);
    }
}