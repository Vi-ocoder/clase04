package co.com.example.clase4.vo.Ajedrez;

public class Tablero {
    //<Atributos>
    /*
        private Integer movRey = 0;
        private Integer otroRey = 0;
      */
        private Casilla[][] casillas;

    //<Constructores>
    public Tablero(){
    casillas = new Casilla [8][8];
    for (int i = 0; i < casillas.length; i++) {
        
        for (int j = 0 ; j < casillas[i].length; j++){
            casillas [i] [j] = new Casilla (i , j);
    
            System.out.println(i + " , "+ j + " -> " + casillas[i][j]);  
            }
        }
    
    }
    //<Métodos>
    public void ubicarFicha(Integer fila, Integer columna, Ficha ficha){
        casillas[fila][columna].ubicarFicha(ficha);
    }
    /*
    public Boolean hayEnroque (Integer movRey){
        var enroque = (movRey == 0);
        return enroque;
    }
    
    public Boolean esJaque (Integer otroRey){
        var jaque = (otroRey == 1);
        return jaque;
    }

    public Boolean esJaqueMate (Integer otroRey){ //metodos de clase (estaticos) no necesita objeto para llamarse
        var jaque = (otroRey == 2);
        return jaque;
    }
    */
}

//estoy asignando los metodos a las clases, quiero imprimir el booleano