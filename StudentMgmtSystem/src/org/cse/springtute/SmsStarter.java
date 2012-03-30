package org.cse.springtute;

import org.springframework.context.support.*;

public class SmsStarter {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();

        StudentManagementSystem sms = (StudentManagementSystem) context.getBean("sms1");
        Student stdnt1 = (Student) context.getBean("s1");
        Student stdnt2 = (Student) context.getBean("s2");

        sms.registerStudent(stdnt1);

        System.out.println("---Previous List---");
        sms.listAllStudents();
        //load the bean from spring
        System.out.println("");
        System.out.println("---Final List---");
        sms.registerStudent(stdnt2);
        sms.listAllStudents();
    }
}
