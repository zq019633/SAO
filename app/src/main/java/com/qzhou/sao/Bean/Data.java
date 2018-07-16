package com.qzhou.sao.Bean;

import java.util.List;

public class Data {
    private int cell_type;

    private Key_info key_info;

    private Keyinfo keyinfo;

    private Display display;

    private List<String> tokens ;

    private String id_str;

    private String ala_src;

    private double id;

    public void setCell_type(int cell_type){
        this.cell_type = cell_type;
    }
    public int getCell_type(){
        return this.cell_type;
    }
    public void setKey_info(Key_info key_info){
        this.key_info = key_info;
    }
    public Key_info getKey_info(){
        return this.key_info;
    }
    public void setKeyinfo(Keyinfo keyinfo){
        this.keyinfo = keyinfo;
    }
    public Keyinfo getKeyinfo(){
        return this.keyinfo;
    }
    public void setDisplay(Display display){
        this.display = display;
    }
    public Display getDisplay(){
        return this.display;
    }
    public void setString(List<String> tokens){
        this.tokens = tokens;
    }
    public List<String> getString(){
        return this.tokens;
    }
    public void setId_str(String id_str){
        this.id_str = id_str;
    }
    public String getId_str(){
        return this.id_str;
    }
    public void setAla_src(String ala_src){
        this.ala_src = ala_src;
    }
    public String getAla_src(){
        return this.ala_src;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}