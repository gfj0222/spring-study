package com.joker.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        hetong();
        fare();
        host.rent();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //收中介费
    public void hetong(){
        System.out.println("签租赁合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
