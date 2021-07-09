package co.com.example.clase4.vo.Ajedrez;

public abstract class Ficha implements  Móvil{
    //<Atributos>
    private Color color;
    
    //<Constructores>
    //<Métodos>
    public Boolean capturar() {
        int n = 1 ;
        var salida = (n == 1);
        return salida;
    }
    public abstract Boolean mover();
    }
}
    