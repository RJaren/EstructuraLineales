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
    }

}
