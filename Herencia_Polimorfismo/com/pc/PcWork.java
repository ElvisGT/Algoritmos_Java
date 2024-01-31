package com.pc;

public class PcWork extends PC{
    private boolean work;

    PcWork(String marca, double ram,double cpu, boolean work){
        super(marca,ram,cpu);
        this.work = work;
    }

    public String getInfo(){
        return super.getInfo() + "\nWork: " + this.work;
    }

}
