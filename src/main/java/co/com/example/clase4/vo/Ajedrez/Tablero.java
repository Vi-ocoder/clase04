package co.com.example.clase4.vo.Ajedrez;

public class Tablero {
    //<Atributos>
    
        private Integer movRey = 0;
        private Integer otroRey = 0;
        
    //<Constructores>
    //<Métodos>
    
    public Boolean hayEnroque (Integer movRey){
        var enroque = (movRey == 0);
        return enroque;
    }
    
    public static Boolean esJaque (Integer otroRey){
        var jaque = (otroRey == 1);
        return jaque;
    }

    public Boolean esJaqueMate (Integer otroRey){ //metodos de clase (estaticos) no necesita objeto para llamarse
        var jaque = (otroRey == 2);
        return jaque;
    }
    
}

//estoy asignando los metodos a las clases, quiero imprimir el booleano