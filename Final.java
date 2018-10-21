

//final修饰的类无法被继承，而且该类里的方法都被隐式的加上final关键字9(不包含成员变量)
final class Person{
    public int age=5;
}
class Student extends Person{
    public int age=10;
}
public class Super{
    public static void main(String[] arhs){
        System.out.println(new Student().age);//输出10，因为new 后边为Student，它对上边的属性进行了覆写
    }
}
//final修饰的方法部允许被覆写
final class Person{
    final public void fun(){}
}
class Student extends Person{
    public void fun(){}
}
public class Super{
    public static void main(String[] arhs){
        new Student();//输出10，因为new 后边为Student，它对上边的属性进行了覆写
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//final 修饰基本数据类型，属性被final修饰后改属性的值不可变，且要在声明时初始化
final class Person{
    //声明式初始化
    public final int a=5;
    //构造方法初始
    public final int a;

    public Person(){
        a=5;
    }
    //构造快初始
    public final int a;
{
    a=5;
}

}
class Student extends Person{
}
public class Super{
    public static void main(String[] arhs){
        new Student();//输出10，因为new 后边为Student，它对上边的属性进行了覆写
    }
}

////////////////////////////////////////////
class Person{
    public final int age1=5;//当对象产生时才给分配值（满。堆区）
    public static final int age2=5;//在类加载时 会进行编译器的优化，因为在类加载时他的值已经不能在改变了（块，静态全局区）
}
class Student extends Person{
    public int age=10;
}
public class Super{
    public static void main(String[] arhs){
        System.out.println(new Student().age);//输出10，因为new 后边为Student，它对上边的属性进行了覆写
    }
}


////////////////////////////////////////////////////////////////////////////
final
class Person{
    public String name="test";
    public int age=5;
}
class Student extends Person{
}
public class Super{
    public static void main(String[] arhs){
        final Person p=new Person();
        p.name="张三";
        p.age=16;
        System.out.println(p.name);//他们存在堆上可以变
        System.out.println(p.age);


        p=new Person();//把p的地址给了一块新空间是错的，因为当一个引用数据类型用final修饰表示栈里面存的堆内存的地址不可变
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////
//问下下边哪个语句是错的
//答：1.3.4是错的
public class Final{
   byte b1=1,b2=2,b3,b6,b8; 
   final byte b4=4,b5=6,b7=9; 
   public void test() {
        b3=(b1+b2);  /*语句1*/ 
          //byte,char,short,int 在做运算时都会变为int ,(b2+b1)为int，但是b3为byte,所以会有精度的损失，必须要强转
        b6=b4+b5;    /*语句2*/  
         //final修饰的常量不可变
        b8=(b1+b4);  /*语句3*/   
        //b4不可变
        b7=(b2+b5);  /*语句4*/ 
        //必须要强转，int 到 byte 要强转
    System.out.println(b3+b6);    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//向上转型
//父类 父类引用=new 子类（）;
class Person{
    public void fun(){
        System.out.println("我是Person");
    }
}
class Student extends Person{
    public void fun(){
        System.out.println("我是Student");
    }
}
public class Final{
    public static void main(String[] args){
        Student stu= new Student();
        stu.fun();
        //输出我是Student。被子类覆写的父类的方法
        Person per = new Student();
        per.fun();
        //输出我是Student。向上转型

    }
}
//////////////////////////////////////////////////////////////////////////////////////////////
// 向下转型，需要强制转换。要发生向下转型，必须先向上转型（如果没有向上转型，肯会发生运行时异常，ClassCastException）
// 子类 子类引用=（子类）父类对象
// Student 试图=（Student）Person
class Person{
    public void fun(){
        System.out.println("我是Person");
    }
}
class Student extends Person{
    public void fun(){
        System.out.println("我是Student");
    }
}
public class Final{
    public static void main(String[] args){
        Person per = new Student();
        Student stu = (Student) per;

        stu.fun();
        //输出我是Stident

    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// instanceof类，表示改引用能否指向该类实例，返回boolean
// per instanceof Student
class Person{
    public void fun(){
        System.out.println("我是Person");
    }
}
class Student extends Person{
    public void fun(){
        System.out.println("我是Student");
    }
}
public class Final{
     public static void main(String[] args){
    //     Person per = new Student();
    //  System.out.println(per instanceof Person);//true
    //  System.out.println(per instanceof Student);//true
    
    Person per = new Person();
    System.out.println(per instanceof Person);//true
    System.out.println(per instanceof Student);//flase
    }
}
// ///////////////////////////////////////////////////////////////////////////////////////////////////////
// 参数统一化
class Person{
    public void fun(){
        System.out.println("我是Person");
    }
}
class Student extends Person{
    public void fun(){
        System.out.println("我是Student");
    }
}
class Work extends Person{
    public void fun(){
        System.out.println("我是Work");
    }
}
class Teacher extends Person{
    public void fun(){
        System.out.println("我是Teacher");
    }
}
public class Final{
     public static void main(String[] args){
         //参数统一化，大量减少重复代码
         test(new Person());
         //向上转型
         test(new Student());
         test(new Work());
         test(new Teacher());
    }
    public static void test(Person per){//声明父类引用
        per.fun();
    }
}

class Outter{//外部类

    private String msg="outter中的msg";
    class Inner {//内部类

        public void fun(){
            System.out.println(msg);
        }
    }
    public void test(){
        Inner in =new Inner();
        in.fun();
    }
}
public class Final{
    public static void main(String[] args){
        Outter out= new Outter();
        out.test();//输出Outter中的msg,说明内部类可以访问外部类

    }
} 
///////////////////////////////////////////////////////////////////////////////
// 把内部类拿出来如何继续调用外部类里的方法
class Outter{//外部类
    private String msg="outter中的msg";
   public String getMsg(){
       return msg;
   }
    public void test(){//2.
        Inner in =new Inner(this);//3.说明并实例化一个Inner 对象，调用有参构造
        //this表示当前对象
        in.fun();
    }
}
class Inner {//内部类
    private Outter out;//4
    //构造注入
    public Inner(Outter out){
        this.out=out;
    }
    public void fun(){
        System.out.println(out.getMsg());//
    }
}
public class Final{
    public static void main(String[] args){
        Outter out= new Outter();//1.说明并实例化一个outter对象，调用系统的无参构造
        out.test();//输出Outter中的msg,  //2.

    }
} 
///////////////////////////////////////////////////////////////////////////////////////////
// 一个类如何继承多个类
class A{
    private String name="张三";
    public String getname(){
        return name;
    }
}
class B{
    private int age=10;
    public int getage(){
        return age;
    }
}
class C{
    class InnerClassA extends A{
        public String name(){
            return super.getname();
        }

    }
    class InnerClassB extends B{
        public int age (){
            return super.getage();
        }
    }
    public String name(){
        return new InnerClassA().name();
    }
    public int age(){
        return new InnerClassB().age();
    }
}
public class Final{
    public static void main(String[] args){
        C c=new C();
        System.out.println(c.name());
        System.out.println(c.age());

    }
}
//////////////////////////////////////////////////////////////////////
// 创建非静态类内部类
class Outter{//外部类
     private String msg="outter中的msg";
    class Inner {//内部类
       
        public void fun(){
            System.out.println(Outter.this.msg);//Outter.this表示当前外部类对象
        }
    }
}
public class Final{
     public static void main(String[] args){
         //创建Inner对象
         Outter.Inner in= new Outter().new Inner();//1.说明并实例化一个outter对象，调用系统的无参构造
            in.fun();//输出Outter中的msg,  //2.
    
    }
} 
//////////////////////////////////////////////////////////////////////

class Outter{//外部类
    private String msg="outter中的msg";
    //成员内部类，
    class Inner {
       public void fun(){
           System.out.println(Outter.this.msg);//Outter.this表示当前外部类对象
       }
   }
}
public class Final{
    public static void main(String[] args){
        //创建Inner对象
        Outter.Inner in= new Outter().new Inner();//1.说明并实例化一个outter对象，调用系统的无参构造
           in.fun();//输出Outter中的msg,  //2.
   
   }
} 

class Outter{//外部类
    private String msg="outter中的msg";
    //成员内部类，
    private  class Inner {
       public void fun(){
           System.out.println(msg);//Outter.this表示当前外部类对象
       }
   }
}
public class Final{
    public static void main(String[] args){
        new Outter();
        //创建Inner对象
        Outter.Inner in= new Outter.Inner();//直接产生内部类，，没有外部类产生
           in.fun();//输出Outter中的msg,  //2.
   
   }
} 