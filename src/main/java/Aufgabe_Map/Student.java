package Aufgabe_Map;

public class Student {
    public String name;
    public int studentId;

//    public String info(){
//        return "Id:"+ studentId + ", Name: "+ name;
//    }

    //Constructor
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "name='" + name + ", Id="  + studentId;
    }
}
