package co.com.example.clase4.vo.Ajedrez;

public class Tablero {
    //<Atributos>
    /*
        private Integer movRey = 0;
        private Integer otroRey = 0;
      */
        private Casilla[] casillas;

    //<Constructores>
    public Tablero(){
    casillas = new Casilla [64];
    for (int i = 0; i < casillas.length; i++) {
        casillas [i] = new Casilla (i / 8 , i % 8);

        System.out.println(i + " -> " + casillas[i]);  
        }
    
    }
    //<Métodos>
    public void ubicarFicha(Integer fila, Integer columna, Ficha ficha){
        casillas[8 * fila + columna].ubicarFicha(ficha);
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