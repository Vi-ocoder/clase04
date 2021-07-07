package co.com.example.clase4.vo;

public abstract class Ficha {
    //<Atributos>
    private String color;
    
    //<Constructores>
    //<Métodos>
    private Boolean Comer() {
        int n = 1 ;
        var salida = (n == 1);
        return salida;
    }
    public abstract void Mover();
}
    