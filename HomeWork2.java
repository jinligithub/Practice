//C_Java面向对象上-作业 未完成 
//1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。 

//2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。 

//3.一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字(从第三个数字起)
//都是前两个数字的和。创建一个方法，接受一个整数参数，
//并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
//例如，如果运行 java Fibonacci 5(Fibonacci为类名)，那么输出应该是1、1、2、3、5。 

//4.创建一个带默认构造方法（即无参构造）的类，在构造方法中打印一条消息"Hello Constructor";
//再为这个类添加一个重载构造方法，令其接收一个字符串参数，
//并在这个有参构造方法中把"Hello Constructor"和接收的参数一起打印出来。 
import java.util.Scanner;
class Test1{
    public char sex;
    public String name;
    public int age;
    public void school(){
        System.out.println(this.name+"上学");
    }
}
class Test2{
    public String  ch;
    public String  ch2;
    public Test2(){
        ch="hello";
    }
    public Test2(String ch2){
        this.ch2=ch2;
    }
}
public class HomeWork2{
    public static void main(String[] args){
        Test2 a = new Test2();
        a.ch2="Hello world";

        System.out.println(a.ch);
        System.out.println(a.ch2);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static void Test1(){
        Test1 test=new Test1();
        test.sex='g';
        test.age=19;
        test.school();
        System.out.println(test.name);
        System.out.println(test.age);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    public static void Test(){
        Test2 a = new Test2();
        System.out.println(a.ch);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //斐波那契数
    public static int Fibonacci(int x){
            int a=1;
            int b=0;
            int c=0;
            while(x>0){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+"\t");
                x--;
            }
            return 0;
    }
}