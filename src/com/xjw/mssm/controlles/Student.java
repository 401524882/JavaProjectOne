package com.xjw.mssm.controlles;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xjw
 * @date 2018/11/5-22:04
 */
public class Student {
    private String stuName;

    public Student(String stuName) {
        this.stuName = stuName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public static void main(String[] args) {

        //region 测试C#相同的功能
        List<Student> students = new ArrayList<>();
        Student stu = new Student("王八蛋");
        students.add(stu);
        for (Student item : students
                ) {
            System.out.println(item.getStuName());
        }
        //endregion

    }
}
