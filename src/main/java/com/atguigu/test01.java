package com.atguigu;

public class test01 {

    /*
    * 通过一个整体对象来实现函数，(a,b) -> a+b;就是一个对象
    * 位置可以发生变化，哪里想要就在哪里建立，可以进行传递到不同的类中使用
     * */
    lambda lam = (a,b) -> a+b;


}
//创建接口就是为了接收函数对象，同时通过接口使用，同时接口只能有一个方法定义
interface lambda{
    int calc(int a, int b);
}
class lam{
    private int a = 1;
    private int b = 2;
    public int calc(lambda method){
        //这个类并不知道该用什么进行计算 ——》 通过传入的计算规则/函数进行计算，若是平常的一些方法无法传入
        //但是函数对象可以直接传入使用，想去哪就去哪
        return method.calc(a,b);
    }
}

class test{
    /*
    * 位置固定，调用使用类来调用
    * */
    public int calculate(int a , int b){
        return a+b;
    }
}