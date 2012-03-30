package org.cse.springtute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.lang.Exception;

public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    @Override
    public void saveStudent(Student stu) throws Exception {
        if (studentsDb.containsKey(stu.getRegNumber())) {
            throw new Exception();
        } else {
            studentsDb.put(stu.getRegNumber(), stu);
        }

    }

    @Override
    public void deleteStudent(Student stu) throws Exception {
        if (studentsDb.containsKey(stu.getRegNumber())) {
            studentsDb.remove(stu.getRegNumber());
        } else {
            throw new Exception();
        }

    }

    @Override
    public Student findStudent(long regNumber) {
        return studentsDb.get(regNumber);
    }

    @Override
    public void updateStudent(Student stu)throws Exception {
        if (studentsDb.containsKey(stu.getRegNumber())) {
        studentsDb.put(stu.getRegNumber(), stu);
        } else {
            throw new Exception();
        }

    }

    @Override
    public List<Student> findAllStudents() {
        List students = new ArrayList();
        students.addAll(studentsDb.values());
        return students;

    }
}
