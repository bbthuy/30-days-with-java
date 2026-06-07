public class Course{
    private String courseName;
    private int credits;
    private String teacher;

    public Course(String courseName, int credits, String teacher){
        this.courseName = courseName;
        this.credits = credits;
        this.teacher = teacher;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        if (courseName != null && !courseName.isEmpty())
            this.courseName = courseName;
    }

    public int getCredits(){
        return credits;
    }

    public void setCredits(int credits){
        if (credits > 0)
            this.credits = credits;
    }

    public String getTeacher(){
        return teacher;
    }

    public void setTeacher(String teacher){
        if (teacher != null && !teacher.isEmpty())
            this.teacher = teacher;
    }

    public void getInfo(){
        System.out.println("Khoa hoc " + courseName + " gom " +  credits + " tin chi, GV " + teacher );
    }
}