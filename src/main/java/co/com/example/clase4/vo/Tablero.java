package co.com.example.clase4.vo;

public class Tablero {
    //<Atributos>
    
        private Integer movRey = 0;
        private Integer otroRey = 0;
        
    //<Constructores>
    //<Métodos>
    
    private Boolean hayEnroque (Integer movRey){
        var enroque = (movRey == 0);
        return enroque;
    }
    
    private Boolean esJaque (Integer otroRey){
        var jaque = (otroRey == 1);
        return jaque;
    }

    private Boolean esJaqueMate (Integer otroRey){
        var jaque = (otroRey == 2);
        return jaque;
    }
    var salida1 = hayEnroque(movRey);

    System.out.println(salida1);
}

//estoy asignando los metodos a las clases, quiero imprimir el booleano