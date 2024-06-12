package Ejercicio_03_linkedLists;


import Materia.Modesl.*;
public class LinkedListEjr {
    private Node head;
   
    public int getByPos(int position){
        Node current = head;
        int count = 0;
        while (current!= null) {
            if (count == position) {
                return current.value;
            }
            count++;
            current = current.next;
        }
        return -1;
    }
}
