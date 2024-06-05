package Materia.Colas;

import java.util.NoSuchElementException;

import Materia.Modesl.Node;


public class Cola {
    private Node first;
    private Node last;
    public Cola(){
        
    }
    public Cola(Node first, Node last){
        this.first=null;
        this.last=null;
    }
    public void addNode(int value){
        Node nuevNode= new Node(value);
        if (isEmpty()){
            first = nuevNode;
            last = nuevNode;
        }else{
            last.next=nuevNode;
            last = nuevNode;
        }
    }
    public int remove (){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int value=first.value;
        first = first.next;
        if (first==null){
            last=null;
        }
        return value;
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola está vacia"); 
        }
        return first.value;
    }
    public boolean isEmpty(){
        return first==null;
    }
}
