public class Teacher{
    private String name;
    private String subject;
    private int yearsExp;

    public Teacher(String name, String subject, int yearsExp) {
        this.name = name;
        this.subject = subject;
        this.yearsExp = yearsExp;
    }
    
    public void teach(Course c){
        System.out.println("Giang vien " + name + " co " + yearsExp + " nam kinh nghiem, dang day khoa hoc " + c.getCourseName());
    }
}