package com.qzhou.sao.Bean;

import java.util.List;

public class Display {
    private List<Hits> hits ;

    private int abtest;

    private int fromIndex;

    private Headers headers;

    private int statusCodeValue;

    private int hitCount;

    private String query;

    private int total;

    private String statusCode;

    public void setHits(List<Hits> hits){
        this.hits = hits;
    }
    public List<Hits> getHits(){
        return this.hits;
    }
    public void setAbtest(int abtest){
        this.abtest = abtest;
    }
    public int getAbtest(){
        return this.abtest;
    }
    public void setFromIndex(int fromIndex){
        this.fromIndex = fromIndex;
    }
    public int getFromIndex(){
        return this.fromIndex;
    }
    public void setHeaders(Headers headers){
        this.headers = headers;
    }
    public Headers getHeaders(){
        return this.headers;
    }
    public void setStatusCodeValue(int statusCodeValue){
        this.statusCodeValue = statusCodeValue;
    }
    public int getStatusCodeValue(){
        return this.statusCodeValue;
    }
    public void setHitCount(int hitCount){
        this.hitCount = hitCount;
    }
    public int getHitCount(){
        return this.hitCount;
    }
    public void setQuery(String query){
        this.query = query;
    }
    public String getQuery(){
        return this.query;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return this.total;
    }
    public void setStatusCode(String statusCode){
        this.statusCode = statusCode;
    }
    public String getStatusCode(){
        return this.statusCode;
    }

}