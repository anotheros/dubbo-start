package cn.mf.dubbo.provider.service;

import cn.mf.dubbo.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public void sayHello() {
        //删除 （）
        System.out.println("hello");
        //gengx
    }

    @Override
    public String sayWorld() {
//删除
        return "world";
    }

    @Override
    public String getStr() {
        //更新
        System.out.println("生产者打印");
        return "消费者打印";
    }

}
