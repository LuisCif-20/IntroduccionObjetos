package src;
import java.util.*;

public class Fraccion {
    
    //Atributos
    private double denominador1;
    private double numerador1;
    private double denominador2;
    private double numerador2;
    private String resultado;


    //public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // System.out.println("Ingrese el numerador y denominador de la primera fraccion");
       // double num1 = (double)Integer.parseInt(scan.nextLine()); 
       // double den1 = (double)Integer.parseInt(scan.nextLine());
       // System.out.println("Ingrese el numerador y denominador de la segunda fraccion");
       // double num2 = (double)Integer.parseInt(scan.nextLine()); 
       // double den2 = (double)Integer.parseInt(scan.nextLine());
       // Fraccion fraccion = new Fraccion(num1, den1, num2, den2);
       /// fraccion.sumarFraccion();
        //System.out.println(fraccion.getResultado());
       // fraccion.restarFraccion();
      //  System.out.println(fraccion.getResultado());
       // fraccion.multiplicarFraccion();
       // System.out.println(fraccion.getResultado());
      //  fraccion.dividirFraccion();
       // System.out.println(fraccion.getResultado());

   // }

    public Fraccion(double numerador, double denominador, double numerador2, double denominador2){
        this.numerador1 = numerador;
        this.denominador1 = denominador;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    public void sumarFraccion(){
        double denominadorsuma = numerador1*numerador2;
        double parte1 = (denominadorsuma/denominador1)*numerador1;
        double parte2 = (denominadorsuma/denominador2)*numerador2;
        resultado = "El resultado de la suma es: " + (parte1+parte2)+"/" + denominadorsuma ;
    }

    public void restarFraccion(){
        double denominadorsuma = numerador1*numerador2;
        double parte1 = (denominadorsuma/denominador1)*numerador1;
        double parte2 = (denominadorsuma/denominador2)*numerador2;
        resultado = "El resultado de la resta es: " + (parte1-parte2)+"/" + denominadorsuma ;;
    }

    public void multiplicarFraccion(){
        double denominador = denominador1*denominador2;
        double numerador = numerador1*numerador2;
        resultado = "El resutado de la multiplicacion es: " + numerador +"/" + denominador;
    }

    public void dividirFraccion(){
        double denominador = denominador1*numerador2;
        double numerador = numerador1*denominador2;
        resultado = "El resutado de la division es: " + numerador +"/" + denominador; 
    }

    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setDenominador1(double denominador1) {
        this.denominador1 = denominador1;
    }
    public void setDenominador2(double denominador2) {
        this.denominador2 = denominador2;
    }
    public void setNumerador1(double numerador1) {
        this.numerador1 = numerador1;
    }
    public void setNumerador2(double numerador2) {
        this.numerador2 = numerador2;
    }
    public double getDenominador1() {
        return denominador1;
    }
    public double getDenominador2() {
        return denominador2;
    }
    public double getNumerador1() {
        return numerador1;
    }
    public double getNumerador2() {
        return numerador2;
    }
}
