package org.example.java.lambda.chapter8;

public class Student {
    private String name;
    private int age;
    private String sex;
    private double dd;

    public Student(String name, int age, double dd){
        this.name  =  name;
        this.age = age;
        this.dd = dd;
    }
    public Student(String name, String sex, int age){
        this.name  =  name;
        this.sex = sex;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getDd(){
        return this.dd;
    }
    public String getSex(){
        return  sex;
    }
}
