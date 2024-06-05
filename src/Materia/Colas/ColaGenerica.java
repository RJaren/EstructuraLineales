package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Modesl.NodoGenerico;

public class ColaGenerica<T> {
    int tamano;
    private NodoGenerico<T> first;
    private NodoGenerico<T> last;

     public ColaGenerica(){

     }
     public ColaGenerica(NodoGenerico<T> first, NodoGenerico<T> last){
        this.first=first;
        this.last=last;
     } 
     public void addNode(T data){
        NodoGenerico<T> nuevNode= new NodoGenerico<>(data);
        if(isEmpty()){
            first= nuevNode;
            last= nuevNode;
        }else{
            last.next=nuevNode;
            last = nuevNode;
        }
        tamano++;
     }
     public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        T value = first.data;
        first=first.next;
        if (first==null){
            last=null;

        }
        tamano--;
        return value;
     }
     public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return first.data;
     }
     public boolean isEmpty(){
        return first==null;
     }
     public int size(){
        return tamano;
     }
}
