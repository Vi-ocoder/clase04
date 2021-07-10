package co.com.example.clase4.vo;

import co.com.example.clase4.vo.Ajedrez.Alfil;
import co.com.example.clase4.vo.Ajedrez.Caballo;
import co.com.example.clase4.vo.Ajedrez.Color;
import co.com.example.clase4.vo.Ajedrez.Ficha;
import co.com.example.clase4.vo.Ajedrez.Peon;
import co.com.example.clase4.vo.Ajedrez.Reina;
import co.com.example.clase4.vo.Ajedrez.Rey;
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
        t.ubicarFicha (0,2, new Alfil(Color.BLANCO));
        t.ubicarFicha (0,5, new Alfil(Color.BLANCO));
        t.ubicarFicha (0,3, new Reina(Color.BLANCO));
        t.ubicarFicha (0,4, new Rey(Color.BLANCO));
        
        for (int i = 0; i < 8; i++) {
        t.ubicarFicha (0,i, new Peon(Color.BLANCO));    
        }
        

        //Falta agregar las otras fichas
    }

}
