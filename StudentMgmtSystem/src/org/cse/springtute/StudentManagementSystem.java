package org.cse.springtute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManagementSystem {

    private StudentRepository repo;

    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void listAllStudents() {
        List<Student> abc = repo.findAllStudents();
        Iterator it = abc.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.getRegNumber() + " " + s.getFirstName() + " " + s.getLastName());
        }
        //Get all the students from repository and print them in the screen
    }

    public void registerStudent(Student stu) {
        try {
            repo.saveStudent(stu);
            //Save the new student using repository
        } catch (Exception ex) {
            Logger.getLogger(StudentManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
