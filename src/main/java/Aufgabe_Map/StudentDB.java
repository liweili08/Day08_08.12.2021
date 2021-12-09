package Aufgabe_Map;

import java.util.Arrays;

public class StudentDB {

     Student[] studentArray;

    //Constructor
    public StudentDB(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    //Methoden:
    //Getter & Setter (da die Variable studentArray private ist)
//    public Student[] getStudentArray() {
//        return studentArray;
//    }
//
//    public void setStudentArray(Student[] studentArray) {
//        this.studentArray = studentArray;
//    }

    //list-Methode:gibt alle Studenten zurück
//    public void toList(Student[] array1) {
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
//    }

//    public Student toList() {
//        for (int i = 0; i < this.studentArray.length; i++) {
//            return this.studentArray[i];       };
//        return ;
//    }

    //Methode: toString: gibt alle Studenten formatiert als String zurück
    //vom IntelliJ hergestellt
//    @Override
//    public String toString() {
//        return "StudentDB{" +
//                "studentArray=" + Arrays.toString(studentArray) +
//                '}';
//    }


    @Override
    public String toString() {
        //Student[] listArray = this.studentArray; //new String[studentsArray.length];
        String studentInfo = " ";
        for (int i = 0; i < this.studentArray.length; i++) {
            studentInfo += this.studentArray[i].toString();
                    //"Name: " + this.studentArray[i].name + ", Id:" + this.studentArray[i].studentId + ", Alte:" +
                    //this.studentArray[i].alt +"/n";
        }
        //System.out.println(studentInfo);
        return studentInfo;
    }

//Methode randomStudent: gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())
public void randomStudent() {
    int randomIndex = (int) (Math.random() * (this.studentArray.length - 1 + 1) + 1);
    System.out.println("Die " + (randomIndex + 1) + "-te Student ist: " + this.studentArray[randomIndex]);
}

//    public void randomStudent(Student[] stuArray) {
//        int randomIndex = (int) (Math.random() * (stuArray.length - 1 + 1) + 1);
//        System.out.println("Die " + (randomIndex + 1) + "-te Student ist: " + stuArray[randomIndex]);
//    }

}

