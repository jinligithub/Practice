// 星巴克咖啡冲泡法
// 1. 将水煮沸 2. 用沸水冲泡咖啡 3. 将咖啡倒进杯子 4. 加糖和牛奶

// 星巴克茶冲泡法
// 1. 将水煮沸 2. 用沸水浸泡茶叶 3. 把茶倒进杯子 4. 加柠檬

//第一步
// class Coffee{
//     void prepareRecipt(){
//         boliWater();
//         brewCoffee();
//         pourInCup();
//         addSugerAndMilk();
//     }
//     public void prepare(){
//         System.out.println("烧水 ");
//     }
//     public void brewCoffee(){
//         System.out.println("冲咖啡");
//     }
//     public void pourInCup(){
//         System.out.println("将咖啡导入杯中");
//     }
//     public void addSugerAndMilk(){
//         System.out.println("加入糖和牛奶");
//     }
// }
// class Tea{
//     void prepareRecipt(){
//         boilWater();
//         steedTea();
//         pourInCup();
//         addLemon();
//     }
//     public void boilWater(){
//         System.out.println("烧水");
//     }
//     public void steedTea(){
//         System.out.println("泡茶");
//     }
//     public void pourInCup(){
//         System.out.println("将tea倒入杯中");
//     }
//     public void addLemon(){
//         System.out.println("加入柠檬");
//     } 
// }

//第二步
abstract class CoffeeBeverage{//实现一个抽象类b
    final void prepareReceipt(){//默认权限default（可写可不写）
    boilWater();
    brew();
    pourInCup();
    addCondiments();//添加调料
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("烧水");
    }
    void pourInCup(){
        System.out.println("将饮料倒入杯中");
    }
}
class Coffee extends CoffeeBeverage{
    void brew(){
        System.out.println("冲咖啡");
    }
    void addCondiments(){
        System.out.println("加入糖和牛奶");
    }
}
class Tea extends CoffeeBeverage{ 
    void brew(){
        System.out.println("泡茶");
    }
    void addCondiments(){
        System.out.println("加入柠檬");
    } 
}
public class Mode{
    public static void main(String[] args){
        CoffeeBeverage tea= new Tea();
        CoffeeBeverage coffee=new Coffee();
        System.out.println("泡茶");
        tea.prepareReceipt();
        System.out.println("冲咖啡");
        coffee.prepareReceipt();
    }
}