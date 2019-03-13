package com.software_development_practice;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Component;  
import  com.software_development_practice.StudentMapper;  
import com.software_development_practice.Student;; 
public class StudentDaoImpl implements StudentDao {

    @Autowired  
    private StudentMapper studentMapper;  
    @Override  
    public Student findStudentById(int id) {  
        Student student = studentMapper.selectStudentById(id);  
         return student;   
    } 
}
