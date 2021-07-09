package co.com.example.clase4.vo;

import co.com.example.clase4.vo.Ajedrez.Caballo;
import co.com.example.clase4.vo.Ajedrez.Color;
import co.com.example.clase4.vo.Ajedrez.Tablero;
import co.com.example.clase4.vo.Ajedrez.Torre;

public class Main {

    public static void main(String[] args) {
    
        iniciarTablero();

        /*Integer movRey = 1;
        Integer otroRey = 1;


        var salida1 = t.hayEnroque(movRey);
        var salida2 = t.esJaque(otroRey);

        System.out.print( salida1 + "\n" + salida2);
        */
    }

    private static void iniciarTablero() {
        Tablero t = new Tablero();
        t.ubicarFicha (0,0, new Torre(Color.BLANCO));
        t.ubicarFicha (0,7, new Torre(Color.BLANCO));
        t.ubicarFicha (0,1, new Caballo(Color.BLANCO));
        t.ubicarFicha (0,6, new Caballo(Color.BLANCO));
        
    }

}
