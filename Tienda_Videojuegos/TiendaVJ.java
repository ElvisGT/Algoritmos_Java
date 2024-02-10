package Tienda_Videojuegos;

public class TiendaVJ {
    public static void main(String[] args){
        Juego juego1 = new Juego("GTA", "Accion", 30.0, "PC");
        Juego juego2 = new Juego("Fifa", "Deporte", 10.0, "PS5");
        Juego juego3 = new Juego("Far cry 6", "Accion", 20.0, "Xbox");
        Juego juego4 = new Juego("Avatar", "Aventura", 40.0, "PC");
        Juego juego5 = new Juego("UFC", "Deporte", 50.0, "ps5");

        //Arreglo de juegos
        Juego juegos[] = {juego1,juego2,juego3,juego4,juego5};

        //Inventario
        Inventario inventario = new Inventario();

        //Agregando juegos
        for(int i = 0;i < juegos.length;i++){
            if(juegos[i].platform.equals("PC")){
                inventario.add_pc(juegos[i]);
            }
            else if(juegos[i].platform.equals("XBOX")){
                inventario.add_xbox(juegos[i]);
            }
            else if(juegos[i].platform.equals("PS5")){
                inventario.add_ps5(juegos[i]);
            }
        }

        //Mostrando juegos PC
        for(Juego juego : inventario.get_pc()){
            System.out.println(juego.juegoProps());
        }

         //Mostrando juegos XBOX
         for(Juego juego : inventario.get_xbox()){
            System.out.println(juego.juegoProps());
        }

         //Mostrando juegos PS5
         for(Juego juego : inventario.get_ps5()){
            System.out.println(juego.juegoProps());
        }

        //Stock total de la tienda
        System.out.println("El stock total en tienda es de : " + inventario.get_stock() + " juegos");

    }
}
