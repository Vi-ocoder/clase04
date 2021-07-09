package co.com.example.clase4.vo;

public class Main {

    public static void main(String[] args) {
    
        
        Tablero obj = new Tablero();
        Integer movRey = 1;
        Integer otroRey = 1;


        var salida1 = obj.hayEnroque(movRey);
        var salida2 = Tablero.esJaque(otroRey);

        System.out.print( salida1 + "\n" + salida2);
        
    }

}
