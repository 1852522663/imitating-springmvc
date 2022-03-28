package com.heaboy;

import com.heaboy.mvc.HeaboyMvc;

import java.net.URL;

public class Main {
    static {
        String path = Main.class.getResource("").getPath();
        //获取所有路径
        String packageName = Main.class.getPackage().getName();
        //获取所有包名
        HeaboyMvc.scanner(path,packageName);
        //调用方法
    }

    public static void main(String[] args) {

        HeaboyMvc.exec("","");
        HeaboyMvc.exec("test","index1");
        HeaboyMvc.exec("test","");
        System.out.println("Hello World!");
    }
}
