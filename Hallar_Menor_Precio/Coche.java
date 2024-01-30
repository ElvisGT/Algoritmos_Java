public class Coche {
    private String model;
    private String color;
    private double price;

    Coche(String model,String color, Double price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public void setProperties(String model,String color,Double price){
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public String toString(){
        return "Modelo: " + this.model +
                "\nColor: " + this.color +
                "\nPrecio: " + this.price + "\n";
    }
    public static void main(String[] args){
        Coche coche1 = new Coche("Hundai","Negro",15000.0);
        Coche coche2 = new Coche("Toyota","Rojo",17000.0);
        Coche coche3 = new Coche("Mazda","Gris",56000.0);
        Coche coche4 = new Coche("Kia Picanto","Verde",11000.0);
        Coche coche5 = new Coche("Fiat","Amarillo",8000.0);


        double min_price = coche1.price;
        Coche min_car = coche1;

        Coche myCoches[] = {
                coche1,
                coche2,
                coche3,
                coche4,
                coche5
        };

        //Imprimiendo propiedades
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());
        System.out.println(coche4.toString());

        //Hallar el coche de menor precio
        for(Coche coche : myCoches){
            if( coche.price < min_price){
                min_price = coche.price;
                min_car = coche;
            }
        }

        //Imprimir coche de menor precio
        System.out.println("____________________");
        System.out.println("El coche de menor precio es: \n" + min_car);



    }
}
