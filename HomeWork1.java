import java.util.Scanner;

public class HomeWork1{

    public static void main(String[]  args){
      SData();
    }
    public static void SData(){
        int[] data= new int[]{78,56,98,12,36,45,82,31,64,93};
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
    }
    public static void QuickTest(){
        int[] a= new int[] {88,54,21,36,99,45,87,66};
        int start=0;
        int end=a.length-1;
        QuickSort(a,start,end);
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void QuickSort(int[] a,int low,int high){
        int start=low;//定义开始的位置
        int end=high;//定义结束的位置
        int key=a[high];//定义关键数字，比他大的放在他的前边，比他小的放在他的后边
        while(start<end){
            while(start<end&&a[end]>key){//找小
                end--;
            }
            while(start<end&&a[start]<key){//找大
                start++;
            }
            int temp=a[start];//把找到的最大和最小值交换
            a[start]=a[end];
            a[end]=temp;
        } 
        if(start>low){
            QuickSort(a,low,start-1);
        }
        if(end<high){
            QuickSort(a,end+1,high);
        }
    }
    public static void XXX(){
        //九九乘法表
        int i=0;
        int j=0;
        for(i=1;i<10;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public static  void YYY(){
        //递归实现60！
        System.out.println(Recrusion(60));
    }
    public static int Recrusion(int x){
        if(x==1){
            return 1;
        }else{
            return x+Recrusion(x-1);
        }
    }
}
 