package com.joker.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;


//等会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;
    //被代理的接口
    public void setRent(Rent rent){
        this.rent = rent;
    }
    //生成得到代理类
    public Object getProxy(){
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }


    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
