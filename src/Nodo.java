/**
 * Created by Escrak on 15/11/2017.
 */
public class Nodo {
private int valor;
private Nodo proximo;// puntero hacia el siguiente  nodo
    // Constructor simple, inicializa sin valor
    public Nodo (){
        this.valor=0;
        this.proximo=null;
    }
    public Nodo
            (int valor){
        this.valor=valor;
        this.proximo=null;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setProx(Nodo siguiente){
        this.proximo=siguiente;
    }
    public int getvalor(){
        return this.valor;
    }
    public Nodo getProximo(){
        return this.proximo;
    }

}
