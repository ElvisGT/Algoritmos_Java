package com.pc;

public class PcGamer extends PC{
    private boolean gamer;

    PcGamer(String marca, double ram,double cpu, boolean gamer){
        super(marca,ram,cpu);
        this.gamer = gamer;
    }

    public String getInfo(){
        return super.getInfo() + "\nGamer: " + this.gamer;
    }

}
