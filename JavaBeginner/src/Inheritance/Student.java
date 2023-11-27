package Inheritance;

public class Student extends Person{

    private String college;
    private String studies;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    @Override
    public String toString(){
        return super.toString() + college + " " + studies ;
    }
}
