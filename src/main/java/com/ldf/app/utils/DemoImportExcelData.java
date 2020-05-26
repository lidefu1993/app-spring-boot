package com.ldf.app.utils;


/**
 * @author lidefu
 * @date 2020年05月18日19:05
 **/
public class DemoImportExcelData {

    private String name;
    private String msg;

    public DemoImportExcelData ofName(String name){
        this.name = name == null ? "" : name;
        return this;
    }

    public DemoImportExcelData ofMsg(String name){
        this.msg = msg == null ? "" : msg;
        return this;
    }

}
