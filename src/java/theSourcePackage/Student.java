/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theSourcePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author I352015
 */
public class Student {

    public Student(int Id, String Name, String Country, String Email) {
        this.Id = Id;
        this.Name = Name;
        this.Country = Country;
        this.Email = Email;
    }
     private int Id;
    private String Name;
    private String Country;
    private String Email;
    
    
    public Student() {
    }
    
    public List<Student> getStudentList()
    {
        List<Student> listOfStudent = new ArrayList<Student>();
        
        listOfStudent.add(new Student(1, "Rice","Vietnam","Rice@gmail.com"));
        listOfStudent.add(new Student(2, "Bread","Hungary","Bread@gmail.com"));
        listOfStudent.add(new Student(3, "Monkey","Korean","Monkey@gmail.com"));
        listOfStudent.add(new Student(4, "Something","Germany","Something@gmail.com"));
        listOfStudent.add(new Student(5, "Somename","Finlandia","Somename@gmail.com"));
        listOfStudent.add(new Student(6, "DontKnow","Absinthe","DontKnow@gmail.com"));
        listOfStudent.add(new Student(7, "DontAskMe","Czech","DontAskMe@gmail.com"));
        listOfStudent.add(new Student(8, "Cool","China","Cool@gmail.com"));
        listOfStudent.add(new Student(9, "NotCool","Japan","NotCool@gmail.com"));
        listOfStudent.add(new Student(10, "YeahRice","Thailand","YeahRice@gmail.com"));

        return listOfStudent;
    }
    
    public static List<Student> generateRandomStudent(List<Student> lst, int n) 
    {
        List<Student> copy = new LinkedList<Student>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }
}
