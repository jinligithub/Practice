class Person{
    private String name;
    private int age;
    public Person(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println("姓名"+this.name+",年龄"+this.age);
    }
}
public class Array{
    public static void main(String[] args){
        //
        // Person[] per1=new Person[3];
        // per1[0]=new Person("张三",1);
        // per1[1]=new Person("李四",2);
        // per1[2]=new Person("王五",3);
        //对象数组静态初始化
        Person[] per2=new Person[]{
        new Person("张三",1),
        new Person("李四",2),
        new Person("王五",3)
    };
        for(int i=0;i<per2.length;i++){
            per2[i].getInfo();
        }
    }
    /////////////////////////////////////////////////////////////////////////
    //对象数组的初始化


    ////////////////////////////////////////////////////////////////////
    //数组与方法相互操作
    public static void Array1(){
     //第一种初始化方法
     int[] a4=Init();
     //第二种初始化方法
     int[] a5=new int[5];
     a5=Init();
     bigger(a5);
     PrintArray(a5);
    }
    public static void arraySort(){
        int[] intData = new int[]{1,0,9,5,8,3,54,6};
        char[] charData = new char[]{'c','a','p','h'};
        java.util.Arrays.sort(intData);
        java.util.Arrays.sort(charData);
        PrintArray(intData);

        PrintArray(charData);
    }
    public static void bigger(int[] temp){
        for(int i=0;i<temp.length;i++){
            temp[i]*=5;
        }
    }
    public static void ArrayCaoZuo(){

    }
    public static int[] Init(){
        return new int[]{1,2,3,4,5};
    }
    //返回数组的元素
    public static void PrintArray(char[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println();
    }
    public static void PrintArray(int[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println();
    }
    public static void ArrayShiXian(){
           //第一种定义数组方法
           int[] data1=new int[5];
           System.out.println(data1.length);
           //第二种,分步进行实例化
           int[] data2=null;
           data2 = new int[5];
           System.out.println(data2.length);
    }
    public static void ArrayYinYong(){
        int[] x =null;
        int[] temp = null;//声明对象
        x= new int[3];
        System.out.println(x.length);
        x[0]=1;
        x[1]=2;
        x[2]=3;
     for(int i=0;i<x.length;i++){
         System.out.println(x[i]);
     }
        temp=x;
        temp[2]=10;
     for(int i=0;i<temp.length;i++){
         System.out.println(temp[i]);//输出1,2,10.
         //说明第三个值已经被修改，而之前两个数值则是引用x的
        }
    }
    public static void ArrayChuShiHua(){
        //静态初始化数组，简化格式
        int[] a1= {1,2,3,4,5,6,7};
        System.out.println(a1.length);
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
        //静态初始化数组，完整格式
        int[] a2=new int[]{9,8,7,6,5,4};
        System.out.println(a2.length);
        for(int i=0;i<a2.length;i++){
            System.out.println(a2[i]);
        }
    }
    public static void ArrayErWei(){
           //动态初始化
           int[][] a2=new int[3][2];
           System.out.println(a2.length);
           //静态初始化
           int[][] a3= new int[][]{{1,2},{1,2,3,4,5,6}};
           //输出二维数组
           for(int i=0;i<a3.length;i++){
               for(int j=0;j<a3[i].length;j++){
                   System.out.println("a3["+i+"]["+j+"]="+a3[i][j]+",");
               }
           }
    }
}
