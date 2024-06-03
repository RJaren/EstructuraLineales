package Materia.PIlas;

import java.util.EmptyStackException;

import Materia.Modesl.NodoGenerico;

public class PilaGenerica<T> {

    private NodoGenerico<T> top;

    public PilaGenerica() {
        top = null;
    }
    public void Push(T dato){
        NodoGenerico<T> nuevoNodo= new NodoGenerico<T>(dato);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }
    public boolean isEmpty(){
        return top==null;
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("La pila está vacia");
            throw new EmptyStackException();
        }
        T data = top.data;
        top= top.next;
        return data;
    }
    public T peek(){
        if (isEmpty()){
            System.out.println("La pila está vacia");
            throw new EmptyStackException();
        }
        return top.data;
    }
}
