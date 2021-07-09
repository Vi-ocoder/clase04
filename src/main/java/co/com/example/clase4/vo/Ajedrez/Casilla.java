package co.com.example.clase4.vo.Ajedrez;

public class Casilla {
    //<Atributos>
    private final Color color;
    private final Integer columna;
    private final Integer fila;
    private Ficha ficha;

    //<Constructores>
    public Casilla() {
        color = Color.BLANCO;
    }

    public Casilla(Integer columna, Integer fila) {
        this.columna = columna;
        this.fila = fila;

        this.color = (fila + columna)%2 == 0 ? Color.BLANCO : Color.NEGRO ;
    }

    //<Métodos>

    public Boolean ocupada() {
        return ficha != null;
        
    }
    public void ubicarFicha(Ficha ficha){
        this.ficha = ficha;
        this.ficha.setCasilla(this);
    }

    public Ficha obtenerFicha( Ficha ficha){
        return ficha;
    }

    public void retirarFicha(Ficha ficha){
        this.ficha = null;
    }

    @Override
    public String toString() {
        return "Casilla [color=" + color + ", fila=" + fila + ", columna=" + columna + ", ficha=" + ficha + "]";
    }

   /* @Override
    public String toString() {
        return "Casilla [Color, " + color +   ", fila=" + fila + ", columna=" + columna +  "]";
    }
*/
    
}
