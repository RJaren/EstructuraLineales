package Materia.PIlas;

import java.util.EmptyStackException;

import Materia.Modesl.Node;

public class Pila {
    private Node top;

    public Pila() {
        top = null;
    }

    // Push: Agregar el elemento a la pila
    public void Push(int value) {
        Node nuevNode = new Node(value);
        nuevNode.next = top;
        top = nuevNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("La pila está vacia");
            throw new EmptyStackException();
        } else {
            int value = top.value;
            top = top.next;
            return value;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("La pila está vacia");
            throw new EmptyStackException();
        }
        return top.value;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
