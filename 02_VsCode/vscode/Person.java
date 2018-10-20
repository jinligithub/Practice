import java.util.Scanner;


public class Person{
    public static void main(String[] agrs){

    }
    public void PrivateTest(){
        Student stu1=new Student();
        stu1.getStudentInfo("fangtao",99);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//对private 的实现的封装处理，private对应的属性要写对应的getter,setter
class Student{
    private String name;
    private int age;
    //public String sex;
    //public static String school;
    public void setname(String n){
        name=n;
    }
    public String getname(String n){
        return name;//返回本类定义的该属性
    }
    public void setage(int a){
        if(a>0&&a<100){//判定年龄是否符合要求 
            age=a;
        }else{
            age=0;
        }
    }public int getage(int a){
        return age;
    }
    public void getStudentInfo(String name,int age){
        System.out.println("姓名："+name+"年龄："+age);
    }
}
/////////////////////////////////////////////////////////////////////////////////////////
