package Tienda_Videojuegos;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Juego> pc;
    private ArrayList<Juego> xbox;
    private ArrayList<Juego> ps5;
    private int stockTotal;

    Inventario(){
        this.pc = new ArrayList<>();
        this.xbox = new ArrayList<>();
        this.ps5 = new ArrayList<>();

    }

    public void add_pc(Juego juego){
        this.pc.add(juego);
    }
    public void add_xbox(Juego juego){
        this.xbox.add(juego);
    } 
    public void add_ps5(Juego juego){
        this.ps5.add(juego);
    }

    public ArrayList<Juego> get_pc(){
        return this.pc;
    }

    public ArrayList<Juego> get_xbox(){
        return this.xbox;
    }

    public ArrayList<Juego> get_ps5(){
        return this.ps5;
    }

    public int get_stock(){
        this.stockTotal = this.pc.size() + this.ps5.size() + this.xbox.size();
        return this.stockTotal;
    }
}
