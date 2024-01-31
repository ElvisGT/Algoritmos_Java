package com.pc;
import java.util.Scanner;

public class PC {
    private String marca;
    private double ram;
    private double cpu;

    PC(String marca,double ram,double cpu){
        this.cpu = cpu;
        this.marca = marca;
        this.ram = ram;
    }
    public String getInfo(){
        return "Marca: " + this.marca +
               "\nRam: " + this.ram +
               "\nCpu: " + this.cpu;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String marca;
        double ram,cpu;
        boolean gamer,work;


        //PC
        System.out.println("Que propiedades tiene tu pc estandar");
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        System.out.print("Ram: ");
        ram = scanner.nextDouble();
        System.out.print("Cpu: ");
        cpu = scanner.nextDouble();
        scanner.nextLine();

        PC pc = new PC(marca,ram,cpu);

        //PcGamer
        System.out.println("Que propiedades tiene tu pc gamer");
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Ram: ");
        ram = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cpu: ");
        cpu = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Gamer: ");
        gamer = scanner.nextBoolean();
        scanner.nextLine();

        PcGamer pcGamer = new PcGamer(marca,ram,cpu,gamer);

        //PcWork
        System.out.println("Que propiedades tiene tu pc de trabajo");
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        System.out.print("Ram: ");
        ram = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cpu: ");
        cpu = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Work: ");
        work = scanner.nextBoolean();
        scanner.nextLine();

        PcWork pcWork = new PcWork(marca,ram,cpu,work);

        PC[] computers = new PC[3];
        computers[0] = pc;
        computers[1] = pcGamer;
        computers[2] = pcWork;

        //Mostrando datos
        for(PC computer:computers){
            System.out.println("\n");
            System.out.println(computer.getInfo());
        }



    }
}
