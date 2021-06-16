import java.util.*;

public class Contador {
    private int contador;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Constructor Por Defecto");
        Contador cont = new Contador();
        System.out.println("El valor inicial del contador es: " + cont.getContador());
        System.out.println("Si quieres cambiar el valor del parametro ingresa un numero");
        cont.setContador(Integer.parseInt(scan.nextLine()));
        cont.aumentarContador();
        System.out.println("El contador aumentado es: " + cont.getContador());
        cont.decrementarContador();
        System.out.println("El contador decrementado es: " + cont.getContador());
        System.out.println("\nConstructor Con Parametros");
        Contador cont1 = new Contador(30);
        System.out.println("El valor inicial del contador es: " + cont1.getContador());
        System.out.println("Si quieres cambiar el valor del parametro ingresa un numero");
        cont1.setContador(Integer.parseInt(scan.nextLine()));
        cont1.aumentarContador();
        System.out.println("El contador aumentado es: " + cont1.getContador());
        cont1.decrementarContador();
        System.out.println("El contador decrementado es: " + cont1.getContador());

    }

    public Contador(){
        this.contador = 0;
    }

    public Contador(int contador){
        this.contador = contador;
    }

    public void aumentarContador(){
        contador++;
    }

    public void decrementarContador(){
        contador--;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
