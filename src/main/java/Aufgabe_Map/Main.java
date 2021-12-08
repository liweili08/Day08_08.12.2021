package Aufgabe_Map;

public class Main {
    public static Student studentList;

    public static void main(String[] args) {
        studentList(11);
        for (int i = 0; i <11; i++) {
            System.out.println(studentList(11)[i]);
        }

        System.out.println("----------------------------------");
        // studentList.toString();

        // randomStudent();
        int randomIndex = (int)(Math.random()*10);
        System.out.println("Die "+(randomIndex+1)+"-te Student: " +studentList(11)[randomIndex]);

    }




    public static String[] studentList (int j){
        Student[] studentsArray = new Student[11];
        studentsArray[0] = new Student("Anna", 2021001);
        studentsArray[1] = new Student("Benedikt", 2021002);
        studentsArray[2] = new Student("Christina", 2021003);
        studentsArray[3] = new Student("Daniel", 2021004);
        studentsArray[4] = new Student("Eberhard", 2021005);
        studentsArray[5] = new Student("Felix", 2021006);
        studentsArray[6] = new Student("Günter", 2021007);
        studentsArray[7] = new Student("Hans", 2021008);
        studentsArray[8] = new Student("Ivan", 2021009);
        studentsArray[9] = new Student("Jessica", 2021010);
        studentsArray[10] = new Student("Karl", 2021011);

        String[] listArray = new String[studentsArray.length];
        for (int i = 0; i <studentsArray.length; i++) {
            listArray[i] =
                    ("Name: " + studentsArray[i].name + ", Id:" + studentsArray[i].studentId);
        }
        return listArray;
    }


//    public void randomStudent(){
//       int randomIndex = (int)(Math.random()*10);
//        System.out.println(""+studentList[randomIndex]);
//    }

}

