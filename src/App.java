import java.util.Stack;

import javax.xml.validation.Validator;

import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorte;
import Ejercicio_03_linkedLists.LinkedListEjr;
import Materia.Colas.Cola;
import Materia.Colas.ColaGenerica;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Modesl.Pantalla;
import Materia.PIlas.Pila;
import Materia.PIlas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pila pila  = new Pila();
        pila.Push(10);
        pila.Push(20);
        pila.Push(30);
        pila.Push(40);

        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+ pila.pop());
        System.out.println("Elemento en la cima de la pila es: " + pila.peek());
        

        System.out.println();
        ////// Implemento de la pila generica
        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.Push(new Pantalla("Home Page", "/Home"));
        pilaPantallas.Push(new Pantalla("Home Page", "/Home/Menu"));
        pilaPantallas.Push(new Pantalla("Settings Page", "/Home/Menu/Settings"));
        System.out.println("Estoy en la pantalla:\n\t " + pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t "+ pilaPantallas.pop().getNombre());
        pilaPantallas.Push(new Pantalla("User Page", "/Home/Menu/User"));
        System.out.println("Estoy en la pantalla:\n\t " + pilaPantallas.peek().getNombre());
        

        Cola queue = new Cola();

        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);


        System.out.println("Elemento en el frente: "+ queue.peek());//10
        

        //Retirar elemento de la cola
        System.out.println("Elemento retirado: "+ queue.remove());//10
        System.out.println("Elemento en el frente: "+ queue.peek());//20
        
        System.out.println("Elmento retirado: "+ queue.remove());//20
        System.out.println("Elmento en el frente: "+ queue.peek());//30

        //Verificar si la pila está vacía
        System.out.println("¿Cola vacía?: "+ (queue.isEmpty() ? "Si" : "No")); //False

        //ColaGenrica
        ColaGenerica<Pantalla> queueGeneric = new ColaGenerica<>();
        queueGeneric.addNode(new Pantalla("Home Page", "/Home"));
        queueGeneric.addNode(new Pantalla("Menu Page", "/Home /Menu"));
        queueGeneric.addNode(new Pantalla("Settings", "/Home/Menu/Settings"));
        System.out.println("La cola tiene "+ queueGeneric.size()+" elementos");
        System.out.println("Estoy en la pantalla\t"+
                        queueGeneric.peek().getNombre());
        System.out.println("Pantalla Destruida\t"+
                        queueGeneric.remove().getNombre());
        queueGeneric.addNode(new Pantalla("User Page", "/Home/Menu/User"));
        System.out.println("Estoy en la pantalla\t"+
                        queueGeneric.peek().getNombre());
        System.out.println("Pantalla Destruida\t" +
                        queueGeneric.remove().getNombre());
        System.out.println("Pantalla Destruida\t"+
                        queueGeneric.remove().getNombre());
        System.out.println("Estoy en la pantalla\t"+
                        queueGeneric.peek().getNombre());;

        System.out.println("La cola tiene "+ queueGeneric.size()+" Elementos");
        System.out.println("");

        //SingValidator
        SignValidator validator = new SignValidator();
        System.out.println(validator.isValid("()"));
        

        StackSorte sorte = new StackSorte();
        Stack<Integer> stack = new Stack<>();
        
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        
        System.out.println("Stack: " + stack);
        
        sorte.sortStack(stack);
        
        System.out.println("Stack ordenado: " + stack);
    
    
    
    
    
    
    
        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();
    
        ListaEnlazada linkedList = new ListaEnlazada();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.addNode(7);

    
        
    }


}
