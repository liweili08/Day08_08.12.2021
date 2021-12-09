package Aufgabe_Map;

public class Main {
    public static void main(String[] args) {

        Student[] studentsArray1 = new Student[5];
        studentsArray1[0] = new Student("Anna", 2021001, 21);
        studentsArray1[1] = new Student("Benedikt", 2021002, 20);
        studentsArray1[2] = new Student("Christina", 2021003, 19);
        studentsArray1[3] = new Student("Daniel", 2021004, 18);
        studentsArray1[4] = new Student("Eberhard", 2021005, 22);
//        studentsArray1[5] = new Student("Felix", 2021006, 20);
//        studentsArray1[6] = new Student("Günter", 2021007, 21);
//        studentsArray1[7] = new Student("Hans", 2021008, 23);
//        studentsArray1[8] = new Student("Ivan", 2021009, 17);
//        studentsArray1[9] = new Student("Jessica", 2021010, 20);
//        studentsArray1[10] = new Student("Karl", 2021011, 24);


//        for (int i=0; i<5;i++){
//            System.out.println("Name '" + studentsArray1[i].name + ", Id: "  + studentsArray1[i].studentId
//                    + "Alte: " + studentsArray1[i].alt);
//        }


        System.out.println(studentsArray1[2].toString());

        System.out.println(studentsArray1.toString());

//studentsArray1.randomStudent();
       // System.out.println("Die Studenten Informationen :" + "/n" + studentInfo);
     //   studentsArray1.toList(studentsArray1);
//studentsArray1.randomStudent();


    }
}

