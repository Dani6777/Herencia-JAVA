package cl.aiep;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al zoológico de AIEP");

        // Crear un objeto de la clase Mamifero
        Mamifero mamifero = new Mamifero( "Garfield", 4, "Felino");
        mamifero.print();
        mamifero.amamantar();
        mamifero.comer();
        mamifero.dormir();

        // Crear un objeto de la clase Ave
        Ave ave = new Ave( "Piolín", 2, "Canario");
        ave.print();
        ave.comer();
        ave.dormir();
        ave.volar();

        // Crear un objeto de la clase Reptil
        Reptil reptil = new Reptil( "Godzilla", 100, "Lagarto");
        reptil.print();
        reptil.comer();
        reptil.dormir();
        reptil.mudarPiel();

    }
}