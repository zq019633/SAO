package com.qzhou.sao.Bean;

import java.util.List;

public class Tab {
    private List<Tab_list> tab_list ;

    private int cur_tab;

    public void setTab_list(List<Tab_list> tab_list){
        this.tab_list = tab_list;
    }
    public List<Tab_list> getTab_list(){
        return this.tab_list;
    }
    public void setCur_tab(int cur_tab){
        this.cur_tab = cur_tab;
    }
    public int getCur_tab(){
        return this.cur_tab;
    }

}