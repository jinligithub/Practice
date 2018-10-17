import java.util.Scanner;
// class Person{
//     public String name;
//     public int age;
//     public void eat(){
//         System.out.println(this.name+"吃饭");
//     }
//     public void sleep(){
//         System.out.println(this.name+"睡觉");
//     }
//     public void work(){
//         if(this.age<22){
//             System.out.println("还在上学");
//         }else{
//             System.out.println(this.name+"工作");
//         }
//     }
// }
// public class Dep{
//     public static void main (String[] args){
//        //////////////////////////////////////////////////////////////////////////////////
//         // //字符与数字的转换
//         // char c='A';
//         // int num=c;
//         // int num1=c+32;//char+int = int
//         // System.out.println(num);//输出65,A的ascii的值
//         // System.out.println(num1);//输出97,a的ascii的值
//         // char d=(char)num1;
//         // System.out.println(d);//输出a
        
//         ///////////////////////////////////////////////////////////////////////////////
//         // //字符串的连接String
//         // String ch1="abc";
//         // String ch2="ABC";
//         // String ch=ch1+ch2;
//         // System.out.println(ch);

//         ///////////////////////////////////////////////////////////////////////////////////
//         //定义类
//         Person per1= new Person();
//         per1.name="AAA";
//         per1.age= 20;
//         per1.eat();
//         per1.sleep();
//         per1.work();

//     }
// }


///////////////////////////////////////////////////////////////////////////////////////////
//Java//运算符

public class Dep{
    public static void main(String[] args){
 ///////////////////////////////////////////////////////////////////////////////////////////
 //自增自减（++x,x--）
    //   int x1=3;
    //   int x2=3;
    //   int y=4;
    //   int result1= x1++*y;//先执行x*y=12,在执行x++
    //   int result2= ++x2*y;//先执行x++,在执行x*y=12
    //   System.out.println(x1);//4,先执行，在加加
    //   System.out.println(x2);//4，先加加，在执行
    //   System.out.println(result1);//12
    //   System.out.println(result2);//16
////////////////////////////////////////////////////////////////////////////////////////
//三目运算符
        // int x=3;
        // int y=4;
        // int z=x>y?x+y:x-y;//x>y为假，执行3-4=-1
        // System.out.println(z);//-1
/////////////////////////////////////////////////////////////////////////////////////////
//关系运算符
//可以直接将数字和字符串判断
        //    char a = '哈';
        //    int num = 12;
        //    System.out.println(a>num);//返回ture
////////////////////////////////////////////////////////////////////////////////////////////
//逻辑运算符
//“|”：多个表达式都要判断，“||”：只要有表达式返回true，剩下的条件就不要在判断了
    //         if(1<2|10/0==0){
    //             System.out.println("满足条件");
    //         }else{
    //             System.out.println("不满足条件");
    //         }
    //     输出： Exception in thread "main" java.lang.ArithmeticException: / by zero at Dep.main(Dep.java:81)
    //     if(1<2||10/0==0){
    //         System.out.println("满足条件");
    //     }else{
    //         System.out.println("不满足条件");
    //    }
    //    输出：满足条件
////////////////////////////////////////////////////////////////////////////////////////////////
//位运算
        //     System.out.println(2&8);//0   &一假则假
        //     System.out.println(2|8);//10  |一真则真
        // //>>除（右移）   <<乘（左移）
        //     System.out.println(2>>1);//1  2/1右移是除法
        //     System.out.println(2<<1);//4  2*2^1左移是乘法
        //     System.out.println(2>>4);//0  2/4
        //     System.out.println(2<<4);//32  2*2^4
//////////////////////////////////////////////////////////////////////////////////////////////////

    }
}