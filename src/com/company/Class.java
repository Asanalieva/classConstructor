package com.company;

public class Class {
    private int number;
    private String soz;
    private int[] san;

    public Class(){

    }
    public Class(int number,String soz,int[] san){
        this.number = number;
        this.soz = soz;
        this.san = san;
    }


    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getSoz(){
        return soz;
    }
    public void setSoz(String soz){
        this.soz = soz;
    }
    public int[] getSan(){
        return san;
    }
    public void setSan(int[] san){
        this.san = san;
    }


}
