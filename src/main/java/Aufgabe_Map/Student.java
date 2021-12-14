package Aufgabe_Map;

import java.security.Permission;
import java.security.PermissionCollection;
import java.util.Enumeration;

public class Student extends PermissionCollection {
     String name;
     Integer studentId;
     int alt;

    //Constructor


    public Student() {
    }

    @Override
    public void add(Permission permission) {

    }

    @Override
    public boolean implies(Permission permission) {
        return false;
    }

    @Override
    public Enumeration<Permission> elements() {
        return null;
    }

    public Student(String name, int studentId, int alt) {
        this.name = name;
        this.studentId = studentId;
        this.alt = alt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Id: "  + studentId + ",gi Alte: " + alt;
    }
}
