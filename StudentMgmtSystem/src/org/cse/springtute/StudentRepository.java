package org.cse.springtute;

import java.util.List;

public interface StudentRepository {

	void saveStudent(Student stu)throws Exception ;

	void deleteStudent(Student stu)throws Exception ;

	Student findStudent(long regNumber);

	void updateStudent(Student stu);

	List<Student> findAllStudents();
}
