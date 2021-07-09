package co.com.example.clase4.vo.Ajedrez;

public abstract class Ficha implements  Móvil{
    //<Atributos>
    private final Color color;
    private Casilla casilla;

    //<Constructores>
    public Ficha(Color color) {
        this.color = color;
    }

    

    public Casilla getCasilla() {
        return casilla;
    }



    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }



    //<Métodos>
    public Boolean capturar() {
        int n = 1 ;
        var salida = (n == 1);
        return salida;
    }
    
    public abstract Boolean mover();



    @Override
    public String toString() {
        return "Ficha [color=" + color + "]";
    }

    

}

    