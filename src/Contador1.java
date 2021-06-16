import java.util.*;

public class Contador1 {

    //Atributos
    private int contador;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contador1 contador1 = new Contador1(50);
        System.out.println("El valor del contador es: " + contador1.getContador());
        System.out.println("Para cambiar el valor ingresa un numero");
        contador1.setContador(Integer.parseInt(scan.nextLine()));
        contador1.incrementarContador();
        System.out.println("El contador aumentado es: " + contador1.getContador());
        contador1.decrementarContador();
        System.out.println("El contador decrementado es: " + contador1.getContador());

    }

    public Contador1(){
        contador = 0;
    }

    public Contador1(int contador){
        this.contador = contador;
    }

    public void incrementarContador(){
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
