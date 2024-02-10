package Tienda_Videojuegos;

public class Juego {
    private String name;
    private String gender;
    private Double price;
    public String platform;

    public Juego(String name,String gender,Double price, String platform){
        this.name = name;
        this.gender = gender;
        this.price = price;
        this.platform = platform.toUpperCase();
    }

    public String juegoProps(){
        return "Nombre: " + this.name +
        "\nGenero: " + this.gender + 
        "\nPrecio: " + this.price + 
        "\nPlataforma: " + this.platform + "\n";
    }
}
