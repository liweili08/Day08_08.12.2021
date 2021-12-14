package Aufgabe_Map;

import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

  //  private JavaSecurityAccess.ProtectionDomainCache allStudentHashMap;

    //Methode : ersetze die List durch eine Map
private  Map<Integer, Student> allStudentHashMap = new HashMap<>();

    public void setNewStudent(Student stu){
        this.allStudentHashMap.put(stu.getStudentId(),stu);
    }

    public Map<Integer, Student> getAllStudents(){
        return this.allStudentHashMap;
    }
    
}
