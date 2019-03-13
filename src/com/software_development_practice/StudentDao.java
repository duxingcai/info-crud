package com.software_development_practice;

public interface StudentDao {
    /** 
     * 根据用户ID查询用户信息 
     * @param id 
     * @return 
     */  
    public Student findStudentById(int id);  
}
